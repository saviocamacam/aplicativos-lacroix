package view;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelResetPeriodo extends JPanel {
    private JButton avancarPanel;
    private JPanel panelButtons;
    private JPanel panelPrincipal;
    private JButton voltarPanel;
	
    private PanelPeriodosCadastro panelPeriodosCadastro;
    private PanelMateriasDependencias panelMateriasDependencias;
    private PanelMateriasLista panelMateriasLista;
    private PanelMateriasCadastro panelMateriaslCadastro;
    
    
    public PanelResetPeriodo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelButtons = new javax.swing.JPanel();
        voltarPanel = new javax.swing.JButton();
        avancarPanel = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(840, 600));
        setPreferredSize(new java.awt.Dimension(840, 600));

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
                .addContainerGap(658, Short.MAX_VALUE)
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

        panelPrincipal.setMinimumSize(new java.awt.Dimension(820, 510));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }

    private void voltarPanelActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           

    private void avancarPanelActionPerformed(java.awt.event.ActionEvent evt) {                                             

    }                                            
}
