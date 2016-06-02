package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Professor;

public class ProfessorDao {
	private DaoHelper daoHelper;
	
	public ProfessorDao() {
		this.daoHelper = new DaoHelper();
	}
	
	public void inserirProfessor(Professor professor) {
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO professor(nomeProfessor, email) VALUES(?, ?)";
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, professor.getNomeProfessor());
			stmt.setString(2, professor.getEmail());
			stmt.executeQuery();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			professor.setIdProfessor(rs.getInt(1));
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Professor> getProfessores() {
		ArrayList<Professor> listaProfessores = null;
		Connection conn = daoHelper.getConnection();
		String sql = "SELECT * FROM professor";
		try {
			listaProfessores = new ArrayList<>();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				listaProfessores.add(new Professor(rs.getInt("idProfessor"), rs.getString("nomeProfessor"), rs.getString("email")));
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaProfessores;
	}
	
	public Professor getProfessor(String nome) {
		Professor professor = null;
		Connection conn = daoHelper.getConnection();
		String sql = "SELECT * FROM professor WHERE professor.nomeProfesso = "+ nome;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			professor = new Professor(rs.getInt("idProfessor"), rs.getString("nomeProfessor"), rs.getString("email"));
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return professor;
	}

}
