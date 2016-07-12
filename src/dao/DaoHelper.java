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
	String nomeBancoDados = "lacroix.db";
	String urlConnection;

	public DaoHelper() {
		this.urlConnection = "jdbc:sqlite:" + nomeBancoDados;
	}

	public Connection getConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			return DriverManager.getConnection(urlConnection);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void release(PreparedStatement stmt) throws SQLException {
		if (stmt != null && !stmt.isClosed())
			try {
				stmt.close();
				stmt = null;
			} catch (SQLException ex) {
				Logger.getLogger(DaoHelper.class.getName()).log(Level.SEVERE, null, ex);
			}
	}

	public void release(Connection conn) throws SQLException {
		if (conn != null && !conn.isClosed())
			try {
				conn.close();
				conn = null;
			} catch (SQLException ex) {
				Logger.getLogger(DaoHelper.class.getName()).log(Level.SEVERE, null, ex);
			}
	}

	public void release(ResultSet rs) throws SQLException {
		if (rs != null && !rs.isClosed())
			try {
				rs.close();
			} catch (SQLException ex) {
				Logger.getLogger(DaoHelper.class.getName()).log(Level.SEVERE, null, ex);
			}
	}

	public void releaseAll(PreparedStatement stmt, Connection conn) throws SQLException {
		release(stmt);
		release(conn);
	}

	public void releaseAll(ResultSet rs, PreparedStatement stmt, Connection conn) throws SQLException {
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

	public boolean checkDBExists() {
		try {
			Connection conn = DriverManager.getConnection(urlConnection);
			PreparedStatement stmt = conn
					.prepareStatement("select name from sqlite_master where type='table' and name='usuario'");
			return stmt.executeQuery().next();
		} catch (Exception e) {
			return false;
		}
	}

	public void createDatabase() {
		List<String> linhas = new ArrayList<>();
		Statement stmt = null;
		Connection conn;
		try {
			linhas = Files.readAllLines(Paths.get("src/dao/banco.sql"));
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo de Banco de Dados");
			e.printStackTrace();
		}
		String sql = "";
		for (String l : linhas) {
			sql = sql.concat(l);
		}

		try {
			conn = DriverManager.getConnection(urlConnection);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			release(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
