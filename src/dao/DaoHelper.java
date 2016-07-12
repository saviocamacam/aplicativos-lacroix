package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoHelper {
	String host = "localhost";
	String port = "5432";
	String nomeBancoDados = "lacroixdb";
	String urlConnection;
	private String user = "postgres";
	private String password = "root";
	
	public DaoHelper(){
		this.urlConnection = "jdbc:postgresql://" + host + ":" + port + "/" + nomeBancoDados;
	}
	
	public Connection getConnection(){
        try {
           return DriverManager.getConnection(urlConnection, user, password);
        } catch (SQLException ex) {
        	throw new RuntimeException(ex);
        }
	}
	
	public void release( PreparedStatement stmt ) throws SQLException{
    	if( stmt != null && !stmt.isClosed())
    		try {
    			stmt.close();
    			stmt = null;
    		} catch (SQLException ex) {
    			Logger.getLogger(DaoHelper.class.getName()).log(Level.SEVERE, null, ex);
    		}	
    }
   
    public void release( Connection conn ) throws SQLException{
    	if( conn != null  && !conn.isClosed())
    		try {
    			conn.close();
    			conn = null;
    		} catch (SQLException ex) {
    			Logger.getLogger(DaoHelper.class.getName()).log(Level.SEVERE, null, ex);
    		}
    }
    
    public void release( ResultSet rs ) throws SQLException{
    	if( rs != null &&  !rs.isClosed())
    		try {
    			rs.close();
    		} catch (SQLException ex) {
    			Logger.getLogger(DaoHelper.class.getName()).log(Level.SEVERE, null, ex);
    		}
  	}
    
    public void releaseAll( PreparedStatement stmt, Connection conn ) throws SQLException{
    	release(stmt);
    	release(conn);
    }
     
    public void releaseAll( ResultSet rs, PreparedStatement stmt, Connection conn ) throws SQLException {
    	release(rs);
    	releaseAll(stmt, conn);
    }

	public void releaseAll(ResultSet rs, Statement stmt, Connection conn) {
		try {
			stmt.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean checkDBExists(){
		boolean retorno = false;
	    try{
	        Connection conn = DriverManager.getConnection(urlConnection, user, password);
	        retorno = true;
	    }
	    catch(Exception e){
	    	return false;
	    }
	    return retorno;
	}
	
	public void createDatabase() {
		List<String> linhas = new ArrayList<>();
		PreparedStatement stmt = null;
		Statement stmt2 = null;
		Connection conn;
		try {
			linhas = Files.readAllLines( Paths.get("src/dao/banco.sql"));
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo de Banco de Dados");
			e.printStackTrace();
		}
		String sql = "";
		for(String l : linhas) {
			sql = sql.concat(l);
		}
		try {
			Connection conn2 = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/", user, password);
			stmt2 = conn2.createStatement();
			String sqlCreate = "CREATE DATABASE " + nomeBancoDados;
      		stmt2.executeUpdate(sqlCreate);
			releaseAll(stmt, conn2);
			
			conn = DriverManager.getConnection(urlConnection, user, password);
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			releaseAll(stmt, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
