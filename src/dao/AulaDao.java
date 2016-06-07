package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Aula;
import model.Usuario;

public class AulaDao {
	private DaoHelper daoHelper;
	
	public AulaDao() {
		this.setDaoManager(new DaoHelper());
	}

	public void setDaoManager(DaoHelper daoManager) {
		this.daoHelper = daoManager;
	}
	
	public void inserirAula(Aula aula) {
		Connection conn = daoHelper.getConnection();
        String sql = "INSERT INTO aula(idMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES (?,?,?,?,?,?)";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);	
			stmt.setInt(1, aula.getIdMateria());
			stmt.setInt(2, aula.getIdPeriodo());
			stmt.setString(3, aula.getDiaSemana());
			stmt.setTime(4, aula.getHoraInicial());
			stmt.setTime(5, aula.getHoraFinal());
			stmt.setString(6, aula.getLocal());
			stmt.executeQuery();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			aula.setIdAula(rs.getInt(1));
			
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public <T> ArrayList<Aula> getAulas(String nomeCampo, T valorCampo)
	{
		ArrayList<Aula> lista = new ArrayList<>();
		Connection c = daoHelper.getConnection();
		String sql = "SELECT * FROM aula where "+nomeCampo+" = "+valorCampo;
		
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() )
			{
				Aula a = new Aula(rs.getInt("idMateria"),
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
