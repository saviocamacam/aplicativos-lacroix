package controller;

import java.util.ArrayList;
import java.util.List;

import dao.AulaDao;
import dao.CursoDao;
import dao.InstituicaoDao;
import dao.MateriaDao;
import dao.MateriaPeriodo;
import dao.PeriodoDao;
import dao.ProfessorDao;
import dao.UsuarioDao;
import model.Aula;
import model.Curso;
import model.EstadoMateria;
import model.Instituicao;
import model.Materia;
import model.Periodo;
import model.Professor;
import model.Usuario;
import view.FrameInicial;

public class FrameInicialController {
	private List<Usuario> usuarios;
	private List<Curso> cursos;
	private List<Instituicao> instituicoes;
	private List<Periodo> periodos;
	private List<Materia> materias;
	private List<Professor> professores;

	public FrameInicialController() {
		usuarios = new ArrayList<>();
		cursos = new ArrayList<>();
		instituicoes = new ArrayList<>();
		periodos = new ArrayList<>();
		materias = new ArrayList<>();
		professores = new ArrayList<>();
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
		for(Materia materia : materias){
			MateriaDao.inserirMateria(materia);
			MateriaPeriodo.inserirMateriaPeriodo(materia, this.periodos.get(this.periodos.size()-1));
			this.materias.add(materia);
		}
	}

	public List<Materia> getMateriasDependencia() {
		return MateriaDao.materiasEstado(EstadoMateria.DEPENDENTE);
	}

	public void cadastrarAulas(List<Aula> aulas, Materia novaMateria) {
		for( Aula aula : aulas ){
			aula.setIdMateria(novaMateria.getIdMateria());
			aula.setIdPeriodo(periodos.get(periodos.size()-1).getIdPeriodo());
			AulaDao.inserirAula(aula);
		}
	}

	public void cadastrarMateria(Materia novaMateria, Professor professor) {
		novaMateria.setIdCurso(cursos.get(cursos.size()-1).getIdCurso());
		MateriaDao.inserirMateria(novaMateria);
		MateriaPeriodo.inserirMateriaPeriodo(novaMateria, this.periodos.get(this.periodos.size()-1));
		MateriaPeriodo.inserirProfessorMateria(professor, novaMateria);
		materias.add(novaMateria);
	}

	public void cadastrarProfessor(Professor professor) {
		ProfessorDao.inserirProfessor(professor);
		MateriaPeriodo.inserirProfessorPeriodo(professor, this.periodos.get(this.periodos.size()-1));
		this.professores.add(professor);
	}
}
