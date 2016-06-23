package controller;

import java.util.List;

import javax.swing.JPanel;

import dao.MateriaDao;
import model.Materia;

public class SetDependenciasController {
	private JPanel panelSetDependencias;
	private List<Materia> listaDependencias;
	private MateriaDao materiaDao;
	
	public SetDependenciasController(JPanel panel) {
		this.panelSetDependencias = panel;
	}

}
