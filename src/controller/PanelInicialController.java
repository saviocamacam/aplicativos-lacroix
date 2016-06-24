package controller;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dao.CursoDao;
import dao.UsuarioDao;
import model.Curso;
import model.Usuario;
import view.PanelInicial;

public class PanelInicialController {
	private PanelInicial panel;
	private List<Usuario> usuarios;
	private List<Curso> cursos;
	
	public PanelInicialController(PanelInicial panelInicial) {
		this.panel = panelInicial;
		usuarios = UsuarioDao.getBy("1", "1");
		cursos = CursoDao.recuperarCurso(usuarios.get(0));	
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

}