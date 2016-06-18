package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import model.Usuario;

public class UsuarioComboModel extends AbstractListModel<Usuario> implements ComboBoxModel<Usuario>{
	
	private List<Usuario> usuarios;
	private Usuario usuarioSelecionado;
	
	public UsuarioComboModel() {
		super();
		this.usuarios = new ArrayList<>();
	}
	
	public UsuarioComboModel( List<Usuario> usuarios ){
		this();
		this.usuarios.addAll(usuarios);
		if(getSize() > 0){
			setSelectedItem(usuarios.get(0));
		}
		
	}
	
	@Override
	public Usuario getElementAt(int index) {
		return this.usuarios.get(index);
	}

	@Override
	public int getSize() {
		return this.usuarios.size();
	}

	@Override
	public Object getSelectedItem() {
		return this.usuarioSelecionado;
	}

	@Override
	public void setSelectedItem(Object usuario) {
		this.usuarioSelecionado = (Usuario) usuario;
		
	}
	
	public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(usuarios.get(getSize() - 1));
    }
     
    public void addListUsuario(List<Usuario> usuario) {
        int primeiraLinha = getSize();
        usuarios.addAll(usuario);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha  + usuario.size());
        setSelectedItem(usuario.get(getSize() - 1));
    }
     
    public void removeUsuario() {
        usuarios.remove(getSelectedItem());
        fireIntervalRemoved(this, 0, getSize() - 1);
        setSelectedItem(usuarios.get(0));
    }
     
    public void clear() {
        usuarios.clear();
        fireContentsChanged(this, 0, getSize() - 1);
    }
}
