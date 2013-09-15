package telas;

import Controller.ControleController;
import Controller.DecimalFormattedField;
import TableModel.ControleTableModel;
import classes.Controle;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JOptionPane;
import org.joda.time.LocalDate;

/**
 *
 * @author luxu
 */
public class MovControle extends javax.swing.JDialog {

    private int operacao;
    private Integer codigo;
    private ControleTableModel tableModel;

    public MovControle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jdcData = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        tfDespesas = new DecimalFormattedField(DecimalFormattedField.REAL);
        tfCartao = new DecimalFormattedField(DecimalFormattedField.REAL);
        tfDinheiro = new DecimalFormattedField(DecimalFormattedField.REAL);
        tfTotalDia = new DecimalFormattedField(DecimalFormattedField.REAL);
        tfEntregas = new javax.swing.JFormattedTextField();
        tfTotalPizza = new javax.swing.JFormattedTextField();
        tfNF = new DecimalFormattedField(DecimalFormattedField.REAL);
        jbBusca = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbConfirma = new javax.swing.JButton();
        jbAltera = new javax.swing.JButton();
        jbExclui = new javax.swing.JButton();
        jbCancela = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Diário - PIZZARIA LAGULLA");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(650, 500));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(650, 650));

        jdcData.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));
        jdcData.setEnabled(false);

        tfDespesas.setBorder(javax.swing.BorderFactory.createTitledBorder("Despesas"));
        tfDespesas.setEnabled(false);
        tfDespesas.setPreferredSize(new java.awt.Dimension(16, 50));

        tfCartao.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartão"));
        tfCartao.setEnabled(false);
        tfCartao.setPreferredSize(new java.awt.Dimension(16, 50));

        tfDinheiro.setBorder(javax.swing.BorderFactory.createTitledBorder("Dinheiro"));
        tfDinheiro.setEnabled(false);

        tfTotalDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Total do Dia"));
        tfTotalDia.setEnabled(false);

        tfEntregas.setBorder(javax.swing.BorderFactory.createTitledBorder("Entregas"));
        tfEntregas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfEntregas.setEnabled(false);

        tfTotalPizza.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Pizza"));
        tfTotalPizza.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfTotalPizza.setEnabled(false);

        tfNF.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota Fiscal"));
        tfNF.setEnabled(false);

        jbBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jbBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBusca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTotalDia, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTotalPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDespesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfEntregas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfTotalPizza)
                    .addComponent(tfTotalDia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel1.setBounds(10, 20, 740, 210);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        jScrollPane2.setViewportView(jtTabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Itens");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBounds(10, 240, 740, 130);
        jDesktopPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbConfirma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbConfirma.setText("Confirmar");
        jbConfirma.setEnabled(false);
        jbConfirma.setPreferredSize(new java.awt.Dimension(80, 30));
        jbConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmaActionPerformed(evt);
            }
        });

        jbAltera.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbAltera.setText("Alterar");
        jbAltera.setEnabled(false);
        jbAltera.setPreferredSize(new java.awt.Dimension(80, 30));
        jbAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlteraActionPerformed(evt);
            }
        });

        jbExclui.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbExclui.setText("Excluir");
        jbExclui.setEnabled(false);
        jbExclui.setPreferredSize(new java.awt.Dimension(80, 30));
        jbExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluiActionPerformed(evt);
            }
        });

        jbCancela.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbCancela.setText("Cancelar");
        jbCancela.setEnabled(false);
        jbCancela.setPreferredSize(new java.awt.Dimension(80, 30));
        jbCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelaActionPerformed(evt);
            }
        });

        jbSair.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbSair.setText("Sair");
        jbSair.setPreferredSize(new java.awt.Dimension(80, 30));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setPreferredSize(new java.awt.Dimension(80, 30));
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExclui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAltera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBounds(100, 380, 562, 57);
        jDesktopPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane1.setViewportView(jDesktopPane1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void habCampos() {
        tfDespesas.setEnabled(true);
        tfCartao.setEnabled(true);
        tfDinheiro.setEnabled(true);
        tfEntregas.setEnabled(true);
        tfNF.setEnabled(true);
        tfTotalDia.setEnabled(true);
        tfTotalPizza.setEnabled(true);
        jdcData.setEnabled(true);
        jbBusca.setEnabled(false);
    }

    private void desCampos() {
        tfDespesas.setEnabled(false);
        tfCartao.setEnabled(false);
        tfDinheiro.setEnabled(false);
        tfEntregas.setEnabled(false);
        tfNF.setEnabled(false);
        tfTotalDia.setEnabled(false);
        tfTotalPizza.setEnabled(false);
        jdcData.setEnabled(false);
        jbBusca.setEnabled(true);
    }

    private void habBotoes() {
        jbConfirma.setEnabled(true);
        jbCancela.setEnabled(true);
        tfDespesas.setEnabled(true);
        tfDinheiro.setEnabled(true);
        tfCartao.setEnabled(true);
        tfEntregas.setEnabled(true);
        tfNF.setEnabled(true);
        tfTotalDia.setEnabled(true);
        tfTotalPizza.setEnabled(true);
    }

    private void desBotoes() {
//        jbGravarAlteracaoPedido.setEnabled(false);
//        jbFecharPedido.setEnabled(false);
        jbBusca.setEnabled(false);
    }

    private void apagarCampos() {
        tfDespesas.setText("0.00");
        tfCartao.setText("0.00");
        tfDinheiro.setText("0.00");
        tfEntregas.setText("");
        tfNF.setText("0.00");
        tfTotalDia.setText("0.00");
        tfTotalPizza.setText("");
        jdcData.setDate(new Date());
        jbBusca.setText("");
    }

    private void jbBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaActionPerformed
        LocalizarControles localizarControles = new LocalizarControles(null);
        if (localizarControles.alterarDados()) {
            Controle controle = localizarControles.getControle();
            codigo = controle.getConCodigo();
            jdcData.setDate(controle.getConData());
            tfCartao.setText(String.valueOf(controle.getConvendasCartaoDia()));
            tfDespesas.setText(String.valueOf(controle.getCondespesasDoDia()));
            tfDinheiro.setText(String.valueOf(controle.getConvendasDinheiroDia()));
            tfEntregas.setText(String.valueOf(controle.getContotalPizzaEntregueDia()));
            tfNF.setText(String.valueOf(controle.getConvalorNotaFiscal()));
            tfTotalDia.setText(String.valueOf(controle.getContotalVendasDia()));
            tfTotalPizza.setText(String.valueOf(controle.getContotalPizzaVendidaDia()));
        }
        localizarControles.dispose();
        desBotoes();
        if (jdcData.getDate() != null) {
            jbAltera.setEnabled(true);
            jbExclui.setEnabled(true);
            jbCancela.setEnabled(true);
            jbNovo.setEnabled(false);
        } else {
            jbBusca.setEnabled(true);
            jbNovo.setEnabled(true);
        }
    }//GEN-LAST:event_jbBuscaActionPerformed

    private void jbConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmaActionPerformed
        Controle controle = new Controle();
        Date data = null;
        if (jdcData.getDate() != null) {
            LocalDate localDate;
            localDate = new LocalDate(jdcData.getDate());
            data = localDate.toDateTimeAtCurrentTime().toDate();
        }
        controle.setConCodigo(codigo);
        String vendasDinheiroDia = tfDinheiro.getText().replaceAll("\\,", ".").substring(3);
        String totalVendasDia = tfTotalDia.getText().replaceAll("\\,", ".").substring(3);
        if(totalVendasDia.length()>7){
            String VendasDia = totalVendasDia.substring(0, 1);
            for (int i = 2;i < totalVendasDia.length();i++){
                    VendasDia += totalVendasDia.substring(i, i+1);
            }
            totalVendasDia = VendasDia;
        }
        if(vendasDinheiroDia.length()>7){
            String DinheiroDia = vendasDinheiroDia.substring(0, 1);
            for (int i = 2;i < vendasDinheiroDia.length();i++){
                    DinheiroDia += vendasDinheiroDia.substring(i, i+1);
            }
            vendasDinheiroDia = DinheiroDia;
        }
        Integer pizzaVendida = 0,entregas = 0;
        if (!tfTotalPizza.getText().equals(""))
             pizzaVendida = Integer.parseInt(tfTotalPizza.getText());
        if (!tfEntregas.getText().equals(""))
            entregas = Integer.parseInt(tfEntregas.getText());
        controle.setConData(data);
        controle.setCondespesasDoDia(Double.parseDouble(tfDespesas.getText().replaceAll("\\,", ".").substring(3)));
        controle.setConvendasCartaoDia(Double.parseDouble(tfCartao.getText().replaceAll("\\,", ".").substring(3)));
        controle.setConvendasDinheiroDia(Double.parseDouble(vendasDinheiroDia));
        controle.setContotalVendasDia(new BigDecimal(totalVendasDia));
        controle.setContotalPizzaVendidaDia(pizzaVendida);
        controle.setContotalPizzaEntregueDia(entregas);
        controle.setConvalorNotaFiscal(Double.parseDouble(tfNF.getText().replaceAll("\\,", ".").substring(3)));
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        if (operacao == 1) {
            if (new ControleController().salvar(
                    controle.getConData(),
                    controle.getCondespesasDoDia(),
                    controle.getContotalVendasDia(),
                    controle.getConvendasCartaoDia(),
                    controle.getConvendasDinheiroDia(),
                    controle.getContotalPizzaVendidaDia(),
                    controle.getContotalPizzaEntregueDia(),
                    controle.getConvalorNotaFiscal()) == 1) {
                JOptionPane.showMessageDialog(this, "Informações salvas com sucesso!");
               
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar as informações");
            }
        } else {
            if (new ControleController().alterar(
                    controle.getConCodigo(),
                    controle.getConData(),
                    controle.getCondespesasDoDia(),
                    controle.getContotalVendasDia(),
                    controle.getConvendasCartaoDia(),
                    controle.getConvendasDinheiroDia(),
                    controle.getContotalPizzaVendidaDia(),
                    controle.getContotalPizzaEntregueDia(),
                    controle.getConvalorNotaFiscal()) == 1) {
                JOptionPane.showMessageDialog(this, "Informações alteradas com sucesso!");
                
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar as informações");
            }
        }
        tableModel = new ControleTableModel(new ControleController().listaControles());
        jtTabela.setModel(tableModel);
        this.habBotoes();
        this.apagarCampos();
