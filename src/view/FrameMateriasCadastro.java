package view;

public class FrameMateriasCadastro extends javax.swing.JFrame {

    public FrameMateriasCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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
        botaoConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 600));
        setName("frameMateriasCadastro"); // NOI18N
        setPreferredSize(new java.awt.Dimension(840, 600));

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

        botaoConcluir.setText("Concluir");
        botaoConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(labelSetDependencias))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(labelNomeMateria))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(campoNomeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(labelPeriodoAssociado))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(comboboxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(labelProfessorAssociado)
                .addGap(282, 282, 282)
                .addComponent(labelPeriodoAssociado1))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(comboboxProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(botaoAdicionarProfessor)
                .addGap(80, 80, 80)
                .addComponent(comboboxCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(labelHorarioAulas)
                .addGap(467, 467, 467)
                .addComponent(botaoAdicionarAula))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(scrollHorarioAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(botaoConcluir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelSetDependencias)
                .addGap(18, 18, 18)
                .addComponent(labelNomeMateria)
                .addGap(6, 6, 6)
                .addComponent(campoNomeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelPeriodoAssociado)
                .addGap(6, 6, 6)
                .addComponent(comboboxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProfessorAssociado)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelPeriodoAssociado1)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(comboboxProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoAdicionarProfessor)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(comboboxCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelHorarioAulas))
                    .addComponent(botaoAdicionarAula))
                .addGap(11, 11, 11)
                .addComponent(scrollHorarioAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(botaoConcluir))
        );

        pack();
    }// </editor-fold>                        

    private void botaoAdicionarProfessorActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        FrameNovoProfessor frame = new FrameNovoProfessor();
        frame.setVisible(true);
        frame.setFocusableWindowState(true);
        frame.requestFocus();
    }                                                       

    private void botaoAdicionarAulaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        FrameNovoHorarioAula frame = new FrameNovoHorarioAula();
        frame.setVisible(true);
        frame.setFocusableWindowState(true);
        frame.requestFocus();
    }                                                  

    private void comboboxPeriodoActionPerformed(java.awt.event.ActionEvent evt) {                                                

    }                                               

    private void campoNomeMateriaActionPerformed(java.awt.event.ActionEvent evt) {                                                 

    }                                                

    private void comboboxProfessorActionPerformed(java.awt.event.ActionEvent evt) {                                                  

    }                                                 

    private void comboboxCargaActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                             

    private void botaoConcluirActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        this.dispose();
    }                                             

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMateriasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMateriasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMateriasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMateriasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMateriasCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAdicionarAula;
    private javax.swing.JButton botaoAdicionarProfessor;
    private javax.swing.JButton botaoConcluir;
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
