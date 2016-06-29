package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CursoDao;
import dao.InstituicaoDao;
import dao.UsuarioDao;
import model.Curso;
import model.Instituicao;
import model.Usuario;
import view.FrameInicial;

public class FrameInicialController {
	private List<Usuario> usuarios;
	private List<Curso> cursos;
	private List<Instituicao> instituicoes;

	public FrameInicialController() {
		usuarios = new ArrayList<>();
		cursos = new ArrayList<>();
		instituicoes = new ArrayList<>();
	}

	public List<Curso> getCursos(Usuario usuario) {
		if (cursos.isEmpty())
			cursos = CursoDao.recuperarCurso(usuario);
		return cursos;
	}

	public List<Usuario> getUsuarios() {
		if (usuarios.isEmpty())
			usuarios = UsuarioDao.getAll();
		return usuarios;
	}

	public List<Instituicao> getInstituicoes() {
		if (instituicoes.isEmpty())
			instituicoes = InstituicaoDao.getAll();
		return instituicoes;
	}

	public void cadastrarUsuario(Usuario usuario) {
		UsuarioDao.cadastrarUsuario(usuario);
		System.out.println(usuario + " " + usuario.getId());
		usuarios.add(usuario);
	}

	public void cadastrarInstituicao(Instituicao instituicao) {
		InstituicaoDao.inserirInstituicao(instituicao);
		System.out.println(instituicao + " " + instituicao.getIdInstituicao());
		instituicoes.add(instituicao);
	}

	public void cadastrarCurso(Usuario usuario, Instituicao instituicao, Curso curso) {
		CursoDao.inserirCurso(usuario, instituicao, curso);
		System.out.println(curso);
		cursos.add(curso);
	}
}
