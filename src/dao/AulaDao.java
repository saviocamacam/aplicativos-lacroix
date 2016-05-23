package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Aula;

public class AulaDao {
	private DaoHelper daoManager;
	
	public AulaDao() {
		this.setDaoManager(new DaoHelper());
	}

	public void setDaoManager(DaoHelper daoManager) {
		this.daoManager = daoManager;
	}
	
	public void inserirAula(Aula Aula) {
		Connection con = daoManager.getConnection();
        String sql = "INSERT INTO Aula (idMateria,horaInicial,horaFinal,local) "
        			+ "VALUES (?,?,?,?) RETURNING 'idAula'";
        try {
			PreparedStatement stmt = con.prepareStatement(sql);	
			stmt.setInt(1, Aula.getIdMateria());
			stmt.setDate(2, (Date) Aula.getHoraInicial());
			stmt.setDate(3, (Date) Aula.getHoraFinal());
			stmt.setString(4, Aula.getLocal());
			
			stmt.executeQuery();
			
			ResultSet keys = stmt.getGeneratedKeys();
			while(keys.next()) {
				Aula.setIdAula(keys.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
