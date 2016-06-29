package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Instituicao;

public class InstituicaoDao {
	private static DaoHelper daoHelper;
	
	public InstituicaoDao() {
		InstituicaoDao.daoHelper = new DaoHelper();
	}

	public static void inserirInstituicao(Instituicao instituicao) {
		daoHelper = new DaoHelper();
		Connection conn = daoHelper.getConnection();
		
        String sql = "INSERT INTO instituicao (nomeinstituicao, cidade) VALUES(? ,?)";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);	
			stmt.setString(1, instituicao.getNomeInstituicao());
			stmt.setString(2, instituicao.getNomeCidade());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
		    rs.next();
		    instituicao.setIdInstituicao(rs.getInt(1));
			
		    daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Instituicao getInstituicao(int idInstituicao) {
		Instituicao instituicao = null;
		daoHelper = new DaoHelper();
		Connection conn = daoHelper.getConnection();
		String sql = "SELECT * FROM instituicao i WHERE i.idInstituicao = " + idInstituicao;
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			instituicao = new Instituicao(rs.getInt("idInstituicao"), rs.getString("nomeInstituicao"), rs.getString("cidade"));
			stmt.close();
			
			daoHelper.releaseAll(rs, stmt, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return instituicao;
	}
	public static ArrayList<Instituicao> getAll(){
		return getBy("1", 1);
	}
	public static <T1> ArrayList<Instituicao> getBy(String nomeCampo, T1 valorCampo ) {
		ArrayList<Instituicao> lista = new ArrayList<>();
		Connection c = daoHelper.getConnection();
		String sql = "SELECT * FROM instituicao where "+nomeCampo+" = '"+valorCampo+"'";
		
		try{
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() )
			{
				Instituicao usr = new Instituicao(
							rs.getInt("idinstituicao"),
							rs.getString("nomeinstituicao"),
							rs.getString("cidade")
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
