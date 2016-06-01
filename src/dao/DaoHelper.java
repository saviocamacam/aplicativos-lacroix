package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoHelper {
	String host = "localhost";
	String port = "5432";
	String nomeBancoDados = "lacroixdb";
	String urlConnection;
	private String user = "postgres";
	private String password = "pass@gen";
	
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
}
