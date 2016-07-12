package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Aula;
import model.DiaSemana;

public class AulaDao {
	private static DaoHelper daoHelper;
	
	public AulaDao() {
		AulaDao.daoHelper = new DaoHelper();
	}

	public static void inserirAula(Aula aula) {
		daoHelper = new DaoHelper();
		Connection conn = daoHelper.getConnection();
        String sql = "INSERT INTO aula(idMateria, nomeMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES (?,?,?,?,?,?,?)";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);	
			stmt.setInt(1, aula.getIdMateria());
			stmt.setString(2, aula.getNomeMateria());
			stmt.setInt(3, aula.getIdPeriodo());
			stmt.setString(4, aula.getDiaSemana().getDiaSemanaBanco());
			stmt.setTime(5, aula.getHoraInicial());
			stmt.setTime(6, aula.getHoraFinal());
			stmt.setString(7, aula.getLocal());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			aula.setIdAula(rs.getInt(1));
			
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Aula> getAll(){
		return getBy("1",1);
	}
	
	public static <T> ArrayList<Aula> getBy(String nomeCampo, T valorCampo)
	{
		ArrayList<Aula> lista = new ArrayList<>();
		daoHelper = new DaoHelper();
		Connection c = daoHelper.getConnection();
		String sql = "SELECT * FROM aula where "+nomeCampo+" = '"+valorCampo+"'";
		
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() )
			{
				Aula a = new Aula(
								  rs.getInt("idaula"),
								  rs.getInt("idMateria"),
								  rs.getString("nomeMateria"),
								  rs.getInt("idperiodo"),
								  DiaSemana.getDiaSemana(rs.getString("diasemana")),
								  rs.getTime("horainicial"),
								  rs.getTime("horafinal"),
								  rs.getString("sala")
								  );
				lista.add(a);
			}
			daoHelper.releaseAll(rs, ps, c);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return lista;
	}
	
	public static int updateAula( Aula aula )
	{
		daoHelper = new DaoHelper();
		Connection conn = daoHelper.getConnection();
		String sql = "UPDATE aula set idmateria=?,"
					+ "nomeMateria=?, idperiodo=?,"
					+ "diasemana=?, horainicial=?,"
					+ "horafinal=?, sala=? "
					+ "where idaula=?";
		int alteracoes=0;
		try {
				PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);	
				stmt.setInt(1, aula.getIdMateria());
				stmt.setString(2, aula.getNomeMateria());
				stmt.setInt(3, aula.getIdPeriodo());
				stmt.setString(4, aula.getDiaSemana().getDiaSemanaBanco());
				stmt.setTime(5, aula.getHoraInicial());
				stmt.setTime(6, aula.getHoraFinal());
				stmt.setString(7, aula.getLocal());
				stmt.setInt(8, aula.getIdAula());
				alteracoes = stmt.executeUpdate();
				daoHelper.releaseAll(stmt, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return alteracoes;
	}
	
	public static <T> int updateBy( String campo, T novoValor, String campoComparacao, T valorComparacao){
		daoHelper = new DaoHelper();
		Connection c = daoHelper.getConnection();
		String sql = "UPDATE aula set "+campo+"="+novoValor+" where "+campoComparacao+" = "+valorComparacao+";";
		int nAlteracoes = 0;
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			nAlteracoes = ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return nAlteracoes;
	}
}
