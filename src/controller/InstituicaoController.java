package controller;

import javax.swing.JFrame;
import model.Instituicao;

public class InstituicaoController implements Submitable {
	
	private JFrame view;
	private Instituicao model;
	
	public InstituicaoController(JFrame view, Instituicao model) {
		super();
		this.view = view;
		this.model = model;
	}

	public InstituicaoController(JFrame view) {
		super();
		this.view = view;
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	} 
	
	
}
