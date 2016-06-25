package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import model.Aula;

public class AulaTableModel extends AbstractTableModel {
	
	private static final int COL_HORARIO= 0;
	private static final int COL_MATERIA = 1;
	private static final int COL_SALA = 2;
	
	List<Aula> aulas;
	
	public AulaTableModel() {
		this.aulas = new ArrayList<>();
	}
	
	public AulaTableModel(List<Aula> aulas) {
		this.aulas.addAll(aulas);
	}

	public void addRow(Aula aula){
		this.aulas.add(aula);
		this.fireTableDataChanged();
	}
	
	public void removeRow(int linha){
		this.aulas.remove(linha);
		this.fireTableRowsDeleted(linha, linha);
	}
	
	public Aula get(int linha){
		return this.aulas.get(linha);
	}
	
	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return this.aulas.size();
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case COL_HORARIO:
			return "Horário";
		case COL_MATERIA:
			return "Matéria";
		case COL_SALA:
			return "Sala";
		default:
			return "";
		}
	};
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Aula aula = this.aulas.get(rowIndex);
		switch (columnIndex) {
		case COL_HORARIO:
			return aula.getHoraInicial();
		case COL_MATERIA:
			return aula.getNomeMateria();
		case COL_SALA:
			return aula.getLocal();
		default:
			return "";
		}
	}

}
