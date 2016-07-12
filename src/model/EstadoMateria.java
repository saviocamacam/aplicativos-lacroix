package model;

public enum EstadoMateria {
	PENDENTE("Pendente"),
	DEPENDENTE("Dependente"),
	APROVADA("Aprovada");
	
	String nomeEstado;
	
	EstadoMateria(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	
	public String getNomeEstado() {
		return this.nomeEstado;
	}
}
