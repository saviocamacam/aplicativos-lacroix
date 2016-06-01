package model;

import java.sql.Date;

public class Usuario {
	private int id;
	private String nome;
	private int registro;
	private Date nascimento;
	
	public Usuario() {
	}
	
	public Usuario(String nome, int registro, Date nascimento) {
		this.nome = nome;
		this.registro = registro;
		this.nascimento = nascimento;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	
}
