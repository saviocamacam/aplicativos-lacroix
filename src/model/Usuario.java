package model;

import java.sql.Date;

public class Usuario {
	private int idUsuario;
	private String nomeUsuario;
	private int registro;
	private Date dataNascimento;
	
	public Usuario() {
	}
	
	public Usuario(int idUsuario, String nome, int registro, Date nascimento) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nome;
		this.registro = registro;
		this.dataNascimento = nascimento;
	}
	
	public Usuario(String nome, int registro, Date nascimento) {
		this.nomeUsuario = nome;
		this.registro = registro;
		this.dataNascimento = nascimento;
	}
	
	public int getId() {
		return idUsuario;
	}
	public void setId(int id) {
		this.idUsuario = id;
	}
	public String getNome() {
		return nomeUsuario;
	}
	public void setNome(String nome) {
		this.nomeUsuario = nome;
	}
	public Date getNascimento() {
		return dataNascimento;
	}
	public void setNascimento(Date nascimento) {
		this.dataNascimento = nascimento;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	
}
