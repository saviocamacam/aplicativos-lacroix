package model;

import java.util.Date;

public class Aula {
	private int idAula;
	private int idMateria;
	private java.util.Date horaInicial;
	private java.util.Date horaFinal;
	private String local;
	
	public Aula(int idMateria, Date horaInicial, Date horaFinal, String local) {
		this.idMateria = idMateria;
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
	public java.util.Date getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(java.util.Date horaInicial) {
		this.horaInicial = horaInicial;
	}
	public java.util.Date getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(java.util.Date horaFinal) {
		this.horaFinal = horaFinal;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
}
