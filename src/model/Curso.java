package model;

import java.util.ArrayList;

public class Curso {
	private long idCurso;
	private Nivel nivel;
	private long idInstituicao;
	private Regime regime;
	private String nomeDoCurso;
	private long qtdPeriodos;
	private String cidade;
	private ArrayList<Periodo> periodos;
	

	public Curso(long idCurso, Nivel nivel, long idInstituicao, Regime regime, String nomeDoCurso, long qtdPeriodos,
			String cidade) {
		super();
		this.idCurso = idCurso;
		this.nivel = nivel;
		this.idInstituicao = idInstituicao;
		this.regime = regime;
		this.nomeDoCurso = nomeDoCurso;
		this.qtdPeriodos = qtdPeriodos;
		this.cidade = cidade;
		this.periodos = new ArrayList<>();
	}
	
	public long getIdCurso() {
		return idCurso;
	}
	
	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}
	
	public Nivel getNivel() {
		return nivel;
	}
	
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	
	public long getIdInstituicao() {
		return idInstituicao;
	}
	
	public void setIdInstituicao(long idInstituicao) {
		this.idInstituicao = idInstituicao;
	}
	
	public Regime getRegime() {
		return regime;
	}
	
	public void setRegime(Regime regime) {
		this.regime = regime;
	}
	
	public String getNomeDoCurso() {
		return nomeDoCurso;
	}
	
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public long getQtdPeriodos() {
		return qtdPeriodos;
	}
	
	public void setQtdPeriodos(long qtdPeriodos) {
		this.qtdPeriodos = qtdPeriodos;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
