package telas;

import Controller.ClienteController;
import Controller.ItensController;
import Controller.PedidoController;
import Controller.ProdutoController;
import TableModel.ItensTableModel;
import classes.Cliente;
import classes.Itens;
import classes.Pedido;
import classes.Produto;
import classes.ServicoProduto;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author luxu
 */
public class RegistrarPedido_old extends javax.swing.JDialog {

    public RegistrarPedido_old(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void limparCampos() {
        jtCelular1.setText("");
        jtEndereco.setText("");
        jtNome.setText("");
        jtObs.setText("");
        jtNome.setText("");
    }

    private void carregarProdutos() {
        servicoProduto = new ServicoProduto();
        List<Produto> produtos = null;
        try {
            produtos = servicoProduto.listarProdutos();
        } catch (SQLException ex) {
            Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbPizza.removeAll();
        cbPizza.addItem("");
        for (Produto c : produtos) {
            cbPizza.addItem(c.getProDescricao());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbPesquisar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtNome = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jtCelular1 = new javax.swing.JTextField();
        jtObs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbFechar = new javax.swing.JButton();
        jbGravarPedido = new javax.swing.JButton();
        jbImprimirPedido = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbPizza = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jbIncluir = new javax.swing.JButton();
        jsQtdade = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        lTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbExcluir = new javax.swing.JButton();
        jtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Pedido");

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        jtNome.setEnabled(false);

        jtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        jtEndereco.setEnabled(false);

        jtCelular1.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular1"));
        jtCelular1.setEnabled(false);

        jtObs.setBorder(javax.swing.BorderFactory.createTitledBorder("OBS"));
        jtObs.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("CLIENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNome)
                    .addComponent(jtEndereco)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtObs))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });
        jPanel5.add(jbFechar);

        jbGravarPedido.setText("Gravar Pedido");
        jbGravarPedido.setEnabled(false);
        jbGravarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarPedidoActionPerformed(evt);
            }
        });
        jPanel5.add(jbGravarPedido);

        jbImprimirPedido.setText("Imprimir Pedido");
        jbImprimirPedido.setEnabled(false);
        jPanel5.add(jbImprimirPedido);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("PEDIDO");

        cbPizza.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));
        cbPizza.setEnabled(false);
        cbPizza.setNextFocusableComponent(jsQtdade);

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTabela.setEnabled(false);
        jScrollPane1.setViewportView(jtTabela);

        jbIncluir.setText("Incluir");
        jbIncluir.setEnabled(false);
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        jsQtdade.setEnabled(false);
        jsQtdade.setNextFocusableComponent(jbIncluir);
        jsQtdade.setValue(1);

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("ITENS");

        lTotal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lTotal.setForeground(new java.awt.Color(255, 51, 51));
        lTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lTotal.setEnabled(false);

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Total");

        jbExcluir.setText("Excluir Item");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsQtdade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbIncluir)
                                .addGap(0, 311, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsQtdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIncluir))
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbExcluir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        try {
            jtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCancelar))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jtTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        if (!jtTelefone.getText().equals("    -    ")) {
            ClienteController controller = new ClienteController();
            cliente = controller.buscaDeClientePorTelefone(jtTelefone.getText());
            if (cliente != null) {
                jtNome.setText(cliente.getCliNome());
                jtEndereco.setText(cliente.getCliEndereco());
                jtCelular1.setText(cliente.getCliCelular1());
                jtObs.setText(cliente.getCliObs());
                cbPizza.setEnabled(true);
                jsQtdade.setEnabled(true);
                jbIncluir.setEnabled(true);
                jbCancelar.setEnabled(true);
                jbPesquisar.setEnabled(false);
                jtTabela.setEnabled(true);
                carregarProdutos();
            } else {
                if (JOptionPane.showConfirmDialog(null, "Cliente não cadastrado! Cadastrar?", "Cadastro de Cliente", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    CadCliente cliente = new CadCliente(null, true);
                    cliente.setVisible(true);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo TELEFONE está vazio!");
            jtTelefone.requestFocus();
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
        jbPesquisar.setEnabled(true);
        cbPizza.setEnabled(false);
        jsQtdade.setEnabled(false);
        jbIncluir.setEnabled(false);
        jbCancelar.setEnabled(false);
        jtTelefone.setText("");
        jbGravarPedido.setEnabled(false);
        jbExcluir.setEnabled(false);
        tableModel.limpar();
        lTotal.setText("");
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Fechar tela de pedido?") == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed
//        ProdutoController controller = new ProdutoController();
        Itens itens = this.adicionaItensTemporarios();
        if (tableModel == null) {
            tableModel = new ItensTableModel();
        }
        tableModel.adiciona(itens);
        jtTabela.setModel(tableModel);
        jbExcluir.setEnabled(true);
        somar = 0.0;
        for (int linha = tableModel.getRowCount() - 1; linha >= 0; linha--) {
            somar += (Double) tableModel.getValueAt(linha, 1);
        }
        lTotal.setText(String.valueOf(somar));
        jbGravarPedido.setEnabled(true);
        jsQtdade.setValue(1);
    }//GEN-LAST:event_jbIncluirActionPerformed

    private Itens adicionaItensTemporarios() {
        Itens itens = new Itens();
        Produto produto = new ProdutoController().buscaProdutoPorDescricao(cbPizza.getSelectedItem().toString());
        itens.setIteCodigo(new ItensController().ultimoID("itens", "ite_codigo"));
        itens.setIteProCodigo(produto.getProCodigo());
        itens.setItePedCodigo(new PedidoController().ultimoID("pedido", "ped_codigo") + 1);
        itens.setIteValor(produto.getProPrecoVenda() * (Integer) jsQtdade.getValue());
        itens.setIteQuantidade((Integer) jsQtdade.getValue());
        return itens;
    }

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int indice = jtTabela.getSelectedRow();
        if (indice != -1) {
            Itens itens = tableModel.remove(indice);
            somar = somar - (itens.getIteValor() * itens.getIteQuantidade());
            lTotal.setText(String.valueOf(somar));
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbGravarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarPedidoActionPerformed
        Pedido pedido = new Pedido();
        PedidoController pedidoController = new PedidoController();
        pedido.setCliCodigo(cliente.getCliCodigo());
        pedido.setPedDatahora(new Date());
        pedido.setPedValortotal(somar);
        pedido.setPedFechado("N");
        pedido.setPedCancelado("N");
        pedido.setPedDesconto(0.0);
        try {
            pedidoController.salvar(pedido.getCliCodigo(), pedido.getPedDatahora(),
                    pedido.getPedValortotal(), pedido.getPedFechado());
        } catch (SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        List<Itens> listaItens = new ArrayList<>();
        int ped_codigo = pedidoController.ultimoID("pedido", "ped_codigo");
        Itens itens;
        ItensController itensController = new ItensController();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            listaItens.add(tableModel.getItens(i));
            itens = new Itens();
            itens.setItePedCodigo(ped_codigo);
            itens.setIteProCodigo(listaItens.get(i).getIteProCodigo());
            itens.setIteValor(listaItens.get(i).getIteValor());
            itens.setIteQuantidade(listaItens.get(i).getIteQuantidade());
            System.out.println("Código Produto = " + itens.getIteProCodigo() + "\n"
                    + "Código Pedido = " + itens.getItePedCodigo() + "\n"
                    + "Valor = " + itens.getIteValor() + "\n"
                    + "Quantidade = " + itens.getIteQuantidade() + "\n------------------------");
            try {
                itensController.salvar(itens.getIteProCodigo(), itens.getItePedCodigo(),
                        itens.getIteValor(), itens.getIteQuantidade());
            } catch (SQLException | ParseException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "PEDIDO e ITENS DO PEDIDO salvos com sucesso!!");
        jbCancelarActionPerformed(evt);
    }//GEN-LAST:event_jbGravarPedidoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbGravarPedido;
    private javax.swing.JButton jbImprimirPedido;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JSpinner jsQtdade;
    private javax.swing.JTextField jtCelular1;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtObs;
    private javax.swing.JTable jtTabela;
    private javax.swing.JFormattedTextField jtTelefone;
    private javax.swing.JLabel lTotal;
    // End of variables declaration//GEN-END:variables
    private ServicoProduto servicoProduto;
//    private ProdutoTableModel tableModel;
    private ItensTableModel tableModel;
    private Double somar;
    Cliente cliente;
}
