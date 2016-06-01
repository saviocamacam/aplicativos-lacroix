package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Instituicao;

public class InstituicaoDao {
	private DaoHelper daoHelper;
	
	public InstituicaoDao() {
		this.daoHelper = new DaoHelper();
	}

	public void inserirInstituicao(Instituicao instituicao) {
		
		Connection conn = daoHelper.getConnection();
		
        String sql = "INSERT INTO instituicao (nomeinstituicao, cidade) VALUES(? ,?)";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);	
			stmt.setString(1, instituicao.getNomeInstituicao());
			stmt.setString(2, instituicao.getNomeCidade());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
		    rs.next();
		    instituicao.setIdInstituicao(rs.getInt(1));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
