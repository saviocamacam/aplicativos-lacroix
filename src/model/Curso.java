package model;

import java.util.ArrayList;

public class Curso {
	private int idCurso;
	private Nivel nivel;
	private int idInstituicao;
	private int idUsuario;
	private Regime regime;
	private String nomeCurso;
	private int qtdPeriodos;
	private ArrayList<Periodo> periodos;
	

	public Curso(Nivel nivel, int idInstituicao, int idUsuario, Regime regime, String nomeCurso, int qtdPeriodos) {
		this.nivel = nivel;
		this.idInstituicao = idInstituicao;
		this.idUsuario = idUsuario;
		this.regime = regime;
		this.nomeCurso = nomeCurso;
		this.qtdPeriodos = qtdPeriodos;
	}
	
	public int getIdCurso() {
		return idCurso;
	}
	
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	
	public Nivel getNivel() {
		return nivel;
	}
	
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	
	public int getIdInstituicao() {
		return idInstituicao;
	}
	
	public void setIdInstituicao(int idInstituicao) {
		this.idInstituicao = idInstituicao;
	}
	
	public Regime getRegime() {
		return regime;
	}
	
	public void setRegime(Regime regime) {
		this.regime = regime;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeDoCurso) {
		this.nomeCurso = nomeDoCurso;
	}
	
	public int getQtdPeriodos() {
		return qtdPeriodos;
	}
	
	public void setQtdPeriodos(int qtdPeriodos) {
		this.qtdPeriodos = qtdPeriodos;
	}
	
	public ArrayList<Periodo> getPeriodos() {
		return periodos;
	}

	public void setPeriodos(ArrayList<Periodo> periodos) {
		this.periodos = periodos;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void addPeriodo(Periodo periodo) {
		this.periodos.add(periodo);
	}
	
}
