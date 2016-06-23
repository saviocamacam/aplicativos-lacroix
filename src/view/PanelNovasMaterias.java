package view;

import javax.swing.DefaultCellEditor;
import javax.swing.JPanel;

import controller.NovasMateriasController;

//@author savio
public class PanelNovasMaterias extends JPanel {
	private NovasMateriasController controllerNovasMaterias;
    public PanelNovasMaterias() {
    	controllerNovasMaterias = new NovasMateriasController(this);
        initComponents();
    }

    @SuppressWarnings({ "unchecked", "serial" })
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        labelSetDependencias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMateriasPeriodo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        adicionarMateria = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setMinimumSize(new java.awt.Dimension(820, 570));
        setPreferredSize(new java.awt.Dimension(820, 570));

        labelSetDependencias.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelSetDependencias.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSetDependencias.setText("Materias");

        tabelaMateriasPeriodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, ""},
                {null, null, null, ""},
                {null, null, null, null},
                {null, null, null, ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Materia", "Professor", "Carga Horária", "Aulas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaMateriasPeriodo);
        if (tabelaMateriasPeriodo.getColumnModel().getColumnCount() > 0) {
            tabelaMateriasPeriodo.getColumnModel().getColumn(2).setMinWidth(100);
            tabelaMateriasPeriodo.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaMateriasPeriodo.getColumnModel().getColumn(2).setMaxWidth(100);
            tabelaMateriasPeriodo.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(jComboBox1));
        }

        jTextPane1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextPane1.setText("Adicione as matérias que serão cursadas nesse período.");
        jScrollPane3.setViewportView(jTextPane1);

        adicionarMateria.setText("Nova Matéria");
        adicionarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(adicionarMateria)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(labelSetDependencias)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSetDependencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adicionarMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>                        

    private void adicionarMateriaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                


    // Variables declaration - do not modify                     
    private javax.swing.JButton adicionarMateria;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelSetDependencias;
    private javax.swing.JTable tabelaMateriasPeriodo;
    // End of variables declaration                   
}
