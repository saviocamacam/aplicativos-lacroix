package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Professor;

public class ProfessorDao {
	private static DaoHelper daoHelper;
	
	public ProfessorDao() {
		ProfessorDao.daoHelper = new DaoHelper();
	}
	
	public static void inserirProfessor(Professor professor) {
		daoHelper = new DaoHelper();
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO professor(nomeProfessor, email) VALUES(?, ?)";
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, professor.getNomeProfessor());
			stmt.setString(2, professor.getEmail());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			professor.setIdProfessor(rs.getInt(1));
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static int updateProfessor( Professor professor )
	{
		daoHelper = new DaoHelper();
		Connection conn = daoHelper.getConnection();
		String sql = "UPDATE professor SET nomeProfessor=?, email=? where idProfessor=?";
		PreparedStatement stmt = null;
		int qtd_alteracoes=0;
		try {
			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, professor.getNomeProfessor());
			stmt.setString(2, professor.getEmail());
			stmt.setInt(3, professor.getIdProfessor() );
			qtd_alteracoes = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return qtd_alteracoes;
	}
	
	public static ArrayList<Professor> getProfessores() {
		ArrayList<Professor> listaProfessores = null;
		daoHelper = new DaoHelper();
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
	
	public static Professor getProfessor(String nome) {
		daoHelper = new DaoHelper();
		Professor professor = null;
		Connection conn = daoHelper.getConnection();
		String sql = "SELECT * FROM professor WHERE professor.nomeProfessor = "+ nome;
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
	
	public static ArrayList<Professor> getAll() {
		return getBy("1", 1);
	}
	
	public static <T1> ArrayList<Professor> getBy(String nomeCampo, T1 valorCampo ) {
		ArrayList<Professor> lista = new ArrayList<>();
		daoHelper = new DaoHelper();
		Connection c = daoHelper.getConnection();
		String sql = "SELECT * FROM professor where "+nomeCampo+" = '"+valorCampo+"'";
		
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() )
			{
				Professor usr = new Professor(rs.getInt("idProfessor"),
												rs.getString("nomeProfessor"),
												rs.getString("email"));
				lista.add(usr);
			}
			daoHelper.releaseAll(rs, ps, c);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return lista;
	}

}

