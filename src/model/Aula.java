package model;

public class Aula {
	private int idAula;
	private int idMateria;
	private java.util.Date horaInicial;
	private java.util.Date horaFinal;
	private String local;
	
	public java.util.Date getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(java.util.Date horaFinal) {
		this.horaFinal = horaFinal;
	}
	public int getIdAula() {
		return idAula;
	}
	public int getIdMateria() {
		return idMateria;
	}
	public java.util.Date getHoraInicial() {
		return horaInicial;
	}
	public String getLocal() {
		return local;
	}
}
