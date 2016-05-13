package model;

public class Instituicao {
	
	private int idInstituicao;
	private String nomeInstituicao;
	private String nomeCidade;
	
	public Instituicao(String nomeInstituicao, String cidade) {
		setNomeInstituicao(nomeInstituicao);
		setNomeCidade(cidade);
	}
	
	private void setNomeCidade(String cidade) {
		this.nomeCidade = cidade;
	}
	
	public String getNomeCidade() {
		return this.nomeCidade;
	}

	public int getIdInstituicao() {
		return idInstituicao;
	}
	public void setIdINstituicao(int idInstituicao) {
		this.idInstituicao = idInstituicao;
	}
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
}
