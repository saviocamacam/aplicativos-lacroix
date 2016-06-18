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
	private JPanel panel;
	private List<Usuario> usuarios;
	private List<Curso> cursos;
	
	public PanelInicialController(JPanel panelInicial) {
		this.panel = panelInicial;
		usuarios = UsuarioDao.getUsuarios("nomeusuario", "'Savio Camacam'");
		cursos = CursoDao.recuperarCurso(usuarios.get(0));	
	}

}
