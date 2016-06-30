package view;

import java.awt.Component;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class TimeCellRenderer implements TableCellRenderer{

    private boolean isSelected;

	@Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        this.isSelected = isSelected;
		JPanel c = new JPanel();

        if (value instanceof Date)
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
            c.add(new JLabel(dateFormat.format(value)));
        }

        return c;
    }
}
