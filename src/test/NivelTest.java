package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Nivel;

public class NivelTest {

	@Test
	public void testNomeNivel() {
		Nivel nivel = Nivel.ENSINOMEDIO;
		assertEquals("Ensino Médio", nivel.getNomeDoNivel());
	}

}
