package view;

import java.sql.Date;
import java.util.Scanner;

import dao.InstituicaoDao;
import dao.UsuarioDao;
import model.Instituicao;
import model.Usuario;

public class Main {
	public static Instituicao instituicao;
	public static Usuario usuario;
	public static Scanner scanner;
	public static InstituicaoDao instituicaoDao;
	public static UsuarioDao usuarioDao;
	public static String nomeInstituicao;
	public static String nomeCidade;
	
	public static void main(String[] args) {
			
		usuario = new Usuario("Savio", 1648160, new Date(1995, 1, 21));
		usuarioDao = new UsuarioDao();
		usuarioDao.cadastrarUsuario(usuario);
		
		System.out.println(usuario.getId());
		
		instituicao = new Instituicao("UTFPR", "Campo Mourao");
		instituicaoDao = new InstituicaoDao();
		instituicaoDao.inserirInstituicao(instituicao);
		
		System.out.println(instituicao.getIdInstituicao());
		
		
	}
}