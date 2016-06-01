package model;

public enum Nivel {
	ENSINOMEDIO("Ensino Medio"),
	ENSINOTECNICO("Ensino Tenico"),
	ENSINOMEDIOTECNICO("Ensino Medio Tecnico"),
	GRADUACAO("Graduacao"),
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
