package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CursoDao;
import dao.InstituicaoDao;
import dao.MateriaDao;
import dao.PeriodoDao;
import dao.UsuarioDao;
import model.Curso;
import model.EstadoMateria;
import model.Instituicao;
import model.Materia;
import model.Periodo;
import model.Usuario;
import view.FrameInicial;

public class FrameInicialController {
	private List<Usuario> usuarios;
	private List<Curso> cursos;
	private List<Instituicao> instituicoes;
	private List<Periodo> periodos;
	private List<Materia> materias;

	public FrameInicialController() {
		usuarios = new ArrayList<>();
		cursos = new ArrayList<>();
		instituicoes = new ArrayList<>();
		periodos = new ArrayList<>();
		materias = new ArrayList<>();
	}

	public List<Curso> getCursos(Usuario usuario) {
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
		usuarios.add(usuario);
	}

	public void cadastrarInstituicao(Instituicao instituicao) {
		InstituicaoDao.inserirInstituicao(instituicao);
		instituicoes.add(instituicao);
	}

	public void cadastrarCurso(Usuario usuario, Instituicao instituicao, Curso curso) {
		CursoDao.inserirCurso(usuario, instituicao, curso);
		cursos.add(curso);
	}

	public void cadastrarPeriodo(Periodo periodo) {
		periodo.setIdCurso(cursos.get(cursos.size()-1).getIdCurso());
		PeriodoDao.inserirPeriodo(periodo);
		periodos.add(periodo);
	}

	public void cadastrarMateriasPeriodo(List<Materia> materias) {
		this.materias.addAll(materias);
		for(Materia materia : materias){
			MateriaDao.inserirMateria(materia);
		}
	}

	public List<Materia> getMateriasDependencia() {
		return MateriaDao.materiasEstado(EstadoMateria.DEPENDENTE);
	}
}
