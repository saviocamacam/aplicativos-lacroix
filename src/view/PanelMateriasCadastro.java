package view;

import javax.swing.JPanel;

public class PanelMateriasCadastro extends JPanel {

    public PanelMateriasCadastro() {
        initComponents();
    }

    @SuppressWarnings({ "unchecked", "serial" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        botaoAdicionarProfessor = new javax.swing.JButton();
        botaoAdicionarAula = new javax.swing.JButton();
        scrollHorarioAulas = new javax.swing.JScrollPane();
        tabelHorariosAula = new javax.swing.JTable();
        comboboxPeriodo = new javax.swing.JComboBox<>();
        campoNomeMateria = new javax.swing.JTextField();
        labelNomeMateria = new javax.swing.JLabel();
        labelPeriodoAssociado = new javax.swing.JLabel();
        comboboxProfessor = new javax.swing.JComboBox<>();
        labelProfessorAssociado = new javax.swing.JLabel();
        labelSetDependencias = new javax.swing.JLabel();
        labelPeriodoAssociado1 = new javax.swing.JLabel();
        comboboxCarga = new javax.swing.JComboBox<>();
        labelHorarioAulas = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(820, 570));

        botaoAdicionarProfessor.setText("Novo Professor");
        botaoAdicionarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarProfessorActionPerformed(evt);
            }
        });

        botaoAdicionarAula.setText("Novo Horário de Aula");
        botaoAdicionarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarAulaActionPerformed(evt);
            }
        });

        tabelHorariosAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dia", "Local", "Início", "Fim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollHorarioAulas.setViewportView(tabelHorariosAula);

        comboboxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxPeriodoActionPerformed(evt);
            }
        });

        campoNomeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeMateriaActionPerformed(evt);
            }
        });

        labelNomeMateria.setText("Nome");

        labelPeriodoAssociado.setText("Período");

        comboboxProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxProfessorActionPerformed(evt);
            }
        });

        labelProfessorAssociado.setText("Professor");

        labelSetDependencias.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelSetDependencias.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSetDependencias.setText("Materia");
        labelSetDependencias.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        labelPeriodoAssociado1.setText("Carga Horária Semanal");

        comboboxCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCargaActionPerformed(evt);
            }
        });

        labelHorarioAulas.setText("Horários de Aula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelProfessorAssociado)
                                    .addComponent(labelPeriodoAssociado)
                                    .addComponent(comboboxPeriodo, 0, 135, Short.MAX_VALUE)
                                    .addComponent(labelNomeMateria)
                                    .addComponent(comboboxProfessor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAdicionarProfessor)
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelPeriodoAssociado1)
                                    .addComponent(comboboxCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(campoNomeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(labelSetDependencias)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollHorarioAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHorarioAulas)
                        .addGap(467, 467, 467)
                        .addComponent(botaoAdicionarAula)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSetDependencias)
                        .addGap(44, 44, 44)
                        .addComponent(labelNomeMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(labelPeriodoAssociado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelProfessorAssociado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionarProfessor)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPeriodoAssociado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAdicionarAula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelHorarioAulas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollHorarioAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>                        

    private void comboboxPeriodoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
    }                                               

    private void campoNomeMateriaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
    }                                                

    private void comboboxProfessorActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        
    }                                                 

    private void comboboxCargaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    }                                             

    private void botaoAdicionarProfessorActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        
    }                                                       

    private void botaoAdicionarAulaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
    }                                                  


    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAdicionarAula;
    private javax.swing.JButton botaoAdicionarProfessor;
    private javax.swing.JTextField campoNomeMateria;
    private javax.swing.JComboBox<String> comboboxCarga;
    private javax.swing.JComboBox<String> comboboxPeriodo;
    private javax.swing.JComboBox<String> comboboxProfessor;
    private javax.swing.JLabel labelHorarioAulas;
    private javax.swing.JLabel labelNomeMateria;
    private javax.swing.JLabel labelPeriodoAssociado;
    private javax.swing.JLabel labelPeriodoAssociado1;
    private javax.swing.JLabel labelProfessorAssociado;
    private javax.swing.JLabel labelSetDependencias;
    private javax.swing.JScrollPane scrollHorarioAulas;
    private javax.swing.JTable tabelHorariosAula;
    // End of variables declaration                   
}
