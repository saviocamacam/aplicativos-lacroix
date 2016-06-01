package controller;

import java.sql.Date;

import javax.swing.JPanel;

import model.Usuario;

public class UsuarioController implements Submitable {
	
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
	
	public String getNomeUsuario() {
		return this.model.getNome();
	}
	
	public void setNomeUsuario(String nome){
		this.model.setNome(nome);
	}
	
	public Date getNascimentoUsuario(){
		return this.model.getNascimento();
	}
	
	public void setNascimentoUsuario(Date data){
		this.model.setNascimento(data);
	}
	
	public void submit(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}
}
