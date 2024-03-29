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
public class PagamentoJFrame extends javax.swing.JDialog {

    /**
     * Creates new form PagamentoJFrame
     */
    public PagamentoJFrame() {
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

        scrollItemsPedido = new javax.swing.JScrollPane();
        tableItemsPedido = new javax.swing.JTable();
        paneInformacoes = new javax.swing.JPanel();
        scrollPagamentos = new javax.swing.JScrollPane();
        tablePagamentos = new javax.swing.JTable();
        panePagamento = new javax.swing.JPanel();
        btnDinheiro = new javax.swing.JButton();
        btnDebito = new javax.swing.JButton();
        btnCredito = new javax.swing.JButton();
        paneResumoTotal = new javax.swing.JPanel();
        lblTotalPagamento = new javax.swing.JLabel();
        lblTotalPagamentoResult = new javax.swing.JLabel();
        paneFooter = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento");

        tableItemsPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollItemsPedido.setViewportView(tableItemsPedido);

        paneInformacoes.setBackground(new java.awt.Color(254, 254, 254));

        tablePagamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPagamentos.setViewportView(tablePagamentos);

        panePagamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar um Pagamento:"));

        btnDinheiro.setText("Dinheiro");
        btnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinheiroActionPerformed(evt);
            }
        });

        btnDebito.setText("Debito");

        btnCredito.setText("Credito");

        javax.swing.GroupLayout panePagamentoLayout = new javax.swing.GroupLayout(panePagamento);
        panePagamento.setLayout(panePagamentoLayout);
        panePagamentoLayout.setHorizontalGroup(
            panePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePagamentoLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnDinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panePagamentoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCredito, btnDebito, btnDinheiro});

        panePagamentoLayout.setVerticalGroup(
            panePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePagamentoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDinheiro)
                    .addComponent(btnDebito)
                    .addComponent(btnCredito))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneInformacoesLayout = new javax.swing.GroupLayout(paneInformacoes);
        paneInformacoes.setLayout(paneInformacoesLayout);
        paneInformacoesLayout.setHorizontalGroup(
            paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPagamentos)
            .addGroup(paneInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panePagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneInformacoesLayout.setVerticalGroup(
            paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panePagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        paneResumoTotal.setBackground(new java.awt.Color(254, 254, 254));

        lblTotalPagamento.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblTotalPagamento.setText("Total Para Pagamento:");

        lblTotalPagamentoResult.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblTotalPagamentoResult.setForeground(new java.awt.Color(5, 0, 255));
        lblTotalPagamentoResult.setText("0.0");

        javax.swing.GroupLayout paneResumoTotalLayout = new javax.swing.GroupLayout(paneResumoTotal);
        paneResumoTotal.setLayout(paneResumoTotalLayout);
        paneResumoTotalLayout.setHorizontalGroup(
            paneResumoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneResumoTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalPagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalPagamentoResult)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneResumoTotalLayout.setVerticalGroup(
            paneResumoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneResumoTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneResumoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPagamento)
                    .addComponent(lblTotalPagamentoResult))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        paneFooter.setBackground(new java.awt.Color(162, 162, 162));

        btnFinalizar.setText("FINALIZAR");

        btnVoltar.setText("Voltar");

        javax.swing.GroupLayout paneFooterLayout = new javax.swing.GroupLayout(paneFooter);
        paneFooter.setLayout(paneFooterLayout);
        paneFooterLayout.setHorizontalGroup(
            paneFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneFooterLayout.setVerticalGroup(
            paneFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addGroup(paneFooterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollItemsPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneResumoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(paneFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollItemsPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(paneInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneResumoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(paneFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinheiroActionPerformed
        FinalizarPagamentoJFrame finalizarPagamentoJFrame = new FinalizarPagamentoJFrame();
        finalizarPagamentoJFrame.setVisible(true);
        finalizarPagamentoJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnDinheiroActionPerformed

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
            java.util.logging.Logger.getLogger(PagamentoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnDebito;
    private javax.swing.JButton btnDinheiro;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblTotalPagamento;
    private javax.swing.JLabel lblTotalPagamentoResult;
    private javax.swing.JPanel paneFooter;
    private javax.swing.JPanel paneInformacoes;
    private javax.swing.JPanel panePagamento;
    private javax.swing.JPanel paneResumoTotal;
    private javax.swing.JScrollPane scrollItemsPedido;
    private javax.swing.JScrollPane scrollPagamentos;
    private javax.swing.JTable tableItemsPedido;
    private javax.swing.JTable tablePagamentos;
    // End of variables declaration//GEN-END:variables
}
