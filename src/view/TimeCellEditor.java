package view;

import java.awt.Component;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.AbstractCellEditor;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

public class TimeCellEditor extends AbstractCellEditor implements TableCellEditor {

	private Object cellEditorValue;
	
	@Override
	public Object getCellEditorValue() {
		return this.cellEditorValue;
	}
	
	public void setCellEditorValue(Object value)
    {
        this.cellEditorValue = value;
    }

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		JPanel c = new JPanel();

        if (value instanceof Date)
        {
            final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

            final JTextField textField = new JTextField();

            textField.setText(dateFormat.format(value));

            textField.addCaretListener(new CaretListenerForDate(this, textField));

            c.add(textField);       
        }

        return c;
    }
}
