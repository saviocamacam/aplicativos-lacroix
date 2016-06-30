package view;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Aula;
import model.DiaSemana;
import model.Professor;

public class HorarioAulaTableModel extends AbstractTableModel {

	private static final int COL_DIA = 0;
	private static final int COL_LOCAL = 1;
	private static final int COL_INICIO = 2;
	private static final int COL_FIM = 3;
	
	List<Aula> aulas;
	
	public HorarioAulaTableModel() {
		this.aulas = new ArrayList<>();
		this.aulas.add(new Aula());
	}
	
	public HorarioAulaTableModel(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
	public void addRow(Aula a){
		this.aulas.add(a);
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
		return 4;
	}

	@Override
	public int getRowCount() {
		return aulas.size();
	}
	
	public List<Aula> getAulas() {
		return this.aulas;
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	};
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Aula aula = aulas.get(rowIndex);
		switch (columnIndex) {
		case COL_DIA:
			aula.setDiaSemana((DiaSemana)aValue);
			break;
		case COL_LOCAL:
			aula.setLocal((String)aValue);
			break;
		case COL_INICIO:
			aula.setHoraInicial((Time)aValue);
			break;
		case COL_FIM:
			aula.setHoraFinal((Time)aValue);
			break;
		default:
			break;
		}
	};
	
	
	@Override
	public java.lang.Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case COL_DIA:
			return DiaSemana.class;
		case COL_LOCAL:
			return String.class;
		case COL_INICIO:
			return Time.class;
		case COL_FIM:
			return Time.class;
		default:
			return null;
		}
	};
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
		case COL_DIA:
			return "Dia";
		case COL_LOCAL:
			return "Local";
		case COL_INICIO:
			return "Início";
		case COL_FIM:
			return "Fim";
		default:
			return "";
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Aula aula = aulas.get(rowIndex);
		switch (columnIndex) {
		case COL_DIA:
			return aula.getDiaSemana();
		case COL_LOCAL:
			return aula.getLocal();
		case COL_INICIO:
			return aula.getHoraInicial();
		case COL_FIM:
			return aula.getHoraFinal();
		default:
			return "";
		}
	}

}
