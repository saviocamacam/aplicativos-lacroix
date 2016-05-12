package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoManager {
	String host = "localhost";
	String port = "5432";
	String nomeBancoDados = "lacroixdb";
	String urlConnection;
	
	public DaoManager(){
		this.urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + nomeBancoDados;
	}
	
	public Connection getConnection() throws SQLException{
        try {
           return DriverManager.getConnection(urlConnection, "postgres", "pass@gen");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
   }
}
