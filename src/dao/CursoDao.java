package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Curso;

public class CursoDao {
	private DaoHelper daoHelper;
	
	public CursoDao() {
		this.daoHelper = new DaoHelper();
	}
	
	public void inserirCurso(Curso curso) {
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO curso(nivel, regime, idInstituicao, idUsuario, nomeCurso, qtdPeriodos, cidade) VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, curso.getNivel().getNomeDoNivel());
			stmt.setString(2, curso.getRegime().getNomeRegime());
			stmt.setInt(3, curso.getIdInstituicao());
			stmt.setInt(4, curso.getIdUsuario());
			stmt.setString(5, curso.getNomeCurso());
			stmt.setInt(6, curso.getQtdPeriodos());
			stmt.setString(7, curso.getCidade());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
		    rs.next();
		    curso.setIdCurso(rs.getInt(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
