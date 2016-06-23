package view;

public class PanelEventosNovo extends javax.swing.JPanel {

    public PanelEventosNovo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        labelSetDependencias = new javax.swing.JLabel();
        labelEventoNovo = new javax.swing.JLabel();
        botaoConcluirEvento = new javax.swing.JButton();
        comboboxTipoEvento = new javax.swing.JComboBox<>();
        labelTipoEvento = new javax.swing.JLabel();
        scrollPaneTextObservacoes = new javax.swing.JScrollPane();
        textObservacoes = new javax.swing.JTextPane();
        labelDescricao = new javax.swing.JLabel();
        comboboxMaterias = new javax.swing.JComboBox<>();
        dateEvento = new com.toedter.calendar.JDateChooser();
        labelMaterias = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        labelDataFinal = new javax.swing.JLabel();
        labelObservacoes = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        campoLocal = new javax.swing.JTextField();

        labelSetDependencias.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelSetDependencias.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSetDependencias.setText("Novo Período");

        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        labelEventoNovo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelEventoNovo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEventoNovo.setText("Novo Evento");

        botaoConcluirEvento.setText("Concluir");
        botaoConcluirEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConcluirEventoActionPerformed(evt);
            }
        });

        comboboxTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxTipoEventoActionPerformed(evt);
            }
        });

        labelTipoEvento.setText("Tipo");

        scrollPaneTextObservacoes.setViewportView(textObservacoes);

        labelDescricao.setText("Nome");

        comboboxMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxMateriasActionPerformed(evt);
            }
        });

        labelMaterias.setText("Materia");

        campoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoActionPerformed(evt);
            }
        });

        labelDataFinal.setText("Data Final");

        labelObservacoes.setText("Observações");

        labelLocal.setText("Local");

        campoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLocalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoConcluirEvento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelObservacoes)
                            .addComponent(labelLocal)
                            .addComponent(campoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMaterias)
                            .addComponent(labelDataFinal)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboboxMaterias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelDescricao)
                                        .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelTipoEvento, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboboxTipoEvento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(scrollPaneTextObservacoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(labelEventoNovo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEventoNovo)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTipoEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(labelMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboboxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDataFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTextObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoConcluirEvento)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void comboboxTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {                                                   

    }                                                  

    private void campoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    private void comboboxMateriasActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
    }                                                

    private void botaoConcluirEventoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
    }                                                   

    private void campoLocalActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }
    
	public static void main(String[] args) {

	}


    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoConcluirEvento;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoLocal;
    private javax.swing.JComboBox<String> comboboxMaterias;
    private javax.swing.JComboBox<String> comboboxTipoEvento;
    private com.toedter.calendar.JDateChooser dateEvento;
    private javax.swing.JLabel labelDataFinal;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelEventoNovo;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelMaterias;
    private javax.swing.JLabel labelObservacoes;
    private javax.swing.JLabel labelSetDependencias;
    private javax.swing.JLabel labelTipoEvento;
    private javax.swing.JScrollPane scrollPaneTextObservacoes;
    private javax.swing.JTextPane textObservacoes;
    // End of variables declaration                   
}




