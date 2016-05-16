package tests;

import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.Test;

import controller.UsuarioController;
import model.Usuario;

public class UsuarioControllerTest {
	
	@Test
	public void verificaSeJPanelNull() {
		UsuarioController usuarioController = new UsuarioController();
		assertNull(usuarioController.getView());
	}
	
	@Test
	public void verificaView() {
		Usuario model = new Usuario();
		JPanel view = new JPanel();
		UsuarioController usuarioController = new UsuarioController(model, view);
		assertEquals(view, usuarioController.getView());
	}
}
