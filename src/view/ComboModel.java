package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import model.Usuario;

public class ComboModel<T> extends AbstractListModel<T> implements ComboBoxModel<T> {

	private List<T> elementos;
	private T elementoSelecionado;
	
	public ComboModel(){
		super();
		this.elementos = new ArrayList<>();
	}
	
	public ComboModel(List<T> elementos ) {
		super();
		this.elementos.addAll(elementos);
		if(getSize() > 0){
			setSelectedItem(elementos.get(0));
		}
	}

	@Override
	public int getSize() {
		return this.elementos.size();
	}

	@Override
	public T getElementAt(int index) {
		return this.elementos.get(index);
	}

	@Override
	public void setSelectedItem(Object elemento) {
		this.elementoSelecionado = (T) elemento;
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return this.elementoSelecionado;
	}

}
