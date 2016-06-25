package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.spi.CalendarDataProvider;

import dao.AulaDao;
import dao.EventoDao;
import model.Aula;
import model.Curso;
import model.DiaSemana;
import model.Evento;
import model.Usuario;

public class ModeloMainFrameController {

	private Usuario usuario;
	private Curso curso;
	private List<Evento> eventos;
	private List<Aula> aulas;
	private Calendar calendar;

	public ModeloMainFrameController(Usuario usuario, Curso curso) {
		this.usuario = usuario;
		this.curso = curso;
		this.eventos = null;
		this.aulas = null;
		this.calendar = Calendar.getInstance();
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
	
	public List<Aula> getAulas() {
		if(this.aulas == null){
			this.aulas = AulaDao.getAll();
		}
		return aulas;
	}
	
	public DiaSemana getDiaSemana(){
		return DiaSemana.getDiaSemana(calendar.get(Calendar.DAY_OF_WEEK));
	}
}
