package telas;

import Controller.ClienteController;
import Controller.DecimalFormattedField;
import TableModel.PedidoTableModel;
import Controller.ItensController;
import Controller.PedidoController;
import TableModel.ItensTableModel;
import classes.Cliente;
import classes.Pedido;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.joda.time.LocalDate;

/**
 *
 * @author luxu
 */
public class FecharPedido extends javax.swing.JDialog {

    private Cliente cliente;
    private PedidoTableModel tableModelPedido;
    private ItensTableModel tableModelItensPedido;

    public FecharPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jtTabelaPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jtTelefone.requestFocus();
    }

    private void limparCampos() {
        jtTelefone.setText("");
        jtCelular1.setText("");
        jtNome.setText("");
        jtEndereco.setText("");
        jtPedido.setText("");
        jtObs.setText("");
        jtPedido.setText("");
        lTroco.setText("");
        lValorPedido.setText("");
        lTroco.setText("");
        cbFormasPagto.setSelectedIndex(-1);
    }

    private void desBotoes() {
        jbGravarAlteracaoPedido.setEnabled(false);
        jbFecharPedido.setEnabled(false);
        jbPesquisar.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jbPesquisar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtTelefone = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtTabelaPedidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jtPedido = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jtCelular1 = new javax.swing.JTextField();
        jtObs = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        cbFormasPagto = new javax.swing.JComboBox();
        lTroco = new DecimalFormattedField(DecimalFormattedField.REAL);
        jdcDtPagto = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jtfValorPago = new DecimalFormattedField(DecimalFormattedField.REAL);
        lValorPedido = new DecimalFormattedField(DecimalFormattedField.REAL);
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaItensPedido = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jbFecharPedido = new javax.swing.JButton();
        jbGravarAlteracaoPedido = new javax.swing.JButton();
        jbImprimirPedido = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fechar Pedido");
        setPreferredSize(new java.awt.Dimension(725, 700));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(710, 700));

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(710, 700));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));
        try {
            jtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBounds(10, 10, 670, 70);
        jDesktopPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtTabelaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jtTabelaPedidos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBounds(10, 90, 670, 90);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));
        jtPedido.setEnabled(false);

        jtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        jtEndereco.setEnabled(false);

        jtCelular1.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular1"));
        jtCelular1.setEnabled(false);

        jtObs.setBorder(javax.swing.BorderFactory.createTitledBorder("OBS"));
        jtObs.setEnabled(false);

        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        jtNome.setEnabled(false);

        cbFormasPagto.setBorder(javax.swing.BorderFactory.createTitledBorder("Formas de Pagamento"));
        cbFormasPagto.setEnabled(false);

        lTroco.setEditable(false);
        lTroco.setBorder(javax.swing.BorderFactory.createTitledBorder("Troco"));
        lTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lTroco.setEnabled(false);
        lTroco.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jdcDtPagto.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Pagamento"));
        jdcDtPagto.setEnabled(false);

        jtfValorPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Pago"));
        jtfValorPago.setEnabled(false);
        jtfValorPago.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        lValorPedido.setEditable(false);
        lValorPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Pedido"));
        lValorPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lValorPedido.setEnabled(false);
        lValorPedido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNome))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtObs))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lValorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFormasPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcDtPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtEndereco)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jtPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCelular1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jtObs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lTroco)
                    .addComponent(cbFormasPagto)
                    .addComponent(jdcDtPagto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfValorPago, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lValorPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel2.setBounds(10, 190, 670, 300);
        jDesktopPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtTabelaItensPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtTabelaItensPedido.setEnabled(false);
        jScrollPane1.setViewportView(jtTabelaItensPedido);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(922, 922, 922))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBounds(10, 500, 670, 110);
        jDesktopPane1.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jbFecharPedido.setText("Troco");
        jbFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharPedidoActionPerformed(evt);
            }
        });
        jPanel5.add(jbFecharPedido);

        jbGravarAlteracaoPedido.setText("Gravar Alteração");
        jbGravarAlteracaoPedido.setEnabled(false);
        jbGravarAlteracaoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarAlteracaoPedidoActionPerformed(evt);
            }
        });
        jPanel5.add(jbGravarAlteracaoPedido);

        jbImprimirPedido.setText("Imprimir Pedido");
        jbImprimirPedido.setEnabled(false);
        jPanel5.add(jbImprimirPedido);

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });
        jPanel5.add(jbFechar);

        jPanel5.setBounds(58, 620, 510, 50);
        jDesktopPane1.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane3.setViewportView(jDesktopPane1);

        getContentPane().add(jScrollPane3, java.awt.BorderLayout.LINE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        if(!jtTelefone.getText().equals("    -    ")){
            ClienteController controller = new ClienteController();
            cliente = controller.buscaDeClientePorTelefone(jtTelefone.getText());
            if (cliente != null) {
                PedidoController pedidoController = new PedidoController();
                tableModelPedido = new PedidoTableModel(pedidoController.listarPedidoPorCliente(cliente.getCliCodigo()));
                if (tableModelPedido.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Cliente não tem pedido ou estão todos fechados!", null, JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                }
                jtTabelaPedidos.setEnabled(true);
                jtTabelaPedidos.setModel(tableModelPedido);
//                jbCancelar.setEnabled(true);
                jbCancelar.setEnabled(false);
                jtTabelaPedidos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        Pedido pedido;
                        int indice = jtTabelaPedidos.getSelectedRow();
                        pedido = tableModelPedido.getPedido(indice);
                        jtPedido.setText(String.valueOf(pedido.getPedCodigo()));
                        jtNome.setText(String.valueOf(cliente.getCliNome()));
                        jtEndereco.setText(String.valueOf(cliente.getCliEndereco()));
                        jtCelular1.setText(String.valueOf(cliente.getCliCelular1()));
                        jtObs.setText(String.valueOf(cliente.getCliObs()));
                        lValorPedido.setText(String.valueOf(pedido.getPedValortotal()));
                        jtTabelaItensPedido.setEnabled(true);
                        tableModelItensPedido = new ItensTableModel(new ItensController().buscaPorPedido(pedido.getPedCodigo()));
                        jtTabelaItensPedido.setModel(tableModelItensPedido);
                        jtTabelaItensPedido.setEnabled(false);
                        if (JOptionPane.showConfirmDialog(null, "Prosseguir com o pedido?") == JOptionPane.YES_NO_OPTION) {
                            jtTelefone.setEnabled(false);
                            jbPesquisar.setEnabled(false);
                            cbFormasPagto.setEnabled(true);
                            jtfValorPago.setEnabled(true);
//                            lTroco.setEnabled(true);
                            jdcDtPagto.setEnabled(true);
                            jdcDtPagto.setDate(new Date());
                            cbFormasPagto.requestFocus();
                            carregarFormasPagto();
                        } else {
                            lValorPedido.setText("");
                            jtTabelaItensPedido.setModel(new ItensTableModel());
                        }
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado!", null, JOptionPane.ERROR_MESSAGE);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Campo TELEFONE está vazio!", null, JOptionPane.ERROR_MESSAGE);
            jtTelefone.requestFocus();
        }

    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void carregarFormasPagto() {
        cbFormasPagto.removeAll();
        cbFormasPagto.addItem("");
        cbFormasPagto.addItem("Dinheiro");
        cbFormasPagto.addItem("Cartão");
        cbFormasPagto.addItem("Cheque");
    }
    
    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Fechar tela de pedido?") == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbGravarAlteracaoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarAlteracaoPedidoActionPerformed
        if (cbFormasPagto.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a FORMA DE PAGAMENTO!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            cbFormasPagto.requestFocus();
            return;
        }
        if (lTroco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o VALOR PAGO!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            lTroco.requestFocus();
            return;
        }
        Pedido pedido = new PedidoController().PedidoPorCliente(Integer.parseInt(jtPedido.getText()));
        pedido.setPedFormapagamento(cbFormasPagto.getSelectedItem().toString());
        Double valorPago = 0.0;
        try {
            valorPago = Double.parseDouble(lTroco.getText().replaceAll("\\,", ".").substring(3));
        }catch(NumberFormatException nfe){  
            JOptionPane.showMessageDialog(null, "Erro de formatação no preço.\n"+nfe.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        pedido.setPedValorpago(valorPago);
        Date data = new LocalDate(jdcDtPagto.getDate()).toDateTimeAtCurrentTime().toDate();
        pedido.setPedEntrega(data);
        pedido.setPedFechado("S");
        new PedidoController()
                .alterar(pedido.getPedCodigo(),pedido.getCliCodigo(),pedido.getPedDatahora(),
                    pedido.getPedValortotal(),pedido.getPedDesconto(),pedido.getPedEntrega(),pedido.getPedCancelado(),
                    pedido.getPedValorpago(),pedido.getPedFormapagamento(),pedido.getPedFechado());
        JOptionPane.showMessageDialog(null, "PEDIDO alterado com sucesso!!");
        this.dispose();
    }//GEN-LAST:event_jbGravarAlteracaoPedidoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
        jbPesquisar.setEnabled(true);
        jtTelefone.setEnabled(true);
        jbCancelar.setEnabled(false);
        jtTelefone.setText("");
        jtTabelaPedidos.setModel(new PedidoTableModel());
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharPedidoActionPerformed
        Double pago = 0.0, total = 0.0;
        try {
            pago = Double.parseDouble(jtfValorPago.getText().replaceAll("\\,", ".").substring(3));
            total = Double.parseDouble(lValorPedido.getText().replaceAll("\\,", ".").substring(3));
        }catch(NumberFormatException nfe){  
            JOptionPane.showMessageDialog(null, "Erro de formatação no preço.\n"+nfe.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
//        pago = Double.parseDouble(jtfValorPago.getText());
//        total = Double.parseDouble(lValorPedido.getText());
        lTroco.setText(String.valueOf(pago - total));
        jbGravarAlteracaoPedido.setEnabled(true);
    }//GEN-LAST:event_jbFecharPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbFormasPagto;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbFecharPedido;
    private javax.swing.JButton jbGravarAlteracaoPedido;
    private javax.swing.JButton jbImprimirPedido;
    private javax.swing.JButton jbPesquisar;
    private com.toedter.calendar.JDateChooser jdcDtPagto;
    private javax.swing.JTextField jtCelular1;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtObs;
    private javax.swing.JTextField jtPedido;
    private javax.swing.JTable jtTabelaItensPedido;
    private javax.swing.JTable jtTabelaPedidos;
    private javax.swing.JFormattedTextField jtTelefone;
    private javax.swing.JFormattedTextField jtfValorPago;
    private javax.swing.JFormattedTextField lTroco;
    private javax.swing.JFormattedTextField lValorPedido;
    // End of variables declaration//GEN-END:variables
}
