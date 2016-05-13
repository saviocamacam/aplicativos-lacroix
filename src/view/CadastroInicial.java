package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Color;

public class CadastroInicial extends JPanel {

	/**
	 * Create the panel.
	 */
	public CadastroInicial() {
		
		JTabbedPane panelAbas = new JTabbedPane(JTabbedPane.TOP);
		panelAbas.setName("");
		panelAbas.setBackground(Color.LIGHT_GRAY);
		
		JButton btnAvancar = new JButton("Avançar >>");
		
		JButton btnVoltar = new JButton("<< Voltar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(273)
							.addComponent(btnVoltar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAvancar))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panelAbas, GroupLayout.PREFERRED_SIZE, 434, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(panelAbas, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAvancar)
						.addComponent(btnVoltar))
					.addContainerGap())
		);
		
		CadastroUsuario cadastroUsuario = new CadastroUsuario();
		CadastroInstituicao cadastroInstituicao = new CadastroInstituicao();
		CadastroCurso cadastroCurso = new CadastroCurso();
		panelAbas.addTab("Usuário", null, cadastroUsuario, null);
		panelAbas.addTab("Instituição", null, cadastroInstituicao, null);
		panelAbas.addTab("Curso", null, cadastroCurso, null);

		setLayout(groupLayout);

	}
}