//        this.desBotoes();
        this.desCampos();
        jbCancela.setEnabled(false);
        jbConfirma.setEnabled(false);
    }//GEN-LAST:event_jbConfirmaActionPerformed

    private void jbAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlteraActionPerformed
        desBotoes();
        habBotoes();
        jbBusca.setEnabled(false);
        jbAltera.setEnabled(false);
        jbExclui.setEnabled(false);
        jbNovo.setEnabled(false);
        jdcData.setEnabled(true);
        operacao = 2;
    }//GEN-LAST:event_jbAlteraActionPerformed

    private void jbExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluiActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma a Exclusão?") == JOptionPane.YES_OPTION) {
            if (new ControleController().excluir(codigo) == 1) {
                JOptionPane.showMessageDialog(this, "Informações excluídas com sucesso!");
                tableModel = new ControleTableModel(new ControleController().listaControles());
                jtTabela.setModel(tableModel);
                jbAltera.setEnabled(false);
                jbCancela.setEnabled(false);
                jbExclui.setEnabled(false);
                jbNovo.setEnabled(true);
                jbBusca.setEnabled(true);
                apagarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir as informações");
            }
        }
    }//GEN-LAST:event_jbExcluiActionPerformed

    private void jbCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelaActionPerformed
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        jbAltera.setEnabled(false);
        jbExclui.setEnabled(false);
        jbConfirma.setEnabled(false);
        jbCancela.setEnabled(false);
        this.desCampos();
        this.apagarCampos();
    }//GEN-LAST:event_jbCancelaActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jbNovo.setEnabled(false);
        jbBusca.setEnabled(false);
        this.habBotoes();
        codigo = new ControleController().ultimoID("Controle", "con_codigo") + 1;
        jdcData.setDate(new Date());
        operacao = 1;
//        jbInserir.setEnabled(true);
        this.habCampos();
        jdcData.requestFocus();
        tableModel = new ControleTableModel(new ControleController().listaControles());
        jtTabela.setModel(tableModel);
    }//GEN-LAST:event_jbNovoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAltera;
    private javax.swing.JButton jbBusca;
    private javax.swing.JButton jbCancela;
    private javax.swing.JButton jbConfirma;
    private javax.swing.JButton jbExclui;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JTable jtTabela;
    private javax.swing.JFormattedTextField tfCartao;
    private javax.swing.JFormattedTextField tfDespesas;
    private javax.swing.JFormattedTextField tfDinheiro;
    private javax.swing.JFormattedTextField tfEntregas;
    private javax.swing.JFormattedTextField tfNF;
    private javax.swing.JFormattedTextField tfTotalDia;
    private javax.swing.JFormattedTextField tfTotalPizza;
    // End of variables declaration//GEN-END:variables
}
