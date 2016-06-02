package model;

public class Professor {
	private int idProfessor;
	private String nomeProfessor;
	private String email;
	
	public Professor(int idProfessor, String nome, String email) {
		this.idProfessor = idProfessor;
		this.nomeProfessor = nome;
		this.email = email;
	}
	
	public Professor(String nome, String email) {
		this.nomeProfessor = nome;
		this.email = email;
	}
	
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
