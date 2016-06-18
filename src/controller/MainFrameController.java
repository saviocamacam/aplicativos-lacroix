package controller;

import java.util.List;

import javax.swing.JFrame;

import dao.MateriaDao;
import model.Evento;
import model.Materia;
public class MainFrameController {
	private List<Materia> materias;
	private JFrame view;
	private MateriaDao daoMateria;
	
	public MainFrameController(JFrame theView){
		this.view = theView;
		this.daoMateria = new MateriaDao();
		this.materias = daoMateria.getMateriasPeriodo(4);
	}
	
}
