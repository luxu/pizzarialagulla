package telas;

import Controller.ClienteController;
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
public class FecharPedidoTeste extends javax.swing.JDialog {

    private Cliente cliente;
    private PedidoTableModel tableModelPedido;
    private ItensTableModel tableModelItensPedido;

    public FecharPedidoTeste(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jtTabelaPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
        jtfValorPago.setText("");
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
        java.awt.GridBagConstraints gridBagConstraints;

        jbPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtPedido = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jtCelular1 = new javax.swing.JTextField();
        jtObs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lValorPedido = new javax.swing.JLabel();
        cbFormasPagto = new javax.swing.JComboBox();
        jtfValorPago = new javax.swing.JFormattedTextField();
        jcbPedidosCancelados1 = new javax.swing.JCheckBox();
        jdcDtPagto = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jbFecharPedido = new javax.swing.JButton();
        lTroco = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbFechar = new javax.swing.JButton();
        jbGravarAlteracaoPedido = new javax.swing.JButton();
        jbImprimirPedido = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaItensPedido = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTabelaPedidos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jcbPedidosAbertos = new javax.swing.JCheckBox();
        jbCancelar = new javax.swing.JButton();
        jtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Pedido");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(jbPesquisar, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));
        jtPedido.setEnabled(false);

        jtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        jtEndereco.setEnabled(false);

        jtCelular1.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular1"));
        jtCelular1.setEnabled(false);

        jtObs.setBorder(javax.swing.BorderFactory.createTitledBorder("OBS"));
        jtObs.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("DETALHES DO PEDIDO");

        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        jtNome.setEnabled(false);

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Valor Pedido");

        lValorPedido.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lValorPedido.setForeground(new java.awt.Color(255, 51, 51));
        lValorPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lValorPedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lValorPedido.setEnabled(false);

        cbFormasPagto.setBorder(javax.swing.BorderFactory.createTitledBorder("Formas de Pagamento"));
        cbFormasPagto.setEnabled(false);

        jtfValorPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Pago"));
        jtfValorPago.setEnabled(false);

        jcbPedidosCancelados1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcbPedidosCancelados1.setText("Cancelado");

        jdcDtPagto.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Pagamento"));
        jdcDtPagto.setEnabled(false);

        jbFecharPedido.setText("TROCO");
        jbFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharPedidoActionPerformed(evt);
            }
        });

        lTroco.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lTroco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("TROCO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtEndereco)
                    .addComponent(jtNome)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jtObs))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lValorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFormasPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDtPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFecharPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTroco, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbPedidosCancelados1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcDtPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbPedidosCancelados1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbFormasPagto)
                                    .addComponent(lValorPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfValorPago)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });
        jPanel5.add(jbFechar);

        jbGravarAlteracaoPedido.setText("Gravar Alteração do Pedido");
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 339, 29, 0);
        getContentPane().add(jPanel5, gridBagConstraints);

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

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("ITENS DO PEDIDO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 969;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        getContentPane().add(jPanel3, gridBagConstraints);

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
        jtTabelaPedidos.setEnabled(false);
        jScrollPane2.setViewportView(jtTabelaPedidos);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("PEDIDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 1003;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jcbPedidosAbertos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcbPedidosAbertos.setText("Exibir Pedidos em Aberto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 2, 0, 0);
        getContentPane().add(jcbPedidosAbertos, gridBagConstraints);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(jbCancelar, gridBagConstraints);

        jtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));
        try {
            jtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 140;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 324, 0, 0);
        getContentPane().add(jtTelefone, gridBagConstraints);

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
        if (jtfValorPago.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o VALOR PAGO!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            jtfValorPago.requestFocus();
            return;
        }
        Pedido pedido = new PedidoController().PedidoPorCliente(Integer.parseInt(jtPedido.getText()));
        pedido.setPedFormapagamento(cbFormasPagto.getSelectedItem().toString());
        pedido.setPedValorpago(Double.parseDouble(jtfValorPago.getText()));
        Date data = new LocalDate(jdcDtPagto.getDate()).toDateTimeAtCurrentTime().toDate();
        pedido.setPedEntrega(data);
        pedido.setPedFechado("S");
//        new PedidoController()
//                .alterar(pedido.getPedCodigo(),pedido.getCliCodigo(),pedido.getPedDatahora(),
//                    pedido.getPedValortotal(),pedido.getPedDesconto(),pedido.getPedEntrega(),pedido.getPedCancelado(),
//                    pedido.getPedValorpago(),pedido.getPedFormapagamento(),pedido.getPedFechado());
        JOptionPane.showMessageDialog(null, "PEDIDO alterado com sucesso!!");
        this.dispose();
        /*
        this.limparCampos();
        this.desBotoes();
        jbPesquisar.setEnabled(true);
        jtTelefone.setEnabled(true);
        tableModelPedido = new PedidoTableModel();
//        jtTabelaPedidos.setModel(tableModelPedido);
        jtTabelaItensPedido.setModel(new ItensTableModel());
        * */
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
        Double pago, total;
        pago = Double.parseDouble(jtfValorPago.getText());
        total = Double.parseDouble(lValorPedido.getText());
        lTroco.setText(String.valueOf(pago - total));
        jbGravarAlteracaoPedido.setEnabled(true);
    }//GEN-LAST:event_jbFecharPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbFormasPagto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbFecharPedido;
    private javax.swing.JButton jbGravarAlteracaoPedido;
    private javax.swing.JButton jbImprimirPedido;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JCheckBox jcbPedidosAbertos;
    private javax.swing.JCheckBox jcbPedidosCancelados1;
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
    private javax.swing.JLabel lTroco;
    private javax.swing.JLabel lValorPedido;
    // End of variables declaration//GEN-END:variables
}
