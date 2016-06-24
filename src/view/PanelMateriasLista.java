package view;

import javax.swing.DefaultCellEditor;

public class PanelMateriasLista extends javax.swing.JPanel {

    public PanelMateriasLista() {
        initComponents();
    }

    @SuppressWarnings({ "unchecked", "serial" })
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMateriasPeriodo = new javax.swing.JTable();
        panelCacebalhoMateriasLista = new javax.swing.JPanel();
        labelSetDependencias = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        adicionarMateria = new javax.swing.JButton();
        removerMateria = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setMinimumSize(new java.awt.Dimension(820, 510));
        setPreferredSize(new java.awt.Dimension(820, 510));

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

        labelSetDependencias.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelSetDependencias.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSetDependencias.setText("Materias");

        jTextPane1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextPane1.setText("Adicione as matérias que serão cursadas nesse período.");
        jScrollPane3.setViewportView(jTextPane1);

        adicionarMateria.setText("Adicionar Matéria");
        adicionarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMateriaActionPerformed(evt);
            }
        });

        removerMateria.setText("Remover Materia");
        removerMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCacebalhoMateriasListaLayout = new javax.swing.GroupLayout(panelCacebalhoMateriasLista);
        panelCacebalhoMateriasLista.setLayout(panelCacebalhoMateriasListaLayout);
        panelCacebalhoMateriasListaLayout.setHorizontalGroup(
            panelCacebalhoMateriasListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(panelCacebalhoMateriasListaLayout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(labelSetDependencias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCacebalhoMateriasListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adicionarMateria)
                .addGap(18, 18, 18)
                .addComponent(removerMateria))
        );
        panelCacebalhoMateriasListaLayout.setVerticalGroup(
            panelCacebalhoMateriasListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCacebalhoMateriasListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSetDependencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCacebalhoMateriasListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarMateria)
                    .addComponent(removerMateria))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCacebalhoMateriasLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCacebalhoMateriasLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }

    private void adicionarMateriaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
    }                                                

    private void removerMateriaActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
    }
	public static void main(String[] args) {

	}


    private javax.swing.JButton adicionarMateria;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelSetDependencias;
    private javax.swing.JPanel panelCacebalhoMateriasLista;
    private javax.swing.JButton removerMateria;
    private javax.swing.JTable tabelaMateriasPeriodo;
}



