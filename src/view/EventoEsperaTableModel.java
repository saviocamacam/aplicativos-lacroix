package view;

import model.Evento;

public class EventoEsperaTableModel extends EventoTableModel {
	protected static final int COL_NOTA = 5;

	public EventoEsperaTableModel() {
		super();
	}

	@Override
	public int getColumnCount() {
		return super.getColumnCount() + 1;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case COL_NOTA:
			return true;
		default:
			return super.isCellEditable(rowIndex, columnIndex);
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Evento evento = eventos.get(rowIndex);
		switch (columnIndex) {
		case COL_NOTA:
			if (evento.getNotaRecebida() != (float) aValue) {
				evento.setNotaRecebida((float) aValue);
				fireTableCellUpdated(rowIndex, columnIndex);
			}
			break;
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case COL_NOTA:
			return Float.class;
		default:
			return super.getColumnClass(columnIndex);
		}
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
		case COL_NOTA:
			return "Nota";
		default:
			return "";
		}
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
		case COL_NOTA:
			return evento.getNotaRecebida();
		default:
			return "";
		}
	}

}
