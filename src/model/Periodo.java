package model;

import java.util.Date;

public class Periodo {
	private int idPeriodo;
	private String nomePeriodo;
	private int idCurso;
	private Date dataDeInicio;
	private Date dataDeTermino;
	
	public Periodo(int idPeriodo, String nomePeriodo, int idCurso, Date dataDeInicio, Date dataDeTermino) {
		this.idPeriodo = idPeriodo;
		this.nomePeriodo = nomePeriodo;
		this.idCurso = idCurso;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
	}
	
	public Periodo(int idCurso, Date dataDeInicio, Date dataDeTermino) {
		this.idCurso = idCurso;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
	}
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public Date getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public Date getDataDeTermino() {
		return dataDeTermino;
	}
	public void setDataTermino(Date dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}

	public int getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getNomePeriodo() {
		return nomePeriodo;
	}

	public void setNomePeriodo(String nomePeriodo) {
		this.nomePeriodo = nomePeriodo;
	}
	
	
}
