package controller;

import javax.swing.JPanel;

import model.Evento;

public class NovoEventoPanelController {
	private Evento evento;
	private JPanel view;
	
	public NovoEventoPanelController(JPanel view) {
		evento = new Evento();
		this.view = view;
	}
	
}
