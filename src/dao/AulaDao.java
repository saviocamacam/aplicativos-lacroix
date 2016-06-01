package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Aula;

public class AulaDao {
	private DaoHelper daoManager;
	
	public AulaDao() {
		this.setDaoManager(new DaoHelper());
	}

	public void setDaoManager(DaoHelper daoManager) {
		this.daoManager = daoManager;
	}
	
	public void inserirAula(Aula aula) {
		Connection conn = daoManager.getConnection();
        String sql = "INSERT INTO aula(idMateria, horaInicial, horaFinal, local) VALUES (?,?,?,?)";
        try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);	
			stmt.setInt(1, aula.getIdMateria());
			stmt.setDate(2, (Date) aula.getHoraInicial());
			stmt.setDate(3, (Date) aula.getHoraFinal());
			stmt.setString(4, aula.getLocal());
			stmt.executeQuery();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			aula.setIdAula(rs.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
