package telas;

import Controller.ControleController;
import TableModel.ControleTableModel;
import classes.Controle;
import java.awt.Frame;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.joda.time.LocalDate;

/**
 *
 * @author luxu
 */
public class LocalizarControles extends javax.swing.JDialog {

    private ControleTableModel tableModel;
    protected boolean okSelecionado;
    private Controle controle;

    public LocalizarControles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public LocalizarControles(Frame owner) {
        super(owner);
        initComponents();
    }

    public Controle getControle() {
        return controle;
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

        jPanel1 = new javax.swing.JPanel();
        jbProcurar = new javax.swing.JButton();
        jdcData = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
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

        jdcData.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProcurar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
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
            controle = tableModel.getControles(indice);
            okSelecionado = true; //Dizemos que o ok foi selecionado.
            setVisible(false);
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarActionPerformed
        List<Controle> listaControles = null;
        if (jdcData.getDate() == null) {
            /* Se vier vazio lista todos da tabela controle */
            listaControles = new ControleController().listaControles();
        } else {
            /* Pesquisa por DATA específica */
            LocalDate localDate = new LocalDate(jdcData.getDate());
            Date data = localDate.toDateTimeAtCurrentTime().toDate();
            Controle controle = new ControleController().listaDeControlePorData(data); 
            if (controle != null)
                listaControles.add(controle);
        }
        if (listaControles != null) {
            tableModel = new ControleTableModel(listaControles);
            jtTabela.setModel(tableModel);
        } else {
            tableModel = new ControleTableModel();
            JOptionPane.showMessageDialog(null, "Nenhum nome encontrado!!!");
        }
    }//GEN-LAST:event_jbProcurarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbProcurar;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JTable jtTabela;
    // End of variables declaration//GEN-END:variables
}