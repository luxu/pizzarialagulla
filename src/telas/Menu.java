package telas;

import Ferramentas.Backup;
import Ferramentas.Restaurar;
import relatorios.Relatorios;

//public class Menu extends javax.swing.JFrame {
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
//        setResizable(false);
/* Deixa a tela com o tamanho maximizado */
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jbCadastrarProdutos = new javax.swing.JButton();
        jbFecharPedido = new javax.swing.JButton();
        jbCadastrarCliente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mProduto = new javax.swing.JMenuItem();
        mCliente = new javax.swing.JMenuItem();
        mUsuario = new javax.swing.JMenuItem();
        mBairro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        mSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mRegistrarPedido = new javax.swing.JMenuItem();
        mFecharPedido = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        rProdutos = new javax.swing.JMenuItem();
        rPedidos = new javax.swing.JMenuItem();
        rClientes = new javax.swing.JMenuItem();
        rBairros = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mFerramentas = new javax.swing.JMenu();
        mBackup = new javax.swing.JMenuItem();
        mRestaurar = new javax.swing.JMenuItem();
        mAjuda = new javax.swing.JMenu();
        mSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Software para controle da PIZZARIA LAGULLA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoTeste.png"))); // NOI18N
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jbCadastrarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_consumo.png"))); // NOI18N
        jbCadastrarProdutos.setToolTipText("Cadastrar Produtos");
        jbCadastrarProdutos.setBorderPainted(false);
        jbCadastrarProdutos.setFocusable(false);
        jbCadastrarProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCadastrarProdutos.setOpaque(false);
        jbCadastrarProdutos.setPreferredSize(new java.awt.Dimension(33, 40));
        jbCadastrarProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarProdutosActionPerformed(evt);
            }
        });
        jToolBar1.add(jbCadastrarProdutos);

        jbFecharPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_fechar.jpg"))); // NOI18N
        jbFecharPedido.setToolTipText("fechar atendimento");
        jbFecharPedido.setBorderPainted(false);
        jbFecharPedido.setFocusable(false);
        jbFecharPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbFecharPedido.setOpaque(false);
        jbFecharPedido.setPreferredSize(new java.awt.Dimension(33, 40));
        jbFecharPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharPedidoActionPerformed(evt);
            }
        });
        jToolBar1.add(jbFecharPedido);

        jbCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kuser.png"))); // NOI18N
        jbCadastrarCliente.setToolTipText("Clientes");
        jbCadastrarCliente.setBorderPainted(false);
        jbCadastrarCliente.setFocusable(false);
        jbCadastrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCadastrarCliente.setOpaque(false);
        jbCadastrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(jbCadastrarCliente);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jMenu1.setMnemonic('C');
        jMenu1.setText("Cadastros");

        mProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mProduto.setText("Produto");
        mProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(mProduto);

        mCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mCliente.setText("Cliente");
        mCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mCliente);

        mUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mUsuario.setText("Usuário");
        mUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(mUsuario);

        mBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mBairro.setText("Bairro");
        mBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBairroActionPerformed(evt);
            }
        });
        jMenu1.add(mBairro);
        jMenu1.add(jSeparator1);

        mSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mSair.setMnemonic('r');
        mSair.setText("Sair");
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });
        jMenu1.add(mSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('M');
        jMenu2.setText("Movimentações");

        mRegistrarPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        mRegistrarPedido.setText("Registrar Pedido");
        mRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarPedidoActionPerformed(evt);
            }
        });
        jMenu2.add(mRegistrarPedido);

        mFecharPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        mFecharPedido.setText("Fechar Pedido");
        mFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFecharPedidoActionPerformed(evt);
            }
        });
        jMenu2.add(mFecharPedido);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem1.setText("Controle Diário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setMnemonic('R');
        jMenu3.setText("Relatórios");

        rProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        rProdutos.setMnemonic('L');
        rProdutos.setText("Lista de Produtos");
        rProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rProdutosActionPerformed(evt);
            }
        });
        jMenu3.add(rProdutos);

        rPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        rPedidos.setMnemonic('M');
        rPedidos.setText("Lista de Pedidos");
        rPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPedidosActionPerformed(evt);
            }
        });
        jMenu3.add(rPedidos);

        rClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        rClientes.setText("Lista de Clientes");
        rClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rClientesActionPerformed(evt);
            }
        });
        jMenu3.add(rClientes);

        rBairros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        rBairros.setText("Lista dos Bairros");
        rBairros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBairrosActionPerformed(evt);
            }
        });
        jMenu3.add(rBairros);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Lista dos Controles Diários");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        mFerramentas.setText("Ferramentas");

        mBackup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        mBackup.setText("Backup");
        mBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBackupActionPerformed(evt);
            }
        });
        mFerramentas.add(mBackup);

        mRestaurar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mRestaurar.setText("Restaurar");
        mRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRestaurarActionPerformed(evt);
            }
        });
        mFerramentas.add(mRestaurar);

        jMenuBar1.add(mFerramentas);

        mAjuda.setMnemonic('o');
        mAjuda.setText("Ajuda");

        mSobre.setText("Sobre...");
        mAjuda.add(mSobre);

        jMenuBar1.add(mAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mProdutoActionPerformed
        CadProduto dialog = new CadProduto(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mProdutoActionPerformed

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSairActionPerformed

    private void rProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rProdutosActionPerformed
        new Relatorios().relProdutos();
    }//GEN-LAST:event_rProdutosActionPerformed

    private void rPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPedidosActionPerformed
        LocalizarPedidoPorCliente janela = new LocalizarPedidoPorCliente(this, true);
        janela.setVisible(true);
    }//GEN-LAST:event_rPedidosActionPerformed

    private void mClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClienteActionPerformed
        CadCliente cliente = new CadCliente(this, true);
        cliente.setVisible(true);
    }//GEN-LAST:event_mClienteActionPerformed

    private void mUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUsuarioActionPerformed
        CadUsuario usuario = new CadUsuario(this, true);
        usuario.setVisible(true);
    }//GEN-LAST:event_mUsuarioActionPerformed

    private void mBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBairroActionPerformed
        CadBairro bairro = new CadBairro(this, true);
        bairro.setVisible(true);
    }//GEN-LAST:event_mBairroActionPerformed

    private void mRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarPedidoActionPerformed
        RegistrarPedido pedido = new RegistrarPedido(this, true);
        pedido.setVisible(true);
    }//GEN-LAST:event_mRegistrarPedidoActionPerformed

    private void jbFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharPedidoActionPerformed
        mFecharPedidoActionPerformed(evt);
    }//GEN-LAST:event_jbFecharPedidoActionPerformed

    private void mFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFecharPedidoActionPerformed
        FecharPedido fecharPedido = new FecharPedido(this, true);
        fecharPedido.setVisible(true);
    }//GEN-LAST:event_mFecharPedidoActionPerformed

    private void rClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rClientesActionPerformed
        new Relatorios().relClientes();
    }//GEN-LAST:event_rClientesActionPerformed
    private void mBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBackupActionPerformed
        new Backup();
    }//GEN-LAST:event_mBackupActionPerformed

    private void jbCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarProdutosActionPerformed
        mProdutoActionPerformed(evt);
    }//GEN-LAST:event_jbCadastrarProdutosActionPerformed

    private void mRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRestaurarActionPerformed
        new Restaurar().Mensagem();
    }//GEN-LAST:event_mRestaurarActionPerformed

    private void rBairrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBairrosActionPerformed
        new Relatorios().relBairros();
    }//GEN-LAST:event_rBairrosActionPerformed

    private void jbCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarClienteActionPerformed
        mClienteActionPerformed(evt);
    }//GEN-LAST:event_jbCadastrarClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MovControle controle = new MovControle(this, true);
        controle.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Relatorios().relControles();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbCadastrarCliente;
    private javax.swing.JButton jbCadastrarProdutos;
    private javax.swing.JButton jbFecharPedido;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenuItem mBackup;
    private javax.swing.JMenuItem mBairro;
    private javax.swing.JMenuItem mCliente;
    private javax.swing.JMenuItem mFecharPedido;
    private javax.swing.JMenu mFerramentas;
    private javax.swing.JMenuItem mProduto;
    private javax.swing.JMenuItem mRegistrarPedido;
    private javax.swing.JMenuItem mRestaurar;
    private javax.swing.JMenuItem mSair;
    private javax.swing.JMenuItem mSobre;
    private javax.swing.JMenuItem mUsuario;
    private javax.swing.JMenuItem rBairros;
    private javax.swing.JMenuItem rClientes;
    private javax.swing.JMenuItem rPedidos;
    private javax.swing.JMenuItem rProdutos;
    // End of variables declaration//GEN-END:variables
}
