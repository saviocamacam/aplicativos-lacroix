package controller;

import java.util.ArrayList;
import java.util.List;

import dao.EventoDao;
import model.Curso;
import model.Evento;
import model.Usuario;

public class ModeloMainFrameController {

	private Usuario usuario;
	private Curso curso;
	private List<Evento> eventos;

	public ModeloMainFrameController(Usuario usuario, Curso curso) {
		this.usuario = usuario;
		this.curso = curso;
		this.eventos = null;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public List<Evento> getEventos() {
		if(this.eventos == null){
			this.eventos = EventoDao.getAll();
		}
		return eventos;
	}
}
