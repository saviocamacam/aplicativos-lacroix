package model;

public enum DiaSemana {
	DOMINGO(1,"domingo", "Domingo"),
	SEGUNDA(2,"segunda-feira", "Segunda-Feira"),
	TERCA(3,"terca-feira", "Terça-Feira"),
	QUARTA(4,"quarta-feira", "Quarta-Feira"),
	QUINTA(5,"quinta-feira", "Quinta-Feira"),
	SEXTA(6,"sexta-feira", "Sexta-Feira"),
	SABADO(7,"sabado", "Sábado");
	
	private final String diaSemana;
	private final String diaSemanaTxt;
	private final int diaSemanaInt;
	
	DiaSemana(int diaSemanaInt, String diaSemana, String diaSemanaTxt) {
		this.diaSemana = diaSemana;
		this.diaSemanaInt = diaSemanaInt;
		this.diaSemanaTxt = diaSemanaTxt;
	}
	
	public static DiaSemana getDiaSemana( int value ){
		for( DiaSemana dia : values() ){
			if(dia.diaSemanaInt == value)
				return dia;
		}
		return null;
	}
	
	public static DiaSemana getDiaSemana( String value ){
		for( DiaSemana dia : values() ){
			if(dia.diaSemana.equals(value))
				return dia;
		}
		return null;
	}
	
	public String getDiaSemanaBanco() {
		return this.diaSemana;
	}
	
	@Override
	public String toString() {
		return diaSemanaTxt;
	}
}
