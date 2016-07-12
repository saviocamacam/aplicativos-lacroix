package model;

public enum TipoEvento {
	PROVA("Prova"),
	TRABALHO("Trabalho");
	
	String nomeTipo;
	TipoEvento(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	
	public String getNomeTipoEvento() {
		return this.nomeTipo;
	}
	
	@Override
	public String toString() {
		return this.nomeTipo;
	}
}
