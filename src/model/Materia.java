package model;

public class Materia {
	private int idMateria;
	private int idCurso;
	private int idEstado;
	private String nomeMateria;
	private int periodoAssociado;
	private EstadoMateria estado;
	
	public Materia(int idCurso, EstadoMateria estado) {
		this.idCurso = idCurso;
		this.estado = estado;
	}
	
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getNomeMateria() {
		return nomeMateria;
	}
	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	public int getPeriodoAssociado() {
		return periodoAssociado;
	}
	public void setPeriodoAssociado(int periodoAssociado) {
		this.periodoAssociado = periodoAssociado;
	}
}