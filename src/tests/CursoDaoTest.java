package tests;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import dao.CursoDao;
import junit.*;
import model.Curso;

public class CursoDaoTest {
	@Test
	public void test()
	{
		CursoDao dao = new CursoDao();
		ArrayList<Curso> cursos = dao.getBy("qtdPeriodos",8);
		Assert.assertTrue( cursos.size() > 0);
	}
	
}
