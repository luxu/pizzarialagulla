package telas;

import Controller.ControleController;
import Controller.UsuarioController;
import classes.Usuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class CadUsuario extends javax.swing.JDialog {
    
    private int operacao;

    public CadUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void habBotoes() {
        jbConfirma.setEnabled(true);
        jbCancela.setEnabled(true);
        tfNome.setEnabled(true);
        tfLogin.setEnabled(true);
        tfSenha.setEnabled(true);
        tfContraSenha.setEnabled(true);
        jcbOperador.setEnabled(true);
    }

    private void desBotoes() {
        jbNovo.setEnabled(false);
        jbAltera.setEnabled(false);
        jbExclui.setEnabled(false);
        jbConfirma.setEnabled(false);
        tfNome.setEnabled(false);
        tfLogin.setEnabled(false);
        tfSenha.setEnabled(false);
        tfContraSenha.setEnabled(false);
        jcbOperador.setEnabled(false);
    }

    private void apagarCampos() {
        tfCod.setText("");
        tfNome.setText("");
        tfLogin.setText("");
        tfSenha.setText("");
        tfContraSenha.setText("");
        jcbOperador.setSelectedIndex(0);
        rbSim.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbAltera = new javax.swing.JButton();
        jbExclui = new javax.swing.JButton();
        jbConfirma = new javax.swing.JButton();
        jbCancela = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        tfCod = new javax.swing.JTextField();
        jbBusca = new javax.swing.JButton();
        tfLogin = new javax.swing.JTextField();
        tfContraSenha = new javax.swing.JPasswordField();
        jcbOperador = new javax.swing.JComboBox();
        tfNome = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAltera.setText("Alterar");
        jbAltera.setEnabled(false);
        jbAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlteraActionPerformed(evt);
            }
        });

        jbExclui.setText("Excluir");
        jbExclui.setEnabled(false);
        jbExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluiActionPerformed(evt);
            }
        });

        jbConfirma.setText("Confirmar");
        jbConfirma.setEnabled(false);
        jbConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmaActionPerformed(evt);
            }
        });

        jbCancela.setText("Cancelar");
        jbCancela.setEnabled(false);
        jbCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelaActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAltera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExclui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExclui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAltera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tfCod.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        tfCod.setEnabled(false);

        jbBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jbBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaActionPerformed(evt);
            }
        });

        tfLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        tfLogin.setEnabled(false);

        tfContraSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Contra-Senha"));
        tfContraSenha.setEnabled(false);

        jcbOperador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Gerente", "Operador", " " }));
        jcbOperador.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil"));
        jcbOperador.setEnabled(false);

        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        tfNome.setEnabled(false);

        tfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));
        tfSenha.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ativo"));

        buttonGroup1.add(rbSim);
        rbSim.setText("Sim");
        rbSim.setEnabled(false);

        buttonGroup1.add(rbNao);
        rbNao.setText("Não");
        rbNao.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rbSim)
                .addGap(18, 18, 18)
                .addComponent(rbNao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSim)
                    .addComponent(rbNao))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfContraSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCod, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jbBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContraSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        if (!tfCod.getText().equals("")){
            if (JOptionPane.showConfirmDialog(null, "Fechar Cadastro de Usuários?") == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmaActionPerformed
        String ativo = null;
        if (tfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um NOME!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            tfNome.requestFocus();
            return;
        }
        if (tfLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um LOGIN!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            tfLogin.requestFocus();
            return;
        }
        if (tfSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a SENHA!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            tfSenha.requestFocus();
            return;
        }
        if (tfContraSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a CONTRA-SENHA!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            tfContraSenha.requestFocus();
            return;
        }
        if (!tfContraSenha.getText().equals(tfSenha.getText())) {
            JOptionPane.showMessageDialog(null, "SENHA e CONTRA-SENHA diferentes!", "Erro de validação!", JOptionPane.ERROR_MESSAGE);
            tfContraSenha.setText("");
            tfContraSenha.requestFocus();
            return;
        }
        if (rbSim.isSelected())
             ativo = "s";
        else ativo = "n";
        if (operacao == 1) {
            if (new UsuarioController().salvar(tfNome.getText(), tfLogin.getText(), 
                    tfSenha.getText(), jcbOperador.getSelectedItem().toString(),ativo)==1){
                JOptionPane.showMessageDialog(this, "Informações salvas com sucesso!");
                jbCancelaActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar as informações");
            }
        } else {
            //Integer id, String nome, String login, String senha, String perfil
            if (new UsuarioController().alterar(Integer.parseInt(tfCod.getText()),tfNome.getText(), tfLogin.getText(), 
                    tfSenha.getText(), jcbOperador.getSelectedItem().toString(),ativo)==1){
                JOptionPane.showMessageDialog(this, "Informações alteradas com sucesso!");
                jbCancelaActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar as informações");
            }
        }
    }//GEN-LAST:event_jbConfirmaActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
         jbNovo.setEnabled(false);
         jbBusca.setEnabled(false);
         habBotoes();
         tfNome.grabFocus();
         int cod= new ControleController().ultimoID("Usuario","usu_codigo") + 1;
         tfCod.setText(String.valueOf(cod));
         tfNome.grabFocus();
         rbSim.setEnabled(true);
         rbNao.setEnabled(true);
         operacao=1;
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelaActionPerformed
        desBotoes();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        jbCancela.setEnabled(false);
        apagarCampos();
    }//GEN-LAST:event_jbCancelaActionPerformed

    private void jbExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluiActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Confirma a Exclusão?")==JOptionPane.YES_OPTION){
            if(new UsuarioController().excluir(Integer.parseInt(tfCod.getText()))==1){
                JOptionPane.showMessageDialog(this, "Informações excluídas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir as informações");
            }
            desBotoes();
            jbNovo.setEnabled(true);
            apagarCampos();
        }
    }//GEN-LAST:event_jbExcluiActionPerformed

    private void jbBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaActionPerformed
        LocalizarUsuarios localizarUsuarios = new LocalizarUsuarios(null);
        if (localizarUsuarios.alterarDados()) {
            Usuario usuario = localizarUsuarios.getUsuario();
            tfCod.setText(String.valueOf(usuario.getUsuCodigo()));
            tfNome.setText(String.valueOf(usuario.getUsuNome()));
            tfLogin.setText(String.valueOf(usuario.getUsuLogin()));
            jcbOperador.setSelectedItem(usuario.getUsuPerfil());
            if (usuario.getUsuAtivo().equals("s"))
                 rbSim.setSelected(true);
            else rbNao.setSelected(true);
        }
        localizarUsuarios.dispose();
        desBotoes();
        if(!tfCod.getText().equals("")){
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
        tfNome.grabFocus();
        tfLogin.setEnabled(true);
        jcbOperador.setEnabled(true);
         rbSim.setEnabled(true);
         rbNao.setEnabled(true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbAltera;
    private javax.swing.JButton jbBusca;
    private javax.swing.JButton jbCancela;
    private javax.swing.JButton jbConfirma;
    private javax.swing.JButton jbExclui;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private javax.swing.JComboBox jcbOperador;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextField tfCod;
    private javax.swing.JPasswordField tfContraSenha;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
