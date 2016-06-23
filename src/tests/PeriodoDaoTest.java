package tests;
import dao.PeriodoDao;
import junit.framework.Assert;
import model.Periodo;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class PeriodoDaoTest {
	static PeriodoDao periodoDao = new PeriodoDao();
	
	@Test
	public void testGetPeriodos(){
		ArrayList<Periodo> plist = periodoDao.getBy("1", 1);
		Assert.assertTrue( plist.size() > 0 );
	}
}
