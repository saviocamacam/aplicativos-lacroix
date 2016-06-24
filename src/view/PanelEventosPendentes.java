package view;

public class PanelEventosPendentes extends javax.swing.JPanel {

    public PanelEventosPendentes() {
        initComponents();
    }

    @SuppressWarnings({ "unchecked", "serial" })
    private void initComponents() {

        scrollPaneEventosPendentes = new javax.swing.JScrollPane();
        tableEventosPendentes = new javax.swing.JTable();
        panelCabecalhoEventosPendentes = new javax.swing.JPanel();
        botaoAtribuirNota = new javax.swing.JButton();
        labelEventosPendentes = new javax.swing.JLabel();
        botaoFinalizar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        tableEventosPendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Materia", "Tipo", "Evento", "Data", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneEventosPendentes.setViewportView(tableEventosPendentes);

        botaoAtribuirNota.setText("Atribuir Nota");
        botaoAtribuirNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtribuirNotaActionPerformed(evt);
            }
        });

        labelEventosPendentes.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelEventosPendentes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEventosPendentes.setText("Eventos Pendentes");

        botaoFinalizar.setText("Finalizar");
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCabecalhoEventosPendentesLayout = new javax.swing.GroupLayout(panelCabecalhoEventosPendentes);
        panelCabecalhoEventosPendentes.setLayout(panelCabecalhoEventosPendentesLayout);
        panelCabecalhoEventosPendentesLayout.setHorizontalGroup(
            panelCabecalhoEventosPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabecalhoEventosPendentesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCabecalhoEventosPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabecalhoEventosPendentesLayout.createSequentialGroup()
                        .addComponent(botaoAtribuirNota)
                        .addGap(32, 32, 32)
                        .addComponent(botaoFinalizar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabecalhoEventosPendentesLayout.createSequentialGroup()
                        .addComponent(labelEventosPendentes)
                        .addGap(167, 167, 167))))
        );
        panelCabecalhoEventosPendentesLayout.setVerticalGroup(
            panelCabecalhoEventosPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabecalhoEventosPendentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEventosPendentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(panelCabecalhoEventosPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtribuirNota)
                    .addComponent(botaoFinalizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPaneEventosPendentes, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(panelCabecalhoEventosPendentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCabecalhoEventosPendentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(scrollPaneEventosPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }

    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    private void botaoAtribuirNotaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        
    }                                                 

    private javax.swing.JButton botaoAtribuirNota;
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JLabel labelEventosPendentes;
    private javax.swing.JPanel panelCabecalhoEventosPendentes;
    private javax.swing.JScrollPane scrollPaneEventosPendentes;
    private javax.swing.JTable tableEventosPendentes;
}
