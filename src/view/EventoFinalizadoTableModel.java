package view;

import java.util.List;

import model.Evento;

public class EventoFinalizadoTableModel extends EventoTableModel {
	protected static final int COL_NOTA_RECEBIDA = 5;
	protected static final int COL_NOTA_MAX = 6;
	
	public EventoFinalizadoTableModel() {
		super();
	}
	
	public EventoFinalizadoTableModel(List<Evento> eventosFinalizados) {
		super(eventosFinalizados);
	}

	@Override
	public int getColumnCount() {
		return super.getColumnCount() + 2;
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
		case COL_NOTA_RECEBIDA:
			return "Nota";
		case COL_NOTA_MAX:
			return "Nota Máxima";
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
		case COL_NOTA_RECEBIDA:
			return evento.getNotaRecebida();
		case COL_NOTA_MAX:
			return evento.getValorNota();
		default:
			return "";
		}
	}
}
