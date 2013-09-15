package telas;

import Controller.UsuarioController;
import TableModel.UsuarioTableModel;
import classes.Usuario;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class LocalizarUsuarios extends javax.swing.JDialog {

    private UsuarioTableModel tableModel;
    protected boolean okSelecionado;
    private Usuario usuario;
    
    public LocalizarUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public LocalizarUsuarios(Frame owner)
    {
        super(owner);
        initComponents();
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    boolean alterarDados() {
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
        jtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbConfirmar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbProcurar.setText("Procurar");
        jbProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcurarActionPerformed(evt);
            }
        });

        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProcurar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome)
                    .addComponent(jbProcurar))
                .addGap(13, 13, 13))
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

        jLabel1.setText("Usuários");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfirmar)
                    .addComponent(jbFechar))
                .addContainerGap(23, Short.MAX_VALUE))
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
                usuario = tableModel.getUsuario(indice);
//                JOptionPane.showMessageDialog(null,"Usuario = "+usuario.getProDescricao());
                okSelecionado = true; //Dizemos que o ok foi selecionado.
                setVisible(false);
            }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarActionPerformed
        List<Usuario> listaUsuarios;
        UsuarioController controller = new UsuarioController();
        tableModel = new UsuarioTableModel();
        if (jtNome.getText().equals("")){
            /* Se vier vazio lista todos da tabela usuario */
            listaUsuarios = controller.listaUsuarios();
        } else {
            /* Pesquisa um "pedaço" do nome passado pelo campo NOME */
            listaUsuarios = controller.buscaUsuarioPorNome(jtNome.getText());
        }
        if(listaUsuarios != null){
            for (Usuario usuario : listaUsuarios) {
                tableModel.adiciona(usuario);
            }
            jtTabela.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(null,"Nenhum nome encontrado!!!");
        }
    }//GEN-LAST:event_jbProcurarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbProcurar;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTable jtTabela;
    // End of variables declaration//GEN-END:variables

    
}
