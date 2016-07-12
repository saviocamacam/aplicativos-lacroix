package controller;

import javax.swing.JPanel;

import dao.PeriodoDao;
import model.Periodo;

public class CadastroPeriodoController {
	private JPanel panelCadastroPeriodo;
	private Periodo modelPeriodo;
	private PeriodoDao modelPeriodoDao;
	
	public CadastroPeriodoController(JPanel panel) {
		this.panelCadastroPeriodo = panel;
	}

}
