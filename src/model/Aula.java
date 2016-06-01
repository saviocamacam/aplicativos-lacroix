package model;

import java.sql.Date;

public class Aula {
	private int idAula;
	private int idMateria;
	private int idPeriodo;
	private Date horaInicial;
	private Date horaFinal;
	private String local;
	
	public Aula(int idMateria, int idPeriodo, Date horaInicial, Date horaFinal, String local) {
		this.idMateria = idMateria;
		this.idPeriodo = idPeriodo;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.local = local;
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
	public Date getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(Date horaInicial) {
		this.horaInicial = horaInicial;
	}
	public Date getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(Date horaFinal) {
		this.horaFinal = horaFinal;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	public int getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
}
