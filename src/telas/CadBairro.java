package telas;

import Controller.BairroController;
import boteko.Gamb;
import classes.Bairro;
import javax.swing.JOptionPane;

public class CadBairro extends javax.swing.JDialog {
    
    private int operacao;

    public CadBairro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private void habBotoes() {
        jbConfirma.setEnabled(true);
        jbCancela.setEnabled(true);
        jtCod.setEnabled(true);
        jtNome.setEnabled(true);
    }
    
    private void desBotoes() {
        jbNovo.setEnabled(false);
        jbAltera.setEnabled(false);
        jbExclui.setEnabled(false);
        jbConfirma.setEnabled(false);
        jbCancela.setEnabled(false);
        jtCod.setEnabled(false);
        jtNome.setEnabled(false);
    }

    private void apagarCampos() {
        jtCod.setText("");
        jtNome.setText("");
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
        jtNome = new javax.swing.JTextField();
        jbBusca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Bairros");

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
        jtCod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel2.add(jtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jtNome.setBackground(java.awt.SystemColor.control);
        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jtNome.setEnabled(false);
        jPanel2.add(jtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 400, 60));

        jbBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jbBusca.setToolTipText("");
        jbBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaActionPerformed(evt);
            }
        });
        jPanel2.add(jbBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 30, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(582, 175));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
         jbNovo.setEnabled(false);
         jbBusca.setEnabled(false);
         habBotoes();
         jtNome.grabFocus();
         int cod= new BairroController().ultimoID("Bairro","bai_codigo") + 1;
         jtCod.setText(String.valueOf(cod));
         jtNome.grabFocus();
         operacao=1;
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbConfirmaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Bairro bairro = new Bairro();
        bairro.setBaiCodigo(Integer.parseInt(jtCod.getText()));
        bairro.setBaiNome(jtNome.getText());
        String sql;
        desBotoes();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        if(operacao==1) {
          sql="insert into BAIRRO (bai_nome) values ('"+bairro.getBaiNome()+"')";
           if(Gamb.getConexao().manipular(sql)==true)
             JOptionPane.showMessageDialog(this,"Informação registrada com sucesso");
           else
             JOptionPane.showMessageDialog(this,"Erro: "+sql+Gamb.getConexao().getMensagemErro());
        }
        else {
            sql="update Bairro SET bai_nome='"+bairro.getBaiNome()+"' where bai_codigo="+bairro.getBaiCodigo();
            if(Gamb.getConexao().manipular(sql)==true)
                JOptionPane.showMessageDialog(this,"Informação alterada com sucesso");
            else
                JOptionPane.showMessageDialog(this,"Erro: "+sql+Gamb.getConexao().getMensagemErro());
        }
        apagarCampos();
    }

    private void jbAlteraActionPerformed(java.awt.event.ActionEvent evt) {
        desBotoes();
        habBotoes();
        jbBusca.setEnabled(false);
        jtCod.setEnabled(false);
        jtNome.grabFocus();
        jtNome.selectAll();
        operacao=2;
    }

    private void jbExcluiActionPerformed(java.awt.event.ActionEvent evt) {
         if(JOptionPane.showConfirmDialog(null,"Confirma a Exclusão?")==JOptionPane.YES_OPTION)
            if(new BairroController().excluir(Integer.parseInt(jtCod.getText()))==1){
                JOptionPane.showMessageDialog(this, "Informações excluídas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir as informações");
            }
            desBotoes();
            jbNovo.setEnabled(true);
            apagarCampos();
    }

    private void jbCancelaActionPerformed(java.awt.event.ActionEvent evt) {
        desBotoes();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        apagarCampos();
    }

    private void jbBuscaActionPerformed(java.awt.event.ActionEvent evt) {
        LocalizarBairros localizarBairros = new LocalizarBairros(null);
        if (localizarBairros.alterarDados()) {
            Bairro cliente = localizarBairros.getBairro();
            jtCod.setText(String.valueOf(cliente.getBaiCodigo()));
            jtNome.setText(String.valueOf(cliente.getBaiNome()));
        }
        localizarBairros.dispose();
        desBotoes();
        if(!jtCod.getText().equals("")){
            jbAltera.setEnabled(true);
            jbExclui.setEnabled(true);
            jbCancela.setEnabled(true);
        } else {
            jbBusca.setEnabled(true);
            jbNovo.setEnabled(true);
        }
    }   
    
    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        if (!jtCod.getText().equals("")){
            if (JOptionPane.showConfirmDialog(null, "Fechar Cadastro de Bairros?") == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        } else {
            this.dispose();
        }
}//GEN-LAST:event_jbSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbAltera;
    private javax.swing.JButton jbBusca;
    private javax.swing.JButton jbCancela;
    private javax.swing.JButton jbConfirma;
    private javax.swing.JButton jbExclui;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private javax.swing.JTextField jtCod;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
