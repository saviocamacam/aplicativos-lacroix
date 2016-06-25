package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import model.Evento;

public class EventoTableModel extends AbstractTableModel {
	
	private static final int COL_DATA = 0;
	private static final int COL_LOCAL = 1;
	private static final int COL_TIPO = 2;
	private static final int COL_DESCRICAO = 3;
	private static final int COL_DETALHES = 4;
	
	List<Evento> eventos;
	
	public EventoTableModel(List<Evento> eventos) {
		this.eventos.addAll(eventos);
	}

	public EventoTableModel() {
		this.eventos = new ArrayList<>();
	}
	
	public void addRow(Evento e){
		this.eventos.add(e);
		this.fireTableDataChanged();
	}
	
	public void removeRow(int linha){
		this.eventos.remove(linha);
		this.fireTableRowsDeleted(linha, linha);
	}

	public Evento get(int linha){
		return this.eventos.get(linha);
	}
	
	@Override
	public int getColumnCount() {
		return 5;
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
		case COL_DATA:
			return "Data";
		case COL_LOCAL:
			return "Local";
		case COL_TIPO:
			return "Tipo";
		case COL_DESCRICAO:
			return "Descrição";
		case COL_DETALHES:
			return "Detalhes";
		default:
			return "";
		}
	}
	
	@Override
	public int getRowCount() {
		return eventos.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Evento evento = eventos.get(rowIndex);
		switch (columnIndex) {
		case COL_DATA:
			return evento.getDataEvento();
		case COL_LOCAL:
			return evento.getLocalEvento();
		case COL_TIPO:
			return evento.getTipoEvento();
		case COL_DESCRICAO:
			return evento.getDescricao();
		case COL_DETALHES:
			return evento.getDetalhes();
		default:
			return "";
		}
	}

}
