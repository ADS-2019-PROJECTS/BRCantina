/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeiro.ads.brcantina.views;

/**
 *
 * @author antonio
 */
public class PedidoCaixaJFrame extends javax.swing.JDialog {

    /**
     * Creates new form PedidoCaixaJFrame
     */
    public PedidoCaixaJFrame() {
        this.setModal(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneOptions = new javax.swing.JPanel();
        txtAtendente = new javax.swing.JTextField();
        txtObservacoes = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        lblAtendente = new javax.swing.JLabel();
        lblObservacoes = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnPesquisarCliente = new javax.swing.JButton();
        btnLocalizarProduto = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        scrollItemProduto = new javax.swing.JScrollPane();
        tableItemProduto = new javax.swing.JTable();
        btnPagamento = new javax.swing.JButton();
        lblSubtotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSubtotalResult = new javax.swing.JLabel();
        lblTotalResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido");

        paneOptions.setBackground(new java.awt.Color(123, 123, 123));

        lblAtendente.setForeground(new java.awt.Color(253, 251, 251));
        lblAtendente.setText("Atendente:");

        lblObservacoes.setForeground(new java.awt.Color(253, 251, 251));
        lblObservacoes.setText("Observaçoes:");

        lblCliente.setForeground(new java.awt.Color(253, 251, 251));
        lblCliente.setText("Cliente");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnPesquisarCliente.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        btnPesquisarCliente.setText("Pesquisar Cliente");

        javax.swing.GroupLayout paneOptionsLayout = new javax.swing.GroupLayout(paneOptions);
        paneOptions.setLayout(paneOptionsLayout);
        paneOptionsLayout.setHorizontalGroup(
            paneOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOptionsLayout.createSequentialGroup()
                .addGroup(paneOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneOptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paneOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAtendente)
                            .addComponent(txtObservacoes)
                            .addComponent(txtCliente)
                            .addGroup(paneOptionsLayout.createSequentialGroup()
                                .addGroup(paneOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAtendente)
                                    .addComponent(lblObservacoes)
                                    .addComponent(lblCliente))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(paneOptionsLayout.createSequentialGroup()
                        .addGroup(paneOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneOptionsLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btnVoltar))
                            .addGroup(paneOptionsLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnPesquisarCliente)))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneOptionsLayout.setVerticalGroup(
            paneOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOptionsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblAtendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        btnLocalizarProduto.setBackground(new java.awt.Color(164, 164, 164));
        btnLocalizarProduto.setText("Localizar Produto");
        btnLocalizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarProdutoActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");

        tableItemProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollItemProduto.setViewportView(tableItemProduto);

        btnPagamento.setText("PAGAMENTO");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        lblSubtotal.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        lblSubtotal.setText("Subtotal:");

        lblTotal.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        lblTotal.setText("TOTAL:");

        lblSubtotalResult.setText("0.0");

        lblTotalResult.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        lblTotalResult.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLocalizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSubtotalResult)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scrollItemProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalResult)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocalizarProduto)
                    .addComponent(btnRemover))
                .addGap(16, 16, 16)
                .addComponent(scrollItemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal)
                    .addComponent(lblSubtotalResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotalResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPagamento)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLocalizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarProdutoActionPerformed
        AdicionarAoPedidoJFrame adicionarAoPedidoJFrame = new AdicionarAoPedidoJFrame();
        adicionarAoPedidoJFrame.setVisible(true);
        adicionarAoPedidoJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnLocalizarProdutoActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        PagamentoJFrame pagamentoJFrame = new PagamentoJFrame();
        pagamentoJFrame.setVisible(true);
        pagamentoJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnPagamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedidoCaixaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoCaixaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoCaixaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoCaixaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoCaixaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocalizarProduto;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblAtendente;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSubtotalResult;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalResult;
    private javax.swing.JPanel paneOptions;
    private javax.swing.JScrollPane scrollItemProduto;
    private javax.swing.JTable tableItemProduto;
    private javax.swing.JTextField txtAtendente;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtObservacoes;
    // End of variables declaration//GEN-END:variables
}
