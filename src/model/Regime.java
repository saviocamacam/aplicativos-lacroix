package model;

public enum Regime {
	SEMESTRAL("Semestral"),
	ANUAL("Anual");
	
	String nomeRegime;
	
	Regime( String nomeRegime ){
		this.nomeRegime = nomeRegime;
	}
	
	public String getNomeRegime(){
		return this.nomeRegime;
	}
}
