package model;

import java.util.Date;

public class Usuario {
	private long id;
	private String nome;
	private Date nascimento;
	
	public Usuario() {
	}
	
	public Usuario(long id, String nome, Date nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	
}
