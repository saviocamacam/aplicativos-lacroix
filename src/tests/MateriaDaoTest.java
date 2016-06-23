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

}
