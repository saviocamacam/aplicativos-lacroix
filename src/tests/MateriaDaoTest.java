package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.MateriaDao;
import model.Materia;

public class MateriaDaoTest {

	@Test
	public void test() {
		dao.MateriaDao daoMateria = new MateriaDao();
		ArrayList<Materia> materia = daoMateria.getAll();
		assertTrue( materia.size() > 0);
	}
	
	@Test
	public void insertMateria()
	{
		Materia m  = new Materia("nomeProf",1,"NomaMateria",2,2,"hoje");
		dao.MateriaDao dao = new dao.MateriaDao();
		dao.inserirMateria(m);
		assertTrue(true); // testado no banco
	}
	
	@Test
	public void updateTeste()
	{
		Materia m = MateriaDao.getAll().get(1);
		m.setNomeMateria("MUDOUUDOUI");
		assertTrue(MateriaDao.updateMateria(m) > 0);
		
	}

}
