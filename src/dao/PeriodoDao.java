package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Periodo;


public class PeriodoDao {
	private static DaoHelper daoHelper = new DaoHelper();
	public PeriodoDao() {
		PeriodoDao.daoHelper = new DaoHelper();
	}
	
	public static void inserirPeriodo(Periodo periodo) {
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO periodo(idCurso, dataInicio, dataTermino) VALUES(?, ?, ?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, periodo.getIdCurso());
			stmt.setDate(2, (Date) periodo.getDataDeInicio());
			stmt.setDate(2, (Date) periodo.getDataDeTermino());
			stmt.executeQuery();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			periodo.setIdPeriodo(rs.getInt(1));
			
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Periodo> listaPeriodos(int idCurso) {
		
		ArrayList<Periodo> listaPeriodo = null;
		Connection conn = daoHelper.getConnection();
		String sql = "SELECT * FROM periodo WHERE periodo.idCurso = " + idCurso;
		
		try {
			listaPeriodo = new ArrayList<>();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				listaPeriodo.add(new Periodo(rs.getInt("idPeriodo"), idCurso, rs.getDate("dataInicio"), rs.getDate("dataTermino")));
			}
			
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaPeriodo;
	}
	
	public static Periodo periodoAtual(int idCurso, Date currentDate) {
		Periodo periodo = null;
		Connection conn = daoHelper.getConnection();
		String sql = "select * from periodo where dataTermino > '" + currentDate + "' and idCurso ="  + idCurso;
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			periodo = new Periodo(rs.getInt("idPeriodo"), idCurso, rs.getDate("dataInicio"), rs.getDate("dataTermino"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return periodo;
	}

	public static ArrayList<Periodo> getAll(){
		return getBy("1", 1);
	}
	
	public static <T1> ArrayList<Periodo> getBy(String nomeCampo, T1 valorCampo ) {
		ArrayList<Periodo> lista = new ArrayList<>();
		Connection c = daoHelper.getConnection();
		String sql = "SELECT * FROM periodo where "+nomeCampo+" = '"+valorCampo+"'";
		
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() )
			{
				Periodo usr = new Periodo(
								rs.getInt("idperiodo"),
								rs.getInt("idcurso"),
								rs.getDate("datainicio"), rs.getDate("datatermino")
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
