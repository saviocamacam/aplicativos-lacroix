package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.EventoDao;
import model.Evento;

public class EventoDaoTest {

	@Test
	public void test() {
		EventoDao dao = new EventoDao();
		ArrayList<Evento> evts = dao.getBy("tipoevento", "Prova");
		for( Evento e : evts){
			System.out.println(e.getTipoEvento());
		}
		assertTrue(evts.size() > 0);
	}

}
