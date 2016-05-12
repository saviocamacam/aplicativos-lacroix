package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        String sql = "INSERT INTO jogador VALUES(? ,?, ?, ?, ?, ?)";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
