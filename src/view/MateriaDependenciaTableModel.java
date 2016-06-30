package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Materia;

public class MateriaDependenciaTableModel extends AbstractTableModel {
	
	private static final int COL_CHECK = 0;
	private static final int COL_MATERIA = 1;
	private static final int COL_CURSADA = 2;
	
	List<Materia> materias;
	List<Boolean> selecionados;
	
	public MateriaDependenciaTableModel() {
		this.materias = new ArrayList<>();
		this.selecionados = new ArrayList<>();
	}
	
	public MateriaDependenciaTableModel(List<Materia> materias){
		this.materias = materias;
		this.selecionados = new ArrayList<>(materias.size());
		for(Materia m: materias){
			this.selecionados.add(false);
		}
	}
	
	public void addRow(Materia m){
		this.materias.add(m);
		this.fireTableDataChanged();
	}
	
	public void removeRow(int linha){
		this.materias.remove(linha);
		this.fireTableRowsDeleted(linha, linha);
	}

	public Materia get(int linha){
		return this.materias.get(linha);
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return materias.size();
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:
			return true;
		default:
			return false;
		}
	};
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		selecionados.set(rowIndex, (boolean) aValue);
		fireTableRowsUpdated(rowIndex, rowIndex);
	};

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Materia materia = materias.get(rowIndex);
		switch (columnIndex) {
		case COL_CHECK:
			return selecionados.get(rowIndex);
		case COL_MATERIA:
			return materia.getNomeMateria();
		case COL_CURSADA:
			return materia.getCursadaUltimaVez();
		default:
			return "";
		}
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
		case COL_CHECK:
			return "Seleciona";
		case COL_MATERIA:
			return "Matéria";
		case COL_CURSADA:
			return "Cursada pela última vez";
		default:
			return "";
		}
	}
	
	@Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return Boolean.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            default:
            	return Boolean.class;
        }
    }

}
