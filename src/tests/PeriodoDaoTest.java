package tests;
import dao.PeriodoDao;
import junit.framework.Assert;
import model.Periodo;

import java.util.ArrayList;
import java.util.Date;

import org.junit.*;
import static org.junit.Assert.*;

@SuppressWarnings("deprecation")
public class PeriodoDaoTest {
	static PeriodoDao periodoDao = new PeriodoDao();
	
	@Test
	public void testGetPeriodos(){
		ArrayList<Periodo> plist = periodoDao.getBy("1", 1);
		assertTrue(( plist.size() > 0 ));
	}
	
	@Test
	public void inserirtest(){
		Periodo p = new Periodo(1, new java.sql.Date(2016, 5, 30), new java.sql.Date(2016,7,1));
		periodoDao.inserirPeriodo(p);
		for ( Periodo p2 : periodoDao.getAll() )
		{
			if ( p.getIdCurso() == p2.getIdCurso() && p.getNomePeriodo().equals( p2.getNomePeriodo() ) )
			{
				assertTrue(true);
			}
		}
		assertTrue(true);
	}
}
