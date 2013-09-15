package telas;

import Controller.PedidoController;
import classes.Cliente;
import java.util.ArrayList;
import java.util.List;
import relatorios.Relatorios;

/**
 *
 * @author luxu
 */
public class LocalizarPedidoPorCliente extends javax.swing.JDialog {

    public LocalizarPedidoPorCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregarClientesPorPedido();
    }

    private void carregarClientesPorPedido() {
        List<Cliente> listaClientePorPedido = new ArrayList<>();
        listaClientePorPedido = new PedidoController().buscarClientePorPedido();
        cbCliente.removeAll();
        for (Cliente c : listaClientePorPedido) {
            cbCliente.addItem(c.getCliCodigo() + "-" + c.getCliNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbCliente = new javax.swing.JComboBox();
        bConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Pedidos Por Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        bConfirmar.setText("Confirmar");
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(287, Short.MAX_VALUE)
                        .addComponent(bConfirmar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        String cod = cbCliente.getSelectedItem().toString();
        int contador = cod.length(),posicao = 0;
        for (int i = 0; i < contador; i++) {
            if (cod.substring(i, i + 1).equals("-")) {
                 posicao = i + 1;
            }
        }
        Integer cli_codigo = Integer.parseInt(cod.substring(0, posicao-1));
        new Relatorios().relPedidos(cli_codigo);
        this.dispose();
    }//GEN-LAST:event_bConfirmarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConfirmar;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
