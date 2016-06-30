package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Evento;
import model.TipoEvento;

public class EventoDao {
	private static DaoHelper daoHelper;
	
	public EventoDao() {
		EventoDao.daoHelper = new DaoHelper();
	}
	
	public static void inserirEvento(Evento evento) {
		daoHelper = new DaoHelper();
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
	
	public static int updateEvento( Evento evento){
		daoHelper = new DaoHelper();
		Connection conn = daoHelper.getConnection();
		String sql = "UPDATE evento SET (idmateria=?,"
									+ "tipoevento=?,"
									+ "dataevento=?,"
									+ "descricao='?',"
									+ "detalhes='?',"
									+ "valornota=?,"
									+ "localevento='?')"
									+ "WHERE idevento= ?";
		int numAlteracoes=0;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, evento.getIdMateria());
			stmt.setString(2, evento.getTipoEvento());
			stmt.setDate(3, evento.getDataEvento());
			stmt.setString(4, evento.getDescricao());
			stmt.setString(5, evento.getDetalhes());
			stmt.setFloat(6, evento.getValorNota());
			stmt.setString(7, evento.getLocalEvento());
			stmt.setInt(8, evento.getIdEvento() );

			numAlteracoes = stmt.executeUpdate();
			
			daoHelper.releaseAll(stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numAlteracoes;
	}
	
	public static ArrayList<Evento> getAll(){
		return getBy("1", 1);
	}
	
	public static ArrayList<Evento> getEventoFinalizado() {
		daoHelper = new DaoHelper();
		ArrayList<Evento> listaEventos = null;
		Connection conn = daoHelper.getConnection();
		String sql = "select * from evento where notaRecebida is not null";
		
		try {
			listaEventos = new ArrayList<>();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Evento usr = new Evento(
						rs.getInt("idevento"),
						rs.getInt("idmateria"),
						TipoEvento.valueOf(rs.getString("tipoevento").toUpperCase() ),
						rs.getDate("dataevento"),
						rs.getString("descricao"),
						rs.getString("detalhes"),
						rs.getFloat("valornota"),
						rs.getString("localevento")
						);
				listaEventos.add(usr);
			}
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaEventos;
	}
	
	public static ArrayList<Evento> getEventoTalQue(String operator, Date dataAtual) {
		daoHelper = new DaoHelper();
		ArrayList<Evento> listaEventos = null;
		Connection conn = daoHelper.getConnection();
		String sql = "select * from evento where dataEvento" + operator + "'" + dataAtual +"'" + "and notaRecebida is null";
		
		try {
			listaEventos = new ArrayList<>();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Evento usr = new Evento(
						rs.getInt("idEvento"),
						rs.getInt("idmateria"),
						TipoEvento.valueOf(rs.getString("tipoevento").toUpperCase() ),
						rs.getDate("dataevento"),
						rs.getString("descricao"),
						rs.getString("detalhes"),
						rs.getFloat("valornota"),
						rs.getString("localevento")
						);
				listaEventos.add(usr);
			}
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaEventos;
	}


	public static <T1> ArrayList<Evento> getBy(String nomeCampo, T1 valorCampo ) {
		daoHelper = new DaoHelper();
		ArrayList<Evento> lista = new ArrayList<>();
		Connection c = daoHelper.getConnection();
		String sql = "SELECT * FROM evento where "+nomeCampo+" = '"+valorCampo+"'";
		
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() )
			{
				Evento usr = new Evento(
						rs.getInt("idevento"),
						rs.getInt("idmateria"),
						TipoEvento.valueOf(rs.getString("tipoevento").toUpperCase() ),
						rs.getDate("dataevento"),
						rs.getString("descricao"),
						rs.getString("detalhes"),
						rs.getFloat("valornota"),
						rs.getString("localevento")
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
	
	
	public int updateNotaRecebida(Evento evento) {
		return updateBy("notarecebida", evento.getNotaRecebida(),"idevento", evento.getIdEvento() );
	}
	public static <T> int updateBy( String campo, T novoValor, String campoComparacao, T valorComparacao){
		daoHelper = new DaoHelper();
		Connection c = daoHelper.getConnection();
		String sql = "UPDATE evento set "+campo+"="+novoValor+" where "+campoComparacao+" = "+valorComparacao+";";
		int nAlteracoes = 0;
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			nAlteracoes = ps.executeUpdate();
			daoHelper.releaseAll(ps, c);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return nAlteracoes;
	}

}
