package model;

public enum DiaSemana {
	SEGUNDA("segunda-feira", 2),
	TERCA("terca-feira", 3),
	QUARTA("quarta-feira", 4),
	QUINTA("quinta-feira", 5),
	SEXTA("sexta-feira", 6),
	SABADO("sabado", 7);
	
	String diaSemana;
	int diaSemanaInt;
	
	DiaSemana(String diaSemana, int diaSemanaInt) {
		this.diaSemana = diaSemana;
		this.diaSemanaInt = diaSemanaInt;
	}
	
	DiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	DiaSemana(int diaSemana) {
		this.diaSemanaInt = diaSemana;
	}
}
