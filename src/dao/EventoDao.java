package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Evento;

public class EventoDao {
	private static DaoHelper daoHelper;
	
	public EventoDao() {
		EventoDao.daoHelper = new DaoHelper();
	}
	
	public static void inserirEvento(Evento evento) {
		Connection conn = daoHelper.getConnection();
		String sql = "INSERT INTO evento(idMateria, tipoEvento, dataEvento, descricao, detalhes, valorNota, localEvento) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, evento.getIdMateria());
			stmt.setString(2, evento.getTipoEvento());
			stmt.setDate(3, evento.getDataEvento());
			stmt.setString(4, evento.getDescricao());
			stmt.setString(5, evento.getDetalhes());
			stmt.setFloat(6, evento.getValorNota());
			stmt.setString(7, evento.getLocalEvento());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			evento.setIdEvento(rs.getInt(1));
						
			daoHelper.releaseAll(stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
