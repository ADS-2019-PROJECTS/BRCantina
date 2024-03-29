/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeiro.ads.brcantina.views.internalframe;

import br.com.cruzeiro.ads.brcantina.views.NovaCategoriaJFrame;

/**
 *
 * @author jose.antonio
 */
public class CategoriaProdutoInterFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CategoriaProdutoInterFrame
     */
    public CategoriaProdutoInterFrame() {
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

        paneHeader = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        scrollPaneCategoria = new javax.swing.JScrollPane();
        listCategoria = new javax.swing.JList<>();
        lblTitulos = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Categoria de Produtos");
        setToolTipText("Categoria de Produtos");

        paneHeader.setBackground(new java.awt.Color(153, 153, 153));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        javax.swing.GroupLayout paneHeaderLayout = new javax.swing.GroupLayout(paneHeader);
        paneHeader.setLayout(paneHeaderLayout);
        paneHeaderLayout.setHorizontalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo)
                .addContainerGap())
        );
        paneHeaderLayout.setVerticalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listCategoria.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPaneCategoria.setViewportView(listCategoria);

        lblTitulos.setText("Cadastramento de categorias:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneCategoria)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulos)
                        .addGap(0, 386, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lblTitulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        NovaCategoriaJFrame categoriaJFrame = new NovaCategoriaJFrame();
        categoriaJFrame.setVisible(true);
        categoriaJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel lblTitulos;
    private javax.swing.JList<String> listCategoria;
    private javax.swing.JPanel paneHeader;
    private javax.swing.JScrollPane scrollPaneCategoria;
    // End of variables declaration//GEN-END:variables
}
