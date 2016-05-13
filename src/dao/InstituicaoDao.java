package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Instituicao;

public class InstituicaoDao {
	private DaoManager daoManager;
	
	public InstituicaoDao() {
		this.setDaoManager(new DaoManager());
	}

	public void setDaoManager(DaoManager daoManager) {
		this.daoManager = daoManager;
	}
	
	public void inserirInstituicao(Instituicao instituicao) {
		
		Connection conn = null;
		try {
			conn = daoManager.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String sql = "INSERT INTO instituicao VALUES(? ,?, )";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(2, instituicao.getNomeInstituicao());
			stmt.setString(3, instituicao.getNomeCidade());
			stmt.executeQuery();
			ResultSet keys = stmt.getGeneratedKeys();
			keys.next();
			instituicao.setIdINstituicao(keys.getInt(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
