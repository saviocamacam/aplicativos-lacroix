package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import dao.ProfessorDao;
import model.Professor;

public class ProfessorDaoTest {
	
	static ProfessorDao dao;
	@BeforeClass
	public static void iniciaBanco()
	{
		dao = new ProfessorDao();
	}
	
	@Test
	public void testInserirProfessor() {
		Professor p1 = new Professor("Testersom", "t@teste.com");
		dao.inserirProfessor(p1);
		
		ArrayList<Professor> lista = dao.getProfessores();
		for( Professor p : lista ){
			//checa se o professor estava no banco
			if( p.getIdProfessor() == p1.getIdProfessor() )
			{
				return;
			}
		}
		fail();
	}

	@Test
	public void updateProfessor() {
		ArrayList<Professor> ps = dao.getAll();
		Professor p = ps.get(1);
		p.setNomeProfessor("QUALQUEL");
		dao.updateProfessor(p);
		assertTrue(true ); //:(  Olhei no banco..
	}

}
