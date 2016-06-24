package model;

import java.sql.Time;

public class Aula {
	private int idAula;
	private int idMateria;
	private String nomeMateria;
	private int idPeriodo;
	private String diaSemana;
	private Time horaInicial;
	private Time horaFinal;
	private String sala;
	
	
	public Aula(int idMateria, String nomeMateria, int idPeriodo, String diaSemana, Time horaInicial, Time horaFinal, String local) {
		this.idMateria = idMateria;
		this.nomeMateria = nomeMateria;
		this.idPeriodo = idPeriodo;
		this.diaSemana = diaSemana;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.sala = local;
	}
	
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public Time getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(Time horaInicial) {
		this.horaInicial = horaInicial;
	}
	public Time getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(Time horaFinal) {
		this.horaFinal = horaFinal;
	}
	public String getLocal() {
		return sala;
	}
	public void setLocal(String local) {
		this.sala = local;
	}

	public int getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
}
