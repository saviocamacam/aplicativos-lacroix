package model;

public class Instituicao {
	
	private int idInstituicao;
	private String nomeInstituicao;
	private String nomeCidade;
	
	public Instituicao(int idInstituicao, String nomeInstituicao, String cidade) {
		this.idInstituicao = idInstituicao;
		this.nomeInstituicao = nomeInstituicao;
		this.nomeCidade = cidade;
	}
	
	public Instituicao(String nomeInstituicao, String cidade) {
		this.nomeInstituicao = nomeInstituicao;
		this.nomeCidade = cidade;
	}
	
	public String getNomeCidade() {
		return this.nomeCidade;
	}

	public int getIdInstituicao() {
		return idInstituicao;
	}
	public void setIdInstituicao(int idInstituicao) {
		this.idInstituicao = idInstituicao;
	}
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
}
