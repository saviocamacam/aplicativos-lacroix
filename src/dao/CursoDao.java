package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Curso;

public class CursoDao {
	private DaoHelper daoHelper;
	
	public CursoDao() {
		
	}
	
public void inserirCurso(Curso curso) {
		
		Connection conn = null;
		try {
			conn = daoHelper.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        String sql = "INSERT INTO curso (nomeinstituicao, cidade) VALUES(? ,?) RETURNING 'idinstituicao'";
	}

}
