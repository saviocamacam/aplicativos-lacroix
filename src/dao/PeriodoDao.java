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
	private static DaoHelper daoHelper;
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

}
