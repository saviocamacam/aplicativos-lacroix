package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Materia;

public class MateriaDao {
	private DaoHelper daohelper;
	public MateriaDao() {
		this.daohelper = new DaoHelper();
	}
	
	public void inserirMateria(Materia materia) {
		Connection conn = daohelper.getConnection();
		String sql = "INSERT INTO materia(idCurso, nomeMateria, periodoAssociado) VALUES(?, ?, ?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, materia.getIdCurso());
			stmt.setString(2, materia.getNomeMateria());
			stmt.setInt(3, materia.getPeriodoAssociado());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			materia.setIdMateria(rs.getInt(1));
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public Materia getMateria(int idMateria) {
		Materia materia = null;
		Connection conn = daohelper.getConnection();
		String sql = "SELECT * FROM materia WHERE materia.idMateria = " + idMateria;
		
		try {
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return materia;
	}

}
