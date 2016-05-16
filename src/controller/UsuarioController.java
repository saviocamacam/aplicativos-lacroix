package controller;

import javax.swing.JPanel;

import model.Usuario;

public class UsuarioController {
	
	private JPanel view;
	private Usuario model;
	

	public UsuarioController(Usuario model, JPanel view) {
		this.model = model;
		this.view = view;
		
	}
	
	public UsuarioController() {
	}

	public UsuarioController(JPanel view) {
		this.view = view;
		this.model = new Usuario();
	}

	public JPanel getView() {
		return view;
	}
	
	public Usuario getModel() {
		return model;
	}

	public void submit(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
}
