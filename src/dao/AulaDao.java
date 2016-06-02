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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
