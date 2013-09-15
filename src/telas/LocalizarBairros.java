package telas;

import Controller.BairroController;
import TableModel.BairroTableModel;
import classes.Bairro;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class LocalizarBairros extends javax.swing.JDialog {

    private BairroTableModel tableModel;
    protected boolean okSelecionado;
    private Bairro bairro;

    public LocalizarBairros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public LocalizarBairros(Frame owner) {
        super(owner);
        initComponents();
    }

    public Bairro getBairro() {
        return bairro;
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

        jtPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProcurar)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
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
            bairro = tableModel.getBairros(indice);
            okSelecionado = true; //Dizemos que o ok foi selecionado.
            setVisible(false);
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarActionPerformed
        List<Bairro> listaBairros;
        if (jtPesquisar.getText().equals("")) {
            /* Se vier vazio lista todos da tabela bairro */
            listaBairros = new BairroController().listaBairros();
        } else {
            /* Pesquisa um "pedaço" do nome passado pelo campo NOME */
            listaBairros = new BairroController().listaDeBairroPorNome(jtPesquisar.getText());
        }
        if (listaBairros != null) {
            tableModel = new BairroTableModel(listaBairros);
        } else {
            tableModel = new BairroTableModel();
            JOptionPane.showMessageDialog(null, "Nenhum nome encontrado!!!");
        }
        jtTabela.setModel(tableModel);
    }//GEN-LAST:event_jbProcurarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgProcurar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbProcurar;
    private javax.swing.JFormattedTextField jtPesquisar;
    private javax.swing.JTable jtTabela;
    // End of variables declaration//GEN-END:variables
}