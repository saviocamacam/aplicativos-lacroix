package view;

public class PanelPeriodosCadastro extends javax.swing.JPanel {

    public PanelPeriodosCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        scrollText = new javax.swing.JScrollPane();
        textNovoPeriodo = new javax.swing.JTextArea();
        panelDatas = new javax.swing.JPanel();
        selecDataInicial = new com.toedter.calendar.JDateChooser();
        selecDataFinal = new com.toedter.calendar.JDateChooser();
        labelDataInicialPeriodo = new javax.swing.JLabel();
        labelDataFinalPeriodo = new javax.swing.JLabel();
        labelSetDependencias = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(820, 510));
        setPreferredSize(new java.awt.Dimension(820, 510));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollText)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(labelSetDependencias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(panelDatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSetDependencias)
                .addGap(18, 18, 18)
                .addComponent(scrollText, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(112, 112, 112)
                .addComponent(panelDatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel labelDataFinalPeriodo;
    private javax.swing.JLabel labelDataInicialPeriodo;
    private javax.swing.JLabel labelSetDependencias;
    private javax.swing.JPanel panelDatas;
    private javax.swing.JScrollPane scrollText;
    private com.toedter.calendar.JDateChooser selecDataFinal;
    private com.toedter.calendar.JDateChooser selecDataInicial;
    private javax.swing.JTextArea textNovoPeriodo;
    // End of variables declaration                   
}
