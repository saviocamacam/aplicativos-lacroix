package model;

import java.sql.Date;

public class Materia {
	private int idMateria;
	private String nomeProfessor;
	private int idCurso;
	private EstadoMateria estado;
	private String nomeMateria;
	private int periodoAssociado;
	private float nota;
	private int cargaHoraria;
	private Date cursadaUltimaVez;
	
	public Materia(int idMateria, String nomeProfessor, int idCurso, String nomeMateria, EstadoMateria estado, int periodoAssociado, int cargaHoraria) {
		this.idMateria = idMateria;
		this.setNomeProfessor(nomeProfessor);
		this.idCurso = idCurso;
		this.estado = estado;
		this.nomeMateria = nomeMateria;
		this.periodoAssociado = periodoAssociado;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Materia(String nomeProfessor, int idCurso, String nomeMateria, EstadoMateria estado, int periodoAssociado, int cargaHoraria) {
		this.setNomeProfessor(nomeProfessor);
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
		this.setEstado();
	}

	public Materia(int idMateria, int idCurso, String nomeMateria, int periodoAssociado, int cargaHoraria) {
		super();
		this.idMateria = idMateria;
		this.idCurso = idCurso;
		this.nomeMateria = nomeMateria;
		this.periodoAssociado = periodoAssociado;
		this.cargaHoraria = cargaHoraria;
	}
	
	private void setEstado() {
		if(this.nota >= 6)
			this.estado = EstadoMateria.APROVADA;
		else
			this.estado = EstadoMateria.DEPENDENTE;
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

	public Date getCursadaUltimaVez() {
		return cursadaUltimaVez;
	}

	public void setCursadaUltimaVez(Date cursadaUltimaVez) {
		this.cursadaUltimaVez = cursadaUltimaVez;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
}