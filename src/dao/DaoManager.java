package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoManager {
	String host = "localhost";
	String port = "3306";
	String nomeBancoDados = "lacroixdb";
	String urlConnection;
	Connection conexao;
	
	public DaoManager(){
		this.urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + verifyDataBaseExists();
		//conexao = new Con
	}
	
	private boolean verifyDataBaseExists() {
		try {
			ResultSet rs = conexao.getMetaData().getCatalogs();
			while(rs.next()) {
				if(rs.getString(1).equals(nomeBancoDados)) {
					return true;
				}
			}
			rs.close();
		} catch (SQLException e) {
			System.err.println("Erro ao pegar os nomes do banco de dados!");
			e.printStackTrace();
		}
		return false;
	}

	public Connection getConnection() throws SQLException{
        try {
           return DriverManager.getConnection(urlConnection, "postgres", "pass@gen");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
   }
}
