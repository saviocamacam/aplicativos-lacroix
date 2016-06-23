package view;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import model.Curso;

public class CursoListCellRenderer extends JLabel implements ListCellRenderer<Curso>{

	@Override
	public Component getListCellRendererComponent(JList<? extends Curso> list, Curso value, int index,
			boolean isSelected, boolean cellHasFocus) {
		
		setText(value.getNomeCurso());
		
		return this;
	}

}
