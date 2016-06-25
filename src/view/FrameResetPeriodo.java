package view;

import java.awt.CardLayout;
import javax.swing.JFrame;

public class FrameResetPeriodo extends JFrame {
    private int screen = 1;
    public FrameResetPeriodo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelNovoPeriodo = new javax.swing.JPanel();
        scrollText = new javax.swing.JScrollPane();
        textNovoPeriodo = new javax.swing.JTextArea();
        panelDatas = new javax.swing.JPanel();
        selecDataInicial = new com.toedter.calendar.JDateChooser();
        selecDataFinal = new com.toedter.calendar.JDateChooser();
        labelDataInicialPeriodo = new javax.swing.JLabel();
        labelDataFinalPeriodo = new javax.swing.JLabel();
        labelSetDependencias = new javax.swing.JLabel();
        panelDependencias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        labelSetDependencias1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        panelMateriasLista = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMateriasPeriodo = new javax.swing.JTable();
        panelCacebalhoMateriasLista = new javax.swing.JPanel();
        labelSetDependencias2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        adicionarMateria = new javax.swing.JButton();
        removerMateria = new javax.swing.JButton();
        panelButtons = new javax.swing.JPanel();
        voltarPanel = new javax.swing.JButton();
        avancarPanel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        panelPrincipal.setMinimumSize(new java.awt.Dimension(820, 510));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(820, 510));
        panelPrincipal.setLayout(new java.awt.CardLayout());

        panelNovoPeriodo.setMinimumSize(new java.awt.Dimension(820, 510));
        panelNovoPeriodo.setPreferredSize(new java.awt.Dimension(820, 510));

        textNovoPeriodo.setEditable(false);
        textNovoPeriodo.setColumns(20);
        textNovoPeriodo.setLineWrap(true);
        textNovoPeriodo.setRows(5);
        textNovoPeriodo.setText("O Período compreende o espaço de tempo entre o começo e o fim das aulas. Lacroix vai ajudá-lo nesse período.");
        scrollText.setViewportView(textNovoPeriodo);

        selecDataInicial.setMinimumSize(new java.awt.Dimension(30, 20));

        labelDataInicialPeriodo.setText("Data inicial");

        labelDataFinalPeriodo.setText("Data final");

        javax.swing.GroupLayout panelDatasLayout = new javax.swing.GroupLayout(panelDatas);
        panelDatas.setLayout(panelDatasLayout);
        panelDatasLayout.setHorizontalGroup(
            panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(selecDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(selecDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(panelDatasLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(labelDataInicialPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDataFinalPeriodo)
                .addGap(65, 65, 65))
        );
        panelDatasLayout.setVerticalGroup(
            panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDataFinalPeriodo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDataInicialPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selecDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        labelSetDependencias.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelSetDependencias.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSetDependencias.setText("Novo Período");

        javax.swing.GroupLayout panelNovoPeriodoLayout = new javax.swing.GroupLayout(panelNovoPeriodo);
        panelNovoPeriodo.setLayout(panelNovoPeriodoLayout);
        panelNovoPeriodoLayout.setHorizontalGroup(
            panelNovoPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNovoPeriodoLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(labelSetDependencias))
            .addGroup(panelNovoPeriodoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scrollText, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelNovoPeriodoLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(panelDatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelNovoPeriodoLayout.setVerticalGroup(
            panelNovoPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNovoPeriodoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelSetDependencias)
                .addGap(18, 18, 18)
                .addComponent(scrollText, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(panelDatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPrincipal.add(panelNovoPeriodo, "panelNovoPeriodo");

        panelDependencias.setMinimumSize(new java.awt.Dimension(820, 510));
        panelDependencias.setPreferredSize(new java.awt.Dimension(820, 510));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Materia", "Cursada última vez"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        labelSetDependencias1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelSetDependencias1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSetDependencias1.setText("Dependências");

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextPane1.setText("Aqui estão listadas suas dependencias. Caso vá cursar alguma delas, selecione-as  abaixo:");
        jScrollPane3.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(labelSetDependencias1))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelSetDependencias1)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelDependenciasLayout = new javax.swing.GroupLayout(panelDependencias);
        panelDependencias.setLayout(panelDependenciasLayout);
        panelDependenciasLayout.setHorizontalGroup(
            panelDependenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDependenciasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelDependenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelDependenciasLayout.setVerticalGroup(
            panelDependenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDependenciasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPrincipal.add(panelDependencias, "panelDependencias");

        panelMateriasLista.setMinimumSize(new java.awt.Dimension(820, 510));
        panelMateriasLista.setPreferredSize(new java.awt.Dimension(820, 510));

        tabelaMateriasPeriodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jScrollPane2.setViewportView(tabelaMateriasPeriodo);

        labelSetDependencias2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelSetDependencias2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSetDependencias2.setText("Materias");

        jTextPane2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextPane2.setText("Adicione as matérias que serão cursadas nesse período.");
        jScrollPane4.setViewportView(jTextPane2);

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
            .addComponent(jScrollPane4)
            .addGroup(panelCacebalhoMateriasListaLayout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(labelSetDependencias2)
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
                .addComponent(labelSetDependencias2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCacebalhoMateriasListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarMateria)
                    .addComponent(removerMateria))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout panelMateriasListaLayout = new javax.swing.GroupLayout(panelMateriasLista);
        panelMateriasLista.setLayout(panelMateriasListaLayout);
        panelMateriasListaLayout.setHorizontalGroup(
            panelMateriasListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriasListaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelMateriasListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCacebalhoMateriasLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelMateriasListaLayout.setVerticalGroup(
            panelMateriasListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriasListaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(panelCacebalhoMateriasLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPrincipal.add(panelMateriasLista, "panelMateriasLista");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void avancarPanelActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if( avancarPanel.isEnabled() && screen == 1){
            CardLayout layout = (CardLayout) panelPrincipal.getLayout();
            layout.show(panelPrincipal, "panelDependencias" );
            screen = 2;
        }
        else if( avancarPanel.isEnabled() && screen == 2){
            CardLayout layout = (CardLayout) panelPrincipal.getLayout();
            layout.show(panelPrincipal, "panelMateriasLista" );
            screen = 3;
        }
        else if( avancarPanel.isEnabled() && screen == 3){
            
        }
    }                                            

    private void voltarPanelActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if( voltarPanel.isEnabled() && screen == 2){
            CardLayout layout = (CardLayout) panelPrincipal.getLayout();
            layout.show(panelPrincipal, "panelNovoPeriodo" );
            screen = 1;
        }
        else if( voltarPanel.isEnabled() && screen == 3){
            CardLayout layout = (CardLayout) panelPrincipal.getLayout();
            layout.show(panelPrincipal, "panelDependencias" );
            screen = 2;
        }
    }                                           

    private void adicionarMateriaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        FrameMateriasCadastro frame = new FrameMateriasCadastro();
        frame.setVisible(true);
        frame.setFocusableWindowState(true);
        frame.requestFocus();
    }                                                

    private void removerMateriaActionPerformed(java.awt.event.ActionEvent evt) {                                               

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
            java.util.logging.Logger.getLogger(FrameResetPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameResetPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameResetPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameResetPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameResetPeriodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton adicionarMateria;
    private javax.swing.JButton avancarPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel labelDataFinalPeriodo;
    private javax.swing.JLabel labelDataInicialPeriodo;
    private javax.swing.JLabel labelSetDependencias;
    private javax.swing.JLabel labelSetDependencias1;
    private javax.swing.JLabel labelSetDependencias2;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelCacebalhoMateriasLista;
    private javax.swing.JPanel panelDatas;
    private javax.swing.JPanel panelDependencias;
    private javax.swing.JPanel panelMateriasLista;
    private javax.swing.JPanel panelNovoPeriodo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton removerMateria;
    private javax.swing.JScrollPane scrollText;
    private com.toedter.calendar.JDateChooser selecDataFinal;
    private com.toedter.calendar.JDateChooser selecDataInicial;
    private javax.swing.JTable tabelaMateriasPeriodo;
    private javax.swing.JTextArea textNovoPeriodo;
    private javax.swing.JButton voltarPanel;
    // End of variables declaration                   
}
