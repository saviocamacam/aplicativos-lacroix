package view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroInstituicao extends JPanel implements Submitable{
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public CadastroInstituicao() {
		
		JPanel panelInstituicao = new JPanel();
		
		JLabel label = new JLabel("Cidade");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Nome da Instituição");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_panelInstituicao = new GroupLayout(panelInstituicao);
		gl_panelInstituicao.setHorizontalGroup(
			gl_panelInstituicao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelInstituicao.createSequentialGroup()
					.addGap(5)
					.addComponent(label)
					.addGap(5)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(label_1)
					.addGap(5)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelInstituicao.setVerticalGroup(
			gl_panelInstituicao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelInstituicao.createSequentialGroup()
					.addGap(7)
					.addComponent(label))
				.addGroup(gl_panelInstituicao.createSequentialGroup()
					.addGap(5)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelInstituicao.createSequentialGroup()
					.addGap(7)
					.addComponent(label_1))
				.addGroup(gl_panelInstituicao.createSequentialGroup()
					.addGap(5)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panelInstituicao.setLayout(gl_panelInstituicao);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(panelInstituicao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(30, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(panelInstituicao, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(229, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

}
