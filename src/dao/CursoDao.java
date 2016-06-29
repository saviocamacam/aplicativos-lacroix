package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Curso;
import model.Evento;
import model.Instituicao;
import model.Nivel;
import model.Periodo;
import model.Regime;
import model.TipoEvento;
import model.Usuario;

public class CursoDao {
	private static DaoHelper daoHelper;
	
	public CursoDao() {
		CursoDao.daoHelper = new DaoHelper();
	}
	
	public static void inserirCurso( Usuario usuario, Instituicao instituicao, Curso curso )
	{
		curso.setIdUsuario(usuario.getId());
		curso.setIdInstituicao( instituicao.getIdInstituicao() );
		inserirCurso(curso);
		new JOptionPane();
	}
	
	public static void inserirCurso(Curso curso) {
		daoHelper = new DaoHelper();
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
		daoHelper = new DaoHelper();
		ArrayList<Curso> listaCursos = null;
		Connection conn = daoHelper.getConnection();
		String sql = "SELECT * FROM curso WHERE curso.idUsuario = " + usuario.getId();
		
		try {
			listaCursos = new ArrayList<>();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Curso curso = new Curso(rs.getInt("idCurso"), rs.getInt("idInstituicao"), rs.getInt("idUsuario"), Nivel.valueOf(rs.getString("nivel").toUpperCase()), Regime.valueOf(rs.getString("regime").toUpperCase()), rs.getString("nomeCurso"), rs.getInt("qtdPeriodos"));
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
	
	public static ArrayList<Curso> getAll(){
		return getBy("1", 1);
	}
	
	public static ArrayList<Curso> getBy( Usuario user ){
		return getBy( "idusuario", user.getId() );
	}
	
	public static <T1> ArrayList<Curso> getBy(String nomeCampo, T1 valorCampo ) {
		daoHelper = new DaoHelper();
		ArrayList<Curso> lista = new ArrayList<>();
		Connection c = daoHelper.getConnection();
		String sql = "SELECT * FROM curso where "+nomeCampo+" = '"+valorCampo+"'";
		
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() )
			{
				Curso usr = new Curso(
						rs.getInt("idinstituicao"),
						rs.getInt("idusuario"),
						Nivel.valueOf(rs.getString("nivel").toUpperCase() ),
						Regime.valueOf( rs.getString("regime").toUpperCase() ),
						rs.getString("nomecurso"),
						rs.getInt("qtdperiodos")
						);
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
