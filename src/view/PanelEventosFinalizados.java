package view;

public class PanelEventosFinalizados extends javax.swing.JPanel {

    public PanelEventosFinalizados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelEventosFinalizados = new javax.swing.JTable();
        panelCabecalhoEventosFinalizados = new javax.swing.JPanel();
        labelEventosPendentes = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(600, 600));

        tabelEventosFinalizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Materia", "Evento", "Nota"
            }
        ));
        jScrollPane1.setViewportView(tabelEventosFinalizados);

        labelEventosPendentes.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelEventosPendentes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEventosPendentes.setText("Eventos Finalizados");

        javax.swing.GroupLayout panelCabecalhoEventosFinalizadosLayout = new javax.swing.GroupLayout(panelCabecalhoEventosFinalizados);
        panelCabecalhoEventosFinalizados.setLayout(panelCabecalhoEventosFinalizadosLayout);
        panelCabecalhoEventosFinalizadosLayout.setHorizontalGroup(
            panelCabecalhoEventosFinalizadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelCabecalhoEventosFinalizadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCabecalhoEventosFinalizadosLayout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(labelEventosPendentes)
                    .addContainerGap(174, Short.MAX_VALUE)))
        );
        panelCabecalhoEventosFinalizadosLayout.setVerticalGroup(
            panelCabecalhoEventosFinalizadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(panelCabecalhoEventosFinalizadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCabecalhoEventosFinalizadosLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(labelEventosPendentes)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(panelCabecalhoEventosFinalizados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCabecalhoEventosFinalizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEventosPendentes;
    private javax.swing.JPanel panelCabecalhoEventosFinalizados;
    private javax.swing.JTable tabelEventosFinalizados;
}
