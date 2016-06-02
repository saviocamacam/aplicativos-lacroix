package view;

import java.sql.Date;
import java.util.Scanner;

import dao.CursoDao;
import dao.InstituicaoDao;
import dao.UsuarioDao;
import model.Curso;
import model.Instituicao;
import model.Nivel;
import model.Regime;
import model.Usuario;

public class Main {
	public static Scanner scanner;
	public static Usuario usuario;
	public static UsuarioDao usuarioDao;
	public static Instituicao instituicao;
	public static InstituicaoDao instituicaoDao;
	public static Curso curso;
	public static CursoDao cursoDao;
	
	public static void main(String[] args) {
			
		usuario = new Usuario("Savio", 1648160, new Date(1995, 1, 21));
		usuarioDao = new UsuarioDao();
		usuarioDao.cadastrarUsuario(usuario);
		
		System.out.println(usuario.getId());
		
		instituicao = new Instituicao("UTFPR", "Campo Mourao");
		instituicaoDao = new InstituicaoDao();
		instituicaoDao.inserirInstituicao(instituicao);
		
		System.out.println(instituicao.getIdInstituicao());
		
		curso = new Curso(Nivel.GRADUACAO, instituicao.getIdInstituicao(), usuario.getId(), Regime.SEMESTRAL, "BCC", 8);
		cursoDao = new CursoDao();
		cursoDao.inserirCurso(curso);
		
		System.out.println(curso.getIdCurso());
		
		
	}
}