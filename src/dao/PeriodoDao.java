package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import model.Periodo;


public class PeriodoDao {
	private static DaoHelper daoHelper = new DaoHelper();
	public PeriodoDao() {
		PeriodoDao.daoHelper = new DaoHelper();
	}
	
	@SuppressWarnings("deprecation")
	public static void inserirPeriodo(Periodo periodo) {
		daoHelper = new DaoHelper();
		Connection conn = daoHelper.getConnection();
		Date dataTeste = new Date(periodo.getDataDeInicio().getYear(), 6, 30);
		String nomePeriodo;
		if(periodo.getDataDeInicio().before(dataTeste)) {
			nomePeriodo = "" + periodo.getDataDeInicio().getYear() + ".1";
		}
		else {
			nomePeriodo = "" + periodo.getDataDeInicio().getYear() + ".2";
		}
		periodo.setNomePeriodo(nomePeriodo);
		
		String sql = "INSERT INTO periodo(idCurso, nomePeriodo, dataInicio, dataTermino) VALUES(?,?,?,?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, periodo.getIdCurso());
			stmt.setString(2, periodo.getNomePeriodo());
			stmt.setDate(3, (Date) periodo.getDataDeInicio());
			stmt.setDate(4, (Date) periodo.getDataDeTermino());
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
		daoHelper = new DaoHelper();
		ArrayList<Periodo> listaPeriodo = null;
		Connection conn = daoHelper.getConnection();
		String sql = "SELECT * FROM periodo WHERE periodo.idCurso = " + idCurso;
		
		try {
			listaPeriodo = new ArrayList<>();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				listaPeriodo.add(new Periodo(rs.getInt("idPeriodo"), rs.getString("nomePeriodo"), idCurso, rs.getDate("dataInicio"), rs.getDate("dataTermino")));
			}
			
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaPeriodo;
	}
	
	
	
	public static Periodo periodoAtual(int idCurso, Date currentDate) {
		daoHelper = new DaoHelper();
		Periodo periodo = null;
		Connection conn = daoHelper.getConnection();
		String sql = "select * from periodo where dataTermino > '" + currentDate + "' and idCurso ="  + idCurso;
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			periodo = new Periodo(rs.getInt("idPeriodo"), rs.getString("nomePeriodo"), idCurso, rs.getDate("dataInicio"), rs.getDate("dataTermino"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return periodo;
	}

	public static ArrayList<Periodo> getAll(){
		return getBy("1", 1);
	}
	
	public static <T1> ArrayList<Periodo> getBy(String nomeCampo, T1 valorCampo ) {
		daoHelper = new DaoHelper();
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
								rs.getString("nomePeriodo"),
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
