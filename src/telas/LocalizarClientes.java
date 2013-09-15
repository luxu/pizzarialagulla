package telas;

import Controller.ClienteController;
import TableModel.ClienteTableModel;
import classes.Cliente;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author luxu
 */
public class LocalizarClientes extends javax.swing.JDialog {

    private ClienteTableModel tableModel;
    protected boolean okSelecionado;
    private Cliente cliente;

    public LocalizarClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public LocalizarClientes(Frame owner) {
        super(owner);
        initComponents();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean alterarDados() {
        okSelecionado = false;  //Marcamos que o ok não foi selecionado
        setModal(true);         //A dialog tem que ser modal. Só pode retornar do setVisible após ficar invisível.
        setVisible(true);       //Mostramos a dialog e esperamos o usuário escolher alguma coisa.
        return okSelecionado;   //Retornamos true, se ele pressionou ok.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgProcurar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbProcurar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbNome = new javax.swing.JRadioButton();
        rbTelefone = new javax.swing.JRadioButton();
        jtPesquisar = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jbConfirmar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbProcurar.setText("Procurar");
        jbProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcurarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Procurar"));

        bgProcurar.add(rbNome);
        rbNome.setSelected(true);
        rbNome.setText("Nome");
        rbNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNomeMouseClicked(evt);
            }
        });

        bgProcurar.add(rbTelefone);
        rbTelefone.setText("Telefone");
        rbTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTelefoneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTelefone)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbNome)
                .addComponent(rbTelefone))
        );

        jtPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProcurar)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtPesquisar)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(jtTabela);

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFechar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfirmar)
                    .addComponent(jbFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int indice = jtTabela.getSelectedRow();
        if (indice != -1) {
            cliente = tableModel.getClientes(indice);
            okSelecionado = true; //Dizemos que o ok foi selecionado.
            setVisible(false);
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarActionPerformed
        List<Cliente> listaClientes;
        if (jtPesquisar.getText().equals("")) {
            /* Se vier vazio lista todos da tabela cliente */
            listaClientes = new ClienteController().listaClientes();
        } else if (rbNome.isSelected()) {
            /* Pesquisa um "pedaço" do nome passado pelo campo TELEFONE */
            listaClientes = new ClienteController().listaDeClientePorNome(jtPesquisar.getText());
        } else {
            /* Pesquisa um "pedaço" do nome passado pelo campo NOME */
            listaClientes = new ClienteController().listaDeClientePorTelefone(jtPesquisar.getText());
        }
        if (listaClientes
                != null) {
            tableModel = new ClienteTableModel(listaClientes);
        } else {
            tableModel = new ClienteTableModel();
            JOptionPane.showMessageDialog(null, "Nenhum nome encontrado!!!");
        }
        jtTabela.setModel(tableModel);
    }//GEN-LAST:event_jbProcurarActionPerformed

    private void rbNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNomeMouseClicked
                if (tableModel != null) {
                    tableModel.limpar();
                }
                jtPesquisar.setFormatterFactory(getFormato());
                jtPesquisar.setText("");
                jtPesquisar.requestFocus();
    }//GEN-LAST:event_rbNomeMouseClicked

    private void rbTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTelefoneMouseClicked
                if (tableModel != null) {
                    tableModel.limpar();
                }
                jtPesquisar.setFormatterFactory(getFormato());
                jtPesquisar.setText("");
                jtPesquisar.requestFocus();
    }//GEN-LAST:event_rbTelefoneMouseClicked
    private DefaultFormatterFactory getFormato() {
        MaskFormatter comFoco = null;
        try {
            if (rbTelefone.isSelected()) {
                //Formato TELEFONE
                comFoco = new MaskFormatter("####-####");
                comFoco.setPlaceholderCharacter('_');
                comFoco.setValidCharacters("0123456789");
            }
        } catch (Exception pe) {
            System.out.println(pe.getMessage());
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgProcurar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbProcurar;
    private javax.swing.JFormattedTextField jtPesquisar;
    private javax.swing.JTable jtTabela;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JRadioButton rbTelefone;
    // End of variables declaration//GEN-END:variables
}