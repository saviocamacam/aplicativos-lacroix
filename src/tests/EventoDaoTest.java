package tests;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.Test;

import dao.EventoDao;
import model.Evento;
import model.TipoEvento;

public class EventoDaoTest {

	@Test
	public void test() {
		EventoDao dao = new EventoDao();
		ArrayList<Evento> evts = dao.getBy("tipoevento", "Prova");
		for( Evento e : evts){
		}
		assertTrue(evts.size() > 0);
	}

	@Test
	public void test2(){
		new EventoDao().updateBy("idMateria", 1, "idevento", 1);
		assertTrue( new EventoDao().updateBy("idMateria", 2, "idevento", 1) > 0);	
	}
	
	@Test
	public void updatenotarecebida(){
		Evento evento = new Evento(1, 0, null, null, null, null, 0, null);
		new EventoDao().updateNotaRecebida(evento);
	}
	
	@Test
	public void updateEvento()
	{
		Evento e = new EventoDao().getAll().get(1);
		e.setDescricao("jiksdljsbjbs");
		System.out.println(e.toString());
		assertTrue( new EventoDao().updateEvento(e) > 0 );
		
	}
}
