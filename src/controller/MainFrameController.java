package controller;

import javax.swing.JFrame;

import dao.CursoDao;
import dao.InstituicaoDao;
import dao.UsuarioDao;
import model.Curso;
import model.Instituicao;
import model.Usuario;

public class MainFrameController {
	private JFrame frame;
	private Usuario usuario;
	private Curso curso;
	private Instituicao instituicao;
	
	public MainFrameController(JFrame frame){
		this.frame = frame;
		this.usuario = UsuarioDao.getBy("'nomeusuario'", "'Savio Camacam'").get(0);
		this.curso = CursoDao.recuperarCurso(usuario).get(0);
		this.instituicao = InstituicaoDao.getInstituicao(1);
	}
	
	public MainFrameController(JFrame frame, Usuario usuario, Curso curso, Instituicao instituicao) {
		this.frame = frame;
		this.usuario = usuario;
		this.curso = curso;
		this.instituicao = instituicao;
	}
	
}
