package telas;

import Controller.BairroController;
import Controller.ClienteController;
import classes.Bairro;
import classes.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.joda.time.LocalDate;

/**
 *
 * @author luxu
 */
public class CadCliente extends javax.swing.JDialog {

    private int operacao;
    private List<Bairro> bairros;
//    private ServicoCliente servicosCliente;

    public CadCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarBairros();
        // definimos o botão como padrão ao apertar o ENTER
//        getRootPane().setDefaultButton(jbConfirma); 
    }

    private void habBotoes() {
        jbConfirma.setEnabled(true);
        jbCancela.setEnabled(true);
        jtNome.setEnabled(true);
        jtEndereco.setEnabled(true);
//        cbBairro.setEnabled(true);
        jtTelRes.setEnabled(true);
        jtCel1.setEnabled(true);
        jtCel2.setEnabled(true);
        jtEmail.setEnabled(true);
        jdcDtNasc.setEnabled(true);
        jtObs.setEnabled(true);
        jtCEP.setEnabled(true);
    }

    private void desBotoes() {
        jbNovo.setEnabled(false);
        jbAltera.setEnabled(false);
        jbExclui.setEnabled(false);
        jbConfirma.setEnabled(false);
        jbBusca.setEnabled(false);
        jtNome.setEnabled(false);
        jtEndereco.setEnabled(false);
//        cbBairro.setEnabled(false);
        jtTelRes.setEnabled(false);
        jtCel1.setEnabled(false);
        jtCel2.setEnabled(false);
        jtEmail.setEnabled(false);
        jdcDtNasc.setEnabled(false);
        jtObs.setEnabled(false);
        jtCEP.setEnabled(false);
    }

    private void apagarCampos() {
        jtCod.setText("");
        jtNome.setText("");
        jtEndereco.setText("");
        cbBairro.setSelectedIndex(-1);
        jtTelRes.setText("");
        jtCel1.setText("");
        jtCel2.setText("");
        jtEmail.setText("");
        jtObs.setText("");
        jtCEP.setText("");
        jdcDtNasc.setDate(null);
    }

    private void carregarBairros() {
        bairros = null;
        bairros = new BairroController().listaBairros();
        cbBairro.removeAll();
        for (Bairro c : bairros) {
            cbBairro.addItem(c.getBaiCodigo() + "-" + c.getBaiNome());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtCod = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jtNome = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jtTelRes = new javax.swing.JFormattedTextField();
        jtCel1 = new javax.swing.JFormattedTextField();
        jtCel2 = new javax.swing.JFormattedTextField();
        jtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtObs = new javax.swing.JTextArea();
        cbBairro = new javax.swing.JComboBox();
        jdcDtNasc = new com.toedter.calendar.JDateChooser();
        jtCEP = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jbConfirma = new javax.swing.JButton();
        jbAltera = new javax.swing.JButton();
        jbExclui = new javax.swing.JButton();
        jbCancela = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbBusca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jtCod.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jtCod.setEnabled(false);

        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome *"));
        jtNome.setEnabled(false);

        jtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço *"));
        jtEndereco.setEnabled(false);

        jtTelRes.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone Principal *"));
        try {
            jtTelRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtTelRes.setText("");
        jtTelRes.setEnabled(false);

        jtCel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Outro Telefone 1"));
        try {
            jtCel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtCel1.setEnabled(false);

        jtCel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Outro Telefone 2"));
        try {
            jtCel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtCel2.setEnabled(false);

        jtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("e-Mail"));
        jtEmail.setEnabled(false);

        jtObs.setColumns(20);
        jtObs.setRows(5);
        jtObs.setBorder(javax.swing.BorderFactory.createTitledBorder("OBS *"));
        jtObs.setEnabled(false);
        jScrollPane1.setViewportView(jtObs);

        cbBairro.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro *"));

        jdcDtNasc.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"));
        jdcDtNasc.setEnabled(false);

        jtCEP.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));
        try {
            jtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtCEP.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jdcDtNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(136, 136, 136))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbBairro)
                    .addComponent(jtCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
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
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExclui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAltera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jbBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jbBusca.setToolTipText("Localizar Clientes");
        jbBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelaActionPerformed
        apagarCampos();
        cbBairro.removeAll();
        cbBairro = new javax.swing.JComboBox();
        desBotoes();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
//        cbBairro.setEnabled(false);
        
    }//GEN-LAST:event_jbCancelaActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jbNovo.setEnabled(false);
        jbBusca.setEnabled(false);
        cbBairro.setEnabled(true);
        habBotoes();
        jtNome.grabFocus();
        int cod = new ClienteController().ultimoID("Cliente", "cli_codigo") + 1;
        jtCod.setText(String.valueOf(cod));
        jtNome.grabFocus();
        operacao = 1;
        carregarBairros();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmaActionPerformed
        if (jtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um NOME!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            jtNome.requestFocus();
            return;
        }
        if (jtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um ENDEREÇO!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            jtEndereco.requestFocus();
            return;
        }
        if (cbBairro.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o BAIRRO!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            cbBairro.requestFocus();
            return;
        }
        if (jtTelRes.getText().equals("    -    ")) {
            JOptionPane.showMessageDialog(null, "Informe o TELEFONE PARA CONTATO!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            jtTelRes.requestFocus();
            return;
        }
        if (jtObs.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo OBS vazio!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            jtObs.requestFocus();
            return;
        }
        Cliente cliente = new Cliente();
        Date data = null;
        /*
         * Máscara usada no JDateChooser
         * new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
         */
        if (jdcDtNasc.getDate() != null){
            LocalDate localDate;
            localDate = new LocalDate(jdcDtNasc.getDate());
            data = localDate.toDateTimeAtCurrentTime().toDate();
        }
        cliente.setCliCodigo(Integer.parseInt(jtCod.getText()));
        String cod = cbBairro.getSelectedItem().toString();
        int contador = cod.length(),posicao = 0;
        for (int i = 0; i < contador; i++) {
            if (cod.substring(i, i + 1).equals("-")) {
                 posicao = i + 1;
            }
        }
        Integer bai_codigo = Integer.parseInt(cod.substring(0, posicao-1));
//        cliente.setBaiCodigo(Integer.parseInt((cbBairro.getSelectedItem().toString()).substring(0, 1)));
        cliente.setBaiCodigo(bai_codigo);
        cliente.setCliNome(jtNome.getText());
        cliente.setCliEndereco(jtEndereco.getText());
        cliente.setCliCEP(jtCEP.getText());
        cliente.setCliTelres(jtTelRes.getText());
        cliente.setCliCelular1(jtCel1.getText());
        cliente.setCliCelular2(jtCel2.getText());
        cliente.setCliDtnasc(data);
        cliente.setCliObs(jtObs.getText());
        cliente.setCliEmail(jtEmail.getText());
        desBotoes();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        if (operacao == 1) {
            if (new ClienteController()
                    .salvar(cliente.getBaiCodigo(),cliente.getCliNome(),cliente.getCliEndereco(),cliente.getCliCEP(),
                    cliente.getCliTelres(),cliente.getCliCelular1(),cliente.getCliCelular2(),cliente.getCliEmail(),cliente.getCliDtnasc(),
                    cliente.getCliObs())==1)
            {
                JOptionPane.showMessageDialog(this, "Informações salvas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar as informações");
            }
        } else {
            if(new ClienteController().alterar(cliente.getCliCodigo(),cliente.getBaiCodigo(),cliente.getCliNome(),
                    cliente.getCliEndereco(),cliente.getCliCEP(),cliente.getCliTelres(),cliente.getCliCelular1(),
                    cliente.getCliCelular2(),cliente.getCliEmail(),cliente.getCliDtnasc(),
                    cliente.getCliObs())==1)
            {
                JOptionPane.showMessageDialog(this, "Informações alteradas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar as informações");
            }
        }
        apagarCampos();
    }//GEN-LAST:event_jbConfirmaActionPerformed

    private void jbBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaActionPerformed
        LocalizarClientes localizarClientes = new LocalizarClientes(null);
        cbBairro.removeAllItems();
        if (localizarClientes.alterarDados()) {
            Cliente cliente = localizarClientes.getCliente();
            jtCod.setText(String.valueOf(cliente.getCliCodigo()));
            jtNome.setText(String.valueOf(cliente.getCliNome()));
            jtEndereco.setText(String.valueOf(cliente.getCliEndereco()));
            jtCEP.setText(String.valueOf(cliente.getCliCEP()));
            jtCel1.setText(String.valueOf(cliente.getCliCelular1()));
            jtCel2.setText(String.valueOf(cliente.getCliCelular2()));
            jtEmail.setText(String.valueOf(cliente.getCliEmail()));
            jtTelRes.setText(String.valueOf(cliente.getCliTelres()));
            jtObs.setText(String.valueOf(cliente.getCliObs()));
            bairros = new ArrayList<>();
            bairros = new BairroController().listaBairros();
            for (Bairro c : bairros) {
                if (c.getBaiCodigo() == cliente.getBaiCodigo()) {
                    cbBairro.addItem(c.getBaiCodigo() + "-" + c.getBaiNome());
                    break;
                }
            }
            for (Bairro c : bairros) {
                if (c.getBaiCodigo() != cliente.getBaiCodigo()) {
                    cbBairro.addItem(c.getBaiCodigo() + "-" + c.getBaiNome());
                }
            }
            jdcDtNasc.setDate(cliente.getCliDtnasc());
        }
        localizarClientes.dispose();
        desBotoes();
        if(!jtCod.getText().equals("")){
            jbAltera.setEnabled(true);
            jbExclui.setEnabled(true);
            jbCancela.setEnabled(true);
        } else {
            jbBusca.setEnabled(true);
            jbNovo.setEnabled(true);
        }
    }//GEN-LAST:event_jbBuscaActionPerformed

    private void jbAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlteraActionPerformed
        desBotoes();
        habBotoes();
        jbBusca.setEnabled(false);
        jtNome.grabFocus();
        jtNome.selectAll();
        operacao = 2;
    }//GEN-LAST:event_jbAlteraActionPerformed

    private void jbExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluiActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma a Exclusão?") == JOptionPane.YES_OPTION) {
            if(new ClienteController().excluir(Integer.parseInt(jtCod.getText()))==1){
                JOptionPane.showMessageDialog(this, "Informações excluídas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir as informações");
            }
        }
        desBotoes();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        apagarCampos();
    }//GEN-LAST:event_jbExcluiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbBairro;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAltera;
    private javax.swing.JButton jbBusca;
    private javax.swing.JButton jbCancela;
    private javax.swing.JButton jbConfirma;
    private javax.swing.JButton jbExclui;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private com.toedter.calendar.JDateChooser jdcDtNasc;
    private javax.swing.JFormattedTextField jtCEP;
    private javax.swing.JFormattedTextField jtCel1;
    private javax.swing.JFormattedTextField jtCel2;
    private javax.swing.JTextField jtCod;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextArea jtObs;
    private javax.swing.JFormattedTextField jtTelRes;
    // End of variables declaration//GEN-END:variables
}
