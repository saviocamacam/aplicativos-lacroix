package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Materia;
import model.Professor;

public class ProfessorTableModel extends AbstractTableModel {
	
	private static final int COL_NOME= 0;
	private static final int COL_EMAIL= 1;
	
	List<Professor> professores;
	
	public ProfessorTableModel() {
		this.professores = new ArrayList<>();
	}
	
	public ProfessorTableModel(List<Professor> professores) {
		this.professores = professores;
	}
	
	public void addRow(Professor p){
		this.professores.add(p);
		this.fireTableDataChanged();
	}
	
	public void removeRow(int linha){
		this.professores.remove(linha);
		this.fireTableRowsDeleted(linha, linha);
	}

	public Professor get(int linha){
		return this.professores.get(linha);
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public int getRowCount() {
		return professores.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Professor professor = professores.get(rowIndex);
		switch (columnIndex) {
		case COL_NOME:
			return professor.getNomeProfessor();
		case COL_EMAIL:
			return professor.getEmail();
		default:
			return "";
		}
	}

}
