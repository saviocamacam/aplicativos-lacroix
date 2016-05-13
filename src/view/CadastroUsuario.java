package view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CadastroUsuario extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public CadastroUsuario() {
		
		JPanel panelUsuario = new JPanel();
		
		JLabel label = new JLabel("Nome");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("RA");
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("Data de Nascimento");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		GroupLayout gl_panelUsuario = new GroupLayout(panelUsuario);
		gl_panelUsuario.setHorizontalGroup(
			gl_panelUsuario.createParallelGroup(Alignment.LEADING)
				.addGap(0, 407, Short.MAX_VALUE)
				.addGroup(gl_panelUsuario.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panelUsuario.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelUsuario.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelUsuario.createSequentialGroup()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_1)
					.addGap(4)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
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
								.addComponent(label)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelUsuario.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_2)
								.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelUsuario.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelUsuario.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1))))
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

}
