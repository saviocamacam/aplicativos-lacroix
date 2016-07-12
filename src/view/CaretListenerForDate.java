package view;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JSpinner.DateEditor;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

class CaretListenerForDate implements CaretListener
{       
    private JTextField textField;
    private TimeCellEditor dateEditor;

    public CaretListenerForDate(TimeCellEditor dateEditor, JTextField textField)
    {
        this.textField = textField;
        this.dateEditor = dateEditor;
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm"); 
        try {
            dateEditor.setCellEditorValue(dateFormat.parse(textField.getText()));
        } catch (ParseException e1) {
            System.err.println(String.format("Formato de Data Errada! [%s] Erro [%s]", textField.getText(), e1.getMessage() ));
        }

    }              
}