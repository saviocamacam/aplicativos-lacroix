package controller;

import java.util.List;

import javax.swing.JPanel;

import dao.MateriaDao;
import model.Materia;
import view.PanelNovasMaterias;

public class NovasMateriasController {
	private JPanel panelNovasMaterias;
	private List<Materia> novasMaterias;
	private MateriaDao materiaDao;

	public NovasMateriasController(JPanel panel) {
		this.panelNovasMaterias = panel;
	}

}
