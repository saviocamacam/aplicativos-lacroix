package model;

public class Materia {
	private int idMateria;
	private int idCurso;
	private int idEstado;
	private String nomeMateria;
	private int periodoAssociado;
	private EstadoMateria estado;
	
	public Materia(int idCurso, EstadoMateria estado, int periodoAssociado) {
		this.idCurso = idCurso;
		this.estado = estado;
		this.periodoAssociado = periodoAssociado;
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

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public EstadoMateria getEstado() {
		return estado;
	}

	public void setEstado(EstadoMateria estado) {
		this.estado = estado;
	}
}