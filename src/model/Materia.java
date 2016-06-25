package model;

public class Materia {
	private int idMateria;
	private int idCurso;
	private EstadoMateria estado;
	private String nomeMateria;
	private int periodoAssociado;
	private float nota;
	private int cargaHoraria;
	
	public Materia(int idMateria, int idCurso, String nomeMateria, EstadoMateria estado, int periodoAssociado, int cargaHoraria) {
		this.idMateria = idMateria;
		this.idCurso = idCurso;
		this.estado = estado;
		this.nomeMateria = nomeMateria;
		this.periodoAssociado = periodoAssociado;
		this.cargaHoraria = cargaHoraria;
	}

	public Materia(int idMateria, int idCurso, String nomeMateria, int periodoAssociado, float nota, int cargaHoraria) {
		super();
		this.idMateria = idMateria;
		this.idCurso = idCurso;
		this.nomeMateria = nomeMateria;
		this.periodoAssociado = periodoAssociado;
		this.nota = nota;
		this.cargaHoraria = cargaHoraria;
	}
	

	public Materia(int idMateria, int idCurso, String nomeMateria, int periodoAssociado, int cargaHoraria) {
		super();
		this.idMateria = idMateria;
		this.idCurso = idCurso;
		this.nomeMateria = nomeMateria;
		this.periodoAssociado = periodoAssociado;
		this.cargaHoraria = cargaHoraria;
	}

	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
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

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return this.nomeMateria;
	}
}