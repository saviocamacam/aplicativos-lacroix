package model;

public enum DiaSemana {
	SEGUNDA("segunda-feira"),
	TERCA("terca-feira"),
	QUARTA("quarta-feira"),
	QUINTA("quinta-feira"),
	SEXTA("sexta-feira"),
	SABADO("sabado");
	
	String diaSemana;
	
	DiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

}
