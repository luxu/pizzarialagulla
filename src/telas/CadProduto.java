package telas;

import Controller.DecimalFormattedField;
import Controller.ProdutoController;
import classes.Produto;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadProduto extends javax.swing.JDialog {

    private int operacao;

    public CadProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void habBotoes() {
        jbConfirma.setEnabled(true);
        jbCancela.setEnabled(true);
        jtDesc.setEnabled(true);
        jtPreco.setEnabled(true);
    }

    private void desBotoes() {
        jbNovo.setEnabled(false);
        jbAltera.setEnabled(false);
        jbExclui.setEnabled(false);
        jbConfirma.setEnabled(false);
        jtDesc.setEnabled(false);
        jtPreco.setEnabled(false);
    }

    private void apagarCampos() {
        jtCod.setText("");
        jtDesc.setText("");
        jtPreco.setText("0.00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbAltera = new javax.swing.JButton();
        jbExclui = new javax.swing.JButton();
        jbConfirma = new javax.swing.JButton();
        jbCancela = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtCod = new javax.swing.JTextField();
        jtDesc = new javax.swing.JTextField();
        jcUnidade = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jbBusca = new javax.swing.JButton();
        jtPreco = new DecimalFormattedField(DecimalFormattedField.REAL);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jbNovo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setPreferredSize(new java.awt.Dimension(80, 30));
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNovo);

        jbAltera.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbAltera.setText("Alterar");
        jbAltera.setEnabled(false);
        jbAltera.setPreferredSize(new java.awt.Dimension(80, 30));
        jbAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlteraActionPerformed(evt);
            }
        });
        jPanel1.add(jbAltera);

        jbExclui.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbExclui.setText("Excluir");
        jbExclui.setEnabled(false);
        jbExclui.setPreferredSize(new java.awt.Dimension(80, 30));
        jbExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluiActionPerformed(evt);
            }
        });
        jPanel1.add(jbExclui);

        jbConfirma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbConfirma.setText("Confirmar");
        jbConfirma.setEnabled(false);
        jbConfirma.setPreferredSize(new java.awt.Dimension(80, 30));
        jbConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmaActionPerformed(evt);
            }
        });
        jPanel1.add(jbConfirma);

        jbCancela.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbCancela.setText("Cancelar");
        jbCancela.setPreferredSize(new java.awt.Dimension(80, 30));
        jbCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelaActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancela);

        jbSair.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbSair.setText("Sair");
        jbSair.setPreferredSize(new java.awt.Dimension(80, 30));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jPanel1.add(jbSair);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtCod.setBackground(java.awt.SystemColor.control);
        jtCod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jtCod.setEnabled(false);
        jPanel2.add(jtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 50));

        jtDesc.setBackground(java.awt.SystemColor.control);
        jtDesc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jtDesc.setEnabled(false);
        jPanel2.add(jtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 60));

        jcUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "garrafa", "porção", "copo" }));
        jcUnidade.setBorder(null);
        jcUnidade.setEnabled(false);
        jPanel2.add(jcUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 150, 30));

        jLabel1.setText("Unidade");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jbBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jbBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaActionPerformed(evt);
            }
        });
        jPanel2.add(jbBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 30, -1));

        jtPreco.setBackground(new java.awt.Color(240, 240, 240));
        jtPreco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jtPreco.setEnabled(false);
        jPanel2.add(jtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 140, 60));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(551, 227));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jbNovo.setEnabled(false);
        jbBusca.setEnabled(false);
        jcUnidade.setEnabled(true);
        habBotoes();
        jtDesc.grabFocus();
        int cod = new ProdutoController().ultimoID("produto", "pro_codigo") + 1;
        jtCod.setText(String.valueOf(cod));
        jtDesc.grabFocus();
        operacao = 1;
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmaActionPerformed
        Integer prod = Integer.parseInt(jtCod.getText());
        String desc = jtDesc.getText();
        Double preco = 0.0;
        try {
            preco = Double.parseDouble(jtPreco.getText().replaceAll("\\,", ".").substring(3));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Erro de formatação no preço.\n" + nfe.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        String unid = jcUnidade.getSelectedItem().toString();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        if (operacao == 1) {
            new ProdutoController().salvar(desc, preco, unid);
        } else {
            new ProdutoController().alterar(prod, desc, preco, unid);
        }
        apagarCampos();
        desBotoes();
    }//GEN-LAST:event_jbConfirmaActionPerformed

    private void jbAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlteraActionPerformed
        desBotoes();
        habBotoes();
        jbBusca.setEnabled(false);
        jtDesc.grabFocus();
        jtDesc.selectAll();
        jcUnidade.setEnabled(true);
        operacao = 2;
        jbConfirma.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("ENTER:");
                }
            }
        });
    }//GEN-LAST:event_jbAlteraActionPerformed

    private void jbExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluiActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma a Exclusão?") == JOptionPane.YES_OPTION) {
            try {
                new ProdutoController().excluir(Integer.parseInt(jtCod.getText()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        desBotoes();
        jbNovo.setEnabled(true);
        apagarCampos();
    }//GEN-LAST:event_jbExcluiActionPerformed

    private void jbCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelaActionPerformed
        desBotoes();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        jcUnidade.setEnabled(false);
        apagarCampos();
    }//GEN-LAST:event_jbCancelaActionPerformed

    private void jbBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaActionPerformed
        LocalizarProdutos localizarProdutos = new LocalizarProdutos(null);
        if (localizarProdutos.alterarDados()) {
            Produto produto = localizarProdutos.getProduto();
            jtCod.setText(String.valueOf(produto.getProCodigo()));
            jtDesc.setText(String.valueOf(produto.getProDescricao()));
            jtPreco.setText(String.valueOf(produto.getProPrecoVenda()));
            jcUnidade.setSelectedItem(produto.getProUnidade());
        }
        localizarProdutos.dispose();
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
    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
}//GEN-LAST:event_jbSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbAltera;
    private javax.swing.JButton jbBusca;
    private javax.swing.JButton jbCancela;
    private javax.swing.JButton jbConfirma;
    private javax.swing.JButton jbExclui;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private javax.swing.JComboBox jcUnidade;
    private javax.swing.JTextField jtCod;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JFormattedTextField jtPreco;
    // End of variables declaration//GEN-END:variables
}
