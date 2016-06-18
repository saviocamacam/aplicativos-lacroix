package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Materia;
import model.Periodo;
import model.Professor;

public class MateriaPeriodo {
	private static DaoHelper daoHelper;
	public MateriaPeriodo() {
		MateriaPeriodo.daoHelper = new DaoHelper();
	}
	
	public static void inserirProfessorMateria(Professor professor, Materia materia) {
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO professorMateria(idProfessor, idMateria) VALUES (?,?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, professor.getIdProfessor());
			stmt.setInt(2, materia.getIdMateria());
			stmt.executeUpdate();
			
			daoHelper.releaseAll(stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void inserirProfessorPeriodo(Professor professor, Periodo periodo) {
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO professorPeriodo(idProfessor, idPeriodo) VALUES (?,?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, professor.getIdProfessor());
			stmt.setInt(2, periodo.getIdPeriodo());
			stmt.executeUpdate();
			
			daoHelper.releaseAll(stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void inserirMateriaPeriodo(Materia materia, Periodo periodo) {
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO materiaPeriodo(idMateria, idPeriodo, nota, estadoMateria) VALUES (?, ?, ?, ?)";
		
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, materia.getIdMateria());
			stmt.setInt(2, periodo.getIdPeriodo());
			stmt.setFloat(3, materia.getNota());
			stmt.setString(4, materia.getEstado().getNomeEstado());
			
			daoHelper.releaseAll(stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
