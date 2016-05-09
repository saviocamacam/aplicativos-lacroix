package model;

public enum Nivel {
	ENSINOMEDIO("Ensino Médio"),
	ENSINOTECNICO("Ensino Ténico"),
	ENSINOMEDIOTECNICO("Ensino Médio Técnico"),
	GRADUACAO("Graduação"),
	MESTRADO("Mestrado"),
	DOUTORADO("Doutorado");
	
	String nomeDoNivel;
	
	Nivel( String nomeDoNivel ){
		this.nomeDoNivel = nomeDoNivel;
	}
	
	public String getNomeDoNivel() {
		return this.nomeDoNivel;
	}
}
