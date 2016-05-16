package view;

import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.UsuarioController;
import model.Usuario;

public class CadastroUsuario extends JPanel implements Submitable {
	private JTextField txtNome;
	private JTextField txtRA;
	private JTextField fmtTxtNascimento;
	private UsuarioController controller;

	/**
	 * Create the panel.
	 */
	public CadastroUsuario() {
		controller = new UsuarioController(this);
		JPanel panelUsuario = new JPanel();
		
		JLabel lblNome = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblRA = new JLabel("RA");
		
		txtRA = new JTextField();
		txtRA.setToolTipText("");
		txtRA.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento");
		fmtTxtNascimento = new JTextField();
		
		GroupLayout gl_panelUsuario = new GroupLayout(panelUsuario);
		gl_panelUsuario.setHorizontalGroup(
			gl_panelUsuario.createParallelGroup(Alignment.LEADING)
				.addGap(0, 407, Short.MAX_VALUE)
				.addGroup(gl_panelUsuario.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panelUsuario.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelUsuario.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelUsuario.createSequentialGroup()
							.addComponent(lblDataNascimento)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(fmtTxtNascimento)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblRA)
					.addGap(4)
					.addComponent(txtRA, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		gl_panelUsuario.setVerticalGroup(
			gl_panelUsuario.createParallelGroup(Alignment.LEADING)
				.addGap(0, 68, Short.MAX_VALUE)
				.addGroup(gl_panelUsuario.createSequentialGroup()
					.addGroup(gl_panelUsuario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelUsuario.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panelUsuario.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNome)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelUsuario.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDataNascimento)
								.addComponent(fmtTxtNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelUsuario.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelUsuario.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtRA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRA))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelUsuario.setLayout(gl_panelUsuario);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(panelUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(panelUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);

	}
	
	
	@Override
	public void submit() {
		/*
		 * 	TODO: 	- Fix date format and date panel
		 * 			- Date is deprecated
		 */
		Usuario usuario = new Usuario(
				Long.valueOf(txtRA.getText()),
				txtNome.getText(), 
				new Date(fmtTxtNascimento.getText())
				);
		controller.submit(usuario);
	}
}
