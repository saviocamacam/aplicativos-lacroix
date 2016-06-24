package controller;

import java.util.List;

import dao.CursoDao;
import dao.UsuarioDao;
import model.Curso;
import model.Usuario;
import view.FrameInicial;

public class FrameInicialController {
	private List<Usuario> usuarios;
	private List<Curso> cursos;
	
	public FrameInicialController() {
		usuarios = null;
		cursos = null;	
	}
	
	public List<Curso> getCursos(Usuario usuario) {
		if(cursos== null)
			cursos = CursoDao.recuperarCurso(usuario);
		return cursos;
	}
	
	public List<Usuario> getUsuarios() {
		if(usuarios == null)
			usuarios = UsuarioDao.getAll();
		return usuarios;
	}
}
