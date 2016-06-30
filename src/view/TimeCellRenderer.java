package view;

import java.awt.Component;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class TimeCellRenderer implements TableCellRenderer {

	private boolean isSelected;
	
	public TimeCellRenderer() {	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {

		this.isSelected = isSelected;
		JPanel c = new JPanel();

		if (value instanceof Time) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
			c.add(new JLabel(dateFormat.format(new Date(((Time)value).getTime())) ) );
		}

		return c;
	}
}
