package view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class CadastroCurso extends JPanel implements Submitable {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CadastroCurso() {
		setLayout(null);
		
		JPanel panelCurso = new JPanel();
		panelCurso.setBounds(0, 0, 421, 83);
		panelCurso.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(51, 12, 31, 26);
		panelCurso.add(comboBox);
		
		JLabel label = new JLabel("Nível");
		label.setBounds(12, 17, 51, 17);
		panelCurso.add(label);
		
		JLabel label_1 = new JLabel("Nome do Curso");
		label_1.setBounds(100, 17, 83, 17);
		panelCurso.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(201, 15, 183, 21);
		panelCurso.add(textField);
		
		JLabel label_2 = new JLabel("Regime");
		label_2.setBounds(12, 50, 51, 17);
		panelCurso.add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(61, 45, 31, 26);
		panelCurso.add(comboBox_1);
		
		JLabel label_3 = new JLabel("Duração");
		label_3.setBounds(141, 50, 51, 17);
		panelCurso.add(label_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(201, 48, 27, 22);
		panelCurso.add(spinner);
		
		JLabel label_4 = new JLabel("anos");
		label_4.setBounds(235, 48, 51, 17);
		panelCurso.add(label_4);
		add(panelCurso);

	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}
}
