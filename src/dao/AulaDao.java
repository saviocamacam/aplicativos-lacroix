package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Aula;

public class AulaDao {
	private static DaoHelper daoHelper;
	
	public AulaDao() {
		AulaDao.daoHelper = new DaoHelper();
	}

	public static void inserirAula(Aula aula) {
		Connection conn = daoHelper.getConnection();
        String sql = "INSERT INTO aula(idMateria, nomeMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES (?,?,?,?,?,?,?)";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);	
			stmt.setInt(1, aula.getIdMateria());
			stmt.setString(2, aula.getNomeMateria());
			stmt.setInt(3, aula.getIdPeriodo());
			stmt.setString(4, aula.getDiaSemana());
			stmt.setTime(5, aula.getHoraInicial());
			stmt.setTime(6, aula.getHoraFinal());
			stmt.setString(7, aula.getLocal());
			stmt.executeQuery();
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
		Connection c = daoHelper.getConnection();
		String sql = "SELECT * FROM aula where "+nomeCampo+" = '"+valorCampo+"'";
		
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() )
			{
				Aula a = new Aula(rs.getInt("idMateria"),
									rs.getString("nomeMateria"),
								  rs.getInt("idperiodo"),
								  rs.getString("diasemana"),
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
}
