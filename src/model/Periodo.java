package model;

import java.util.Date;

public class Periodo {
	private long idCurso;
	private Date dataDeInicio;
	private Date dataDeTermino;
	
	public Periodo(long idCurso, Date dataDeInicio, Date dataDeTermino) {
		super();
		this.idCurso = idCurso;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
	}
	
	public long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(long idCurso) {
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
	public void setDataDeTermino(Date dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}
	
	
}
