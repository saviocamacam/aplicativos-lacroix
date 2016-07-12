package view;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameCadastroInicial extends javax.swing.JFrame {

    private int screen = 1;

    public FrameCadastroInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelUsuario = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        panelNomeUsuario = new javax.swing.JPanel();
        campoNomeUsuario = new javax.swing.JTextField();
        panelRegistroAcademico = new javax.swing.JPanel();
        campoRegistroAcademico = new javax.swing.JTextField();
        panelDataNascimento = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        panelIinstituicao = new javax.swing.JPanel();
        labelInsituicao = new javax.swing.JLabel();
        panelCidade = new javax.swing.JPanel();
        campoRegistroAcademico1 = new javax.swing.JTextField();
        panelNomeInstituicao = new javax.swing.JPanel();
        campoNomeUsuario1 = new javax.swing.JTextField();
        panelCurso = new javax.swing.JPanel();
        labelCurso = new javax.swing.JLabel();
        panelQtdPeriodo = new javax.swing.JPanel();
        comboBoxPeriodos = new javax.swing.JComboBox<>();
        panelNivel = new javax.swing.JPanel();
        comboBoxNivel = new javax.swing.JComboBox<>();
        panelRegime = new javax.swing.JPanel();
        comboBoxRegime = new javax.swing.JComboBox<>();
        panelNomeCurso = new javax.swing.JPanel();
        campoNomeCurso = new javax.swing.JTextField();
        panelButtons = new javax.swing.JPanel();
        voltarPanel = new javax.swing.JButton();
        avancarPanel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        panelPrincipal.setMinimumSize(new java.awt.Dimension(820, 510));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(820, 510));
        panelPrincipal.setLayout(new java.awt.CardLayout());

        panelUsuario.setMinimumSize(new java.awt.Dimension(820, 510));
        panelUsuario.setPreferredSize(new java.awt.Dimension(820, 510));

        labelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelUsuario.setText("Usuario");

        panelNomeUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome de Usuário"));

        campoRegistroAcademico.setInputVerifier( new InputVerifier() {
			
			@Override
			public boolean verify(JComponent arg0) {
				try{
					Integer.parseInt(((JTextField)arg0).getText());
					return true;
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Registro Acadenico contém caracteres inválidos");
					return false;
				}
			}
		});
        
  
        
        
        
        javax.swing.GroupLayout panelNomeUsuarioLayout = new javax.swing.GroupLayout(panelNomeUsuario);
        panelNomeUsuario.setLayout(panelNomeUsuarioLayout);
        panelNomeUsuarioLayout.setHorizontalGroup(
            panelNomeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNomeUsuarioLayout.setVerticalGroup(
            panelNomeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRegistroAcademico.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Academico"));

        javax.swing.GroupLayout panelRegistroAcademicoLayout = new javax.swing.GroupLayout(panelRegistroAcademico);
        panelRegistroAcademico.setLayout(panelRegistroAcademicoLayout);
        panelRegistroAcademicoLayout.setHorizontalGroup(
            panelRegistroAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroAcademicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoRegistroAcademico)
                .addContainerGap())
        );
        panelRegistroAcademicoLayout.setVerticalGroup(
            panelRegistroAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroAcademicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoRegistroAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDataNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"));

        javax.swing.GroupLayout panelDataNascimentoLayout = new javax.swing.GroupLayout(panelDataNascimento);
        panelDataNascimento.setLayout(panelDataNascimentoLayout);
        panelDataNascimentoLayout.setHorizontalGroup(
            panelDataNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataNascimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDataNascimentoLayout.setVerticalGroup(
            panelDataNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataNascimentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(labelUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                        .addComponent(panelRegistroAcademico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUsuario)
                .addGap(121, 121, 121)
                .addComponent(panelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegistroAcademico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelUsuario, "panelUsuario");

        panelIinstituicao.setMinimumSize(new java.awt.Dimension(820, 510));
        panelIinstituicao.setPreferredSize(new java.awt.Dimension(820, 510));

        labelInsituicao.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelInsituicao.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelInsituicao.setText("Instituicao");

        panelCidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade"));

        javax.swing.GroupLayout panelCidadeLayout = new javax.swing.GroupLayout(panelCidade);
        panelCidade.setLayout(panelCidadeLayout);
        panelCidadeLayout.setHorizontalGroup(
            panelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoRegistroAcademico1)
                .addContainerGap())
        );
        panelCidadeLayout.setVerticalGroup(
            panelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoRegistroAcademico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelNomeInstituicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome da Instituição"));

        javax.swing.GroupLayout panelNomeInstituicaoLayout = new javax.swing.GroupLayout(panelNomeInstituicao);
        panelNomeInstituicao.setLayout(panelNomeInstituicaoLayout);
        panelNomeInstituicaoLayout.setHorizontalGroup(
            panelNomeInstituicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeInstituicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoNomeUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNomeInstituicaoLayout.setVerticalGroup(
            panelNomeInstituicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeInstituicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoNomeUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelIinstituicaoLayout = new javax.swing.GroupLayout(panelIinstituicao);
        panelIinstituicao.setLayout(panelIinstituicaoLayout);
        panelIinstituicaoLayout.setHorizontalGroup(
            panelIinstituicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIinstituicaoLayout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(labelInsituicao)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(panelIinstituicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelIinstituicaoLayout.createSequentialGroup()
                    .addGap(189, 189, 189)
                    .addGroup(panelIinstituicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelNomeInstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(150, Short.MAX_VALUE)))
        );
        panelIinstituicaoLayout.setVerticalGroup(
            panelIinstituicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIinstituicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInsituicao)
                .addContainerGap(468, Short.MAX_VALUE))
            .addGroup(panelIinstituicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelIinstituicaoLayout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(panelNomeInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(panelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );

        panelPrincipal.add(panelIinstituicao, "panelInstituicao");

        panelCurso.setMinimumSize(new java.awt.Dimension(820, 510));
        panelCurso.setPreferredSize(new java.awt.Dimension(820, 510));

        labelCurso.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelCurso.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelCurso.setText("Curso");

        panelQtdPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade de Períodos"));

        comboBoxPeriodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPeriodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelQtdPeriodoLayout = new javax.swing.GroupLayout(panelQtdPeriodo);
        panelQtdPeriodo.setLayout(panelQtdPeriodoLayout);
        panelQtdPeriodoLayout.setHorizontalGroup(
            panelQtdPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQtdPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxPeriodos, 0, 123, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelQtdPeriodoLayout.setVerticalGroup(
            panelQtdPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQtdPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelNivel.setBorder(javax.swing.BorderFactory.createTitledBorder("Nível"));

        comboBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNivelLayout = new javax.swing.GroupLayout(panelNivel);
        panelNivel.setLayout(panelNivelLayout);
        panelNivelLayout.setHorizontalGroup(
            panelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxNivel, 0, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNivelLayout.setVerticalGroup(
            panelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelRegime.setBorder(javax.swing.BorderFactory.createTitledBorder("Regime"));

        comboBoxRegime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxRegime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRegimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegimeLayout = new javax.swing.GroupLayout(panelRegime);
        panelRegime.setLayout(panelRegimeLayout);
        panelRegimeLayout.setHorizontalGroup(
            panelRegimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegimeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxRegime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegimeLayout.setVerticalGroup(
            panelRegimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegimeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelNomeCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Curso"));

        javax.swing.GroupLayout panelNomeCursoLayout = new javax.swing.GroupLayout(panelNomeCurso);
        panelNomeCurso.setLayout(panelNomeCursoLayout);
        panelNomeCursoLayout.setHorizontalGroup(
            panelNomeCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoNomeCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNomeCursoLayout.setVerticalGroup(
            panelNomeCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCursoLayout = new javax.swing.GroupLayout(panelCurso);
        panelCurso.setLayout(panelCursoLayout);
        panelCursoLayout.setHorizontalGroup(
            panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCursoLayout.createSequentialGroup()
                .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCursoLayout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(labelCurso))
                    .addGroup(panelCursoLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCursoLayout.createSequentialGroup()
                                .addComponent(panelNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(panelNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panelRegime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelQtdPeriodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        panelCursoLayout.setVerticalGroup(
            panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCurso)
                .addGap(116, 116, 116)
                .addGroup(panelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNomeCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelQtdPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(panelRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        panelQtdPeriodo.getAccessibleContext().setAccessibleName("Regime");

        panelPrincipal.add(panelCurso, "panelCurso");

        getContentPane().add(panelPrincipal);

        panelButtons.setMinimumSize(new java.awt.Dimension(820, 45));

        voltarPanel.setText("Voltar");
        voltarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarPanelActionPerformed(evt);
            }
        });

        avancarPanel.setText("Avancar");
        avancarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(698, Short.MAX_VALUE)
                .addComponent(voltarPanel)
                .addGap(18, 18, 18)
                .addComponent(avancarPanel)
                .addContainerGap())
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarPanel)
                    .addComponent(avancarPanel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelButtons);

        pack();
    }// </editor-fold> 
 

    private void voltarPanelActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if( voltarPanel.isEnabled() && screen == 2){
            CardLayout layout = (CardLayout) panelPrincipal.getLayout();
            layout.show(panelPrincipal, "panelUsuario" );
            screen = 1;
        }
        else if( voltarPanel.isEnabled() && screen == 3){
            CardLayout layout = (CardLayout) panelPrincipal.getLayout();
            layout.show(panelPrincipal, "panelInstituicao" );
            screen = 2;
        }
    }                                           

    String pattern = "\\p{Punct}|\\p{Digit}";
    Pattern r = Pattern.compile(pattern);
    Matcher m ; 
    private void avancarPanelActionPerformed(java.awt.event.ActionEvent evt) { 
    	//checa JTextFields por caracteres especiais
    	m = r.matcher( campoNomeUsuario.getText() );
    	if ( m.find() )
    	{
    		JOptionPane.showMessageDialog(null, "Nome de Usuário tem caracteres invalidos");
    		return ;
    	}
    	m = r.matcher( campoNomeUsuario1.getText() );
     	if ( m.find() )
    	{
    		JOptionPane.showMessageDialog(null, "Nome de Instiuição tem caracteres invalidos");
    		return ;
    	}
     	m = r.matcher( campoRegistroAcademico1.getText() );
     	if ( m.find() )
    	{
    		JOptionPane.showMessageDialog(null, "Nome de Cidade tem caracteres invalidos");
    		return ;
    	}
     	m = r.matcher( campoNomeCurso.getText() );
     	if ( m.find() )
    	{
    		JOptionPane.showMessageDialog(null, "Nome de Curso tem caracteres invalidos");
    		return ;
    	}
        if( avancarPanel.isEnabled() && screen == 1){
            CardLayout layout = (CardLayout) panelPrincipal.getLayout();
            layout.show(panelPrincipal, "panelInstituicao" );
            screen = 2;
        }
        else if( avancarPanel.isEnabled() && screen == 2){
            CardLayout layout = (CardLayout) panelPrincipal.getLayout();
            layout.show(panelPrincipal, "panelCurso" );
            screen = 3;
        }
        else if( avancarPanel.isEnabled() && screen == 3){
        	
        }
    }                                            

    private void comboBoxRegimeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void comboBoxPeriodosActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void comboBoxNivelActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadastroInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton avancarPanel;
    private javax.swing.JTextField campoNomeCurso;
    private javax.swing.JTextField campoNomeUsuario;
    private javax.swing.JTextField campoNomeUsuario1;
    private javax.swing.JTextField campoRegistroAcademico;
    private javax.swing.JTextField campoRegistroAcademico1;
    private javax.swing.JComboBox<String> comboBoxNivel;
    private javax.swing.JComboBox<String> comboBoxPeriodos;
    private javax.swing.JComboBox<String> comboBoxRegime;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel labelInsituicao;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelCidade;
    private javax.swing.JPanel panelCurso;
    private javax.swing.JPanel panelDataNascimento;
    private javax.swing.JPanel panelIinstituicao;
    private javax.swing.JPanel panelNivel;
    private javax.swing.JPanel panelNomeCurso;
    private javax.swing.JPanel panelNomeInstituicao;
    private javax.swing.JPanel panelNomeUsuario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelQtdPeriodo;
    private javax.swing.JPanel panelRegime;
    private javax.swing.JPanel panelRegistroAcademico;
    private javax.swing.JPanel panelRegistroAcademico1;
    private javax.swing.JPanel panelRegistroAcademico2;
    private javax.swing.JPanel panelRegistroAcademico3;
    private javax.swing.JPanel panelRegistroAcademico4;
    private javax.swing.JPanel panelRegistroAcademico5;
    private javax.swing.JPanel panelRegistroAcademico6;
    private javax.swing.JPanel panelRegistroAcademico7;
    private javax.swing.JPanel panelRegistroAcademico8;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JButton voltarPanel;
    // End of variables declaration                   
}
