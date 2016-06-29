package tests;
import java.sql.Time;
import java.util.ArrayList;

import org.junit.Test;

import dao.AulaDao;
import model.Aula;

public class AulaDaoTest {
	@Test
	public void testUpdate()
	{
		ArrayList<Aula> aulas = AulaDao.getAll();
		Aula a = aulas.get(1);
		a.setLocal("MINHA CASA");
		AulaDao.updateAula(a);
	}
	
}
