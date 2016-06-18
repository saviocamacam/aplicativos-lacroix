package view;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import model.Usuario;

public class UsuarioCellRenderer extends DefaultListCellRenderer{
	
	  @Override
	    public Component getListCellRendererComponent(JList<? extends Object> list,
	            Object value, int index, boolean isSelected, boolean cellHasFocus) {
	        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
	         
	        if (value instanceof Usuario) {
	            Usuario usuario = (Usuario) value;
	            setText(usuario.getNome());
	        }
	        return this;
	    }
}
