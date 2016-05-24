package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Instituicao;

public class InstituicaoDao {
	private DaoHelper daoHelper;
	
	public InstituicaoDao() {
		this.daoHelper = new DaoHelper();
	}

	public void inserirInstituicao(Instituicao instituicao) {
		
		Connection conn = daoHelper.getConnection();
		
        String sql = "INSERT INTO instituicao (nomeinstituicao, cidade) VALUES(? ,?) RETURNING 'idinstituicao'";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql);	
			stmt.setString(1, instituicao.getNomeInstituicao());
			stmt.setString(2, instituicao.getNomeCidade());
			stmt.executeQuery();
			
			ResultSet keys = stmt.getGeneratedKeys();
			while(keys.next()) {
				instituicao.setIdINstituicao(keys.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
