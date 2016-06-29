package controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.spi.CalendarDataProvider;

import javax.swing.JPanel;

import dao.AulaDao;
import dao.DaoHelper;
import dao.EventoDao;
import dao.InstituicaoDao;
import dao.MateriaDao;
import dao.PeriodoDao;
import model.Aula;
import model.Curso;
import model.DiaSemana;
import model.Evento;
import model.Materia;
import model.Periodo;
import model.Usuario;

public class ModeloMainFrameController {

	private Usuario usuario;
	private Curso curso;
	private Periodo periodo;
	private List<Evento> eventos;
	private List<Aula> aulas;
	private Calendar calendar;
	private List<Materia> materias;

	public ModeloMainFrameController(Usuario usuario, Curso curso) {
		this.calendar = Calendar.getInstance();
		this.usuario = usuario;
		this.curso = curso;
		this.periodo = PeriodoDao.periodoAtual(curso.getIdCurso(), new Date(calendar.getTimeInMillis()));
		this.eventos = null;
		this.aulas = null;
		this.materias = null;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public Date getDataFinalPeriodo(){
		return (Date) periodo.getDataDeTermino();
	}
	
	public Date getDataInicialPeriodo(){
		return (Date) periodo.getDataDeTermino();
	}

	public List<Evento> getEventos() {
		if(this.eventos == null){
			this.eventos = EventoDao.getEventoTalQue(">=", (new Date(calendar.getTimeInMillis())));
		}
		return eventos;
	}
	
	public List<Evento> getEventosEspera() {
		List<Evento> evts = EventoDao.getEventoTalQue("<", (new Date(calendar.getTimeInMillis())));
		return evts;
	}
	
	public List<Evento> getEventosFinalizados() {
		List<Evento> evts = EventoDao.getEventoFinalizado();
		return evts;
	}
	
	public List<Aula> getTodasAulas() {
		if(this.aulas == null){
			this.aulas = AulaDao.getAll();
		}
		return aulas;
	}
	
	public List<Materia> getTodasMaterias() {
		if(this.materias == null){
			this.materias = MateriaDao.getMateriasPeriodo(periodo.getIdPeriodo());
		}
		return materias;
	}
	
	public List<Aula> getAulasDia(){
		DiaSemana dia = getDiaSemana();
		List<Aula> aulasDoDia = new ArrayList<>();
		aulasDoDia.addAll(AulaDao.getBy("diasemana", dia.getDiaSemanaBanco()));
		return aulasDoDia;
	}
	
	public List<Aula> getAulasProximoDia(){
		DiaSemana dia = getProximoDiaSemana();
		List<Aula> aulasDoDia = new ArrayList<>();
		aulasDoDia.addAll(AulaDao.getBy("diasemana", dia.getDiaSemanaBanco()));
		return aulasDoDia;
	}
	
	public DiaSemana getDiaSemana(){
		return DiaSemana.getDiaSemana(calendar.get(Calendar.DAY_OF_WEEK));
	}
	
	public DiaSemana getProximoDiaSemana(){
		Calendar c = Calendar.getInstance();
		c.add(c.DATE, 1);
		return DiaSemana.getDiaSemana( c.get(Calendar.DAY_OF_WEEK) );
	}

	public void gravaEvento(Evento novoEvento) {
		EventoDao.inserirEvento(novoEvento);
		System.out.println(novoEvento);
	}

	public String getNomeCurso() {
		return this.curso.getNomeCurso();
	}

	public String getNomeInstituicao() {
		return (InstituicaoDao.getInstituicao(this.curso.getIdInstituicao())).getNomeInstituicao();
	}

}
