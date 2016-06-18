package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Curso;
import model.Nivel;
import model.Periodo;
import model.Regime;
import model.Usuario;

public class CursoDao {
	private static DaoHelper daoHelper;
	
	public CursoDao() {
		CursoDao.daoHelper = new DaoHelper();
	}
	
	public static void inserirCurso(Curso curso) {
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO curso(nivel, regime, idInstituicao, idUsuario, nomeCurso, qtdPeriodos) VALUES(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, curso.getNivel().getNomeDoNivel());
			stmt.setString(2, curso.getRegime().getNomeRegime());
			stmt.setInt(3, curso.getIdInstituicao());
			stmt.setInt(4, curso.getIdUsuario());
			stmt.setString(5, curso.getNomeCurso());
			stmt.setInt(6, curso.getQtdPeriodos());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
		    rs.next();
		    curso.setIdCurso(rs.getInt(1));
		    stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	public static ArrayList<Curso> recuperarCurso(Usuario usuario) {
		ArrayList<Curso> listaCursos = null;
		Connection conn = daoHelper.getConnection();
		String sql = "SELECT * FROM curso WHERE curso.idUsuario = " + usuario.getId();
		
		try {
			listaCursos = new ArrayList<>();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Curso curso = new Curso(rs.getInt("idCurso"), rs.getInt("idInstituicao"), rs.getInt("idUsuario"), Nivel.valueOf(rs.getString("nivel")), Regime.valueOf(rs.getString("regime")), rs.getString("nomeCurso"), rs.getInt("qtdPeriodos"));
				ArrayList<Periodo> listaPeriodos = PeriodoDao.listaPeriodos(rs.getInt("idCurso"));
				curso.setPeriodos(listaPeriodos);
				listaCursos.add(curso);
			}
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaCursos;
	}
}
