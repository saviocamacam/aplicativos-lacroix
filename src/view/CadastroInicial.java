package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.Submitable;

public class CadastroInicial extends JPanel{

	CadastroUsuario cadastroUsuario;
	CadastroInstituicao cadastroInstituicao;
	CadastroCurso cadastroCurso;
	
	/**
	 * Create the panel.
	 */
	public CadastroInicial() {
		
		JTabbedPane panelAbas = new JTabbedPane(JTabbedPane.TOP);
		panelAbas.setName("");
		panelAbas.setBackground(Color.LIGHT_GRAY);
		
		JButton btnAvancar = new JButton("Avancar >>");
		
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
		
		cadastroUsuario = new CadastroUsuario();
		cadastroInstituicao = new CadastroInstituicao();
		cadastroCurso = new CadastroCurso();
		panelAbas.addTab("Usuário", null, cadastroUsuario, null);
		panelAbas.addTab("Instituição", null, cadastroInstituicao, null);
		panelAbas.addTab("Curso", null, cadastroCurso, null);

		setLayout(groupLayout);
		
		btnAvancar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//TODO: trocar esse metodo nao deprecated
				panelAbas.nextFocus();
			}
		});

	}
}
