package telas;

import Controller.GarconController;
import boteko.Gamb;
import fipptools.BrowseTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CadGarcom extends javax.swing.JDialog {
    

    public CadGarcom(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private void habBotoes() {
        jbConfirma.setEnabled(true);
        jbCancela.setEnabled(true);
        jtCod.setEnabled(true);
        jtNome.setEnabled(true);
        jtEndereco.setEnabled(true);
        jtTelefone.setEnabled(true);
        jdcDtAdm.setEnabled(true);
        jtRG.setEnabled(true);
        jtCPF.setEnabled(true);
    }
    
    private void desBotoes() {
        jbNovo.setEnabled(false);
        jbAltera.setEnabled(false);
        jbExclui.setEnabled(false);
        jbConfirma.setEnabled(false);
        jbCancela.setEnabled(false);
        jtCod.setEnabled(false);
        jtNome.setEnabled(false);
        jtCPF.setEnabled(false);
    }

    private void apagarCampos() {
        jtCod.setText("");
        jtNome.setText("");
        jtEndereco.setText("");
        jtTelefone.setText("");
        jdcDtAdm.setDate(null);
        jtRG.setText("");
        jtCPF.setText("");
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
        jtCPF = new javax.swing.JFormattedTextField();
        jtEndereco = new javax.swing.JTextField();
        jtRG = new javax.swing.JFormattedTextField();
        jdcDtAdm = new com.toedter.calendar.JDateChooser();
        jtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Garçons");

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
        jbSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSairKeyPressed(evt);
            }
        });
        jPanel1.add(jbSair);

        jtCod.setBackground(java.awt.SystemColor.control);
        jtCod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jtNome.setBackground(java.awt.SystemColor.control);
        jtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jtNome.setEnabled(false);

        jbBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jbBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaActionPerformed(evt);
            }
        });

        jtCPF.setBackground(java.awt.SystemColor.control);
        jtCPF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        try {
            jtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtCPF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtCPF.setEnabled(false);

        jtEndereco.setBackground(java.awt.SystemColor.control);
        jtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jtEndereco.setEnabled(false);

        jtRG.setBackground(java.awt.SystemColor.control);
        jtRG.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RG:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        try {
            jtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtRG.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtRG.setEnabled(false);

        jdcDtAdm.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Admissão:"));
        jdcDtAdm.setEnabled(false);

        jtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone:"));
        try {
            jtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtTelefone.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jdcDtAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbBusca))
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcDtAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(582, 265));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
         dt = new Date();
         jbNovo.setEnabled(false);
         jbBusca.setEnabled(false);
         habBotoes();
         jtNome.grabFocus();
         int cod=0;
//         cod=Gamb.getConexao().getMaxPK("Garcon","gar_codigo")+1;
         jtCod.setText(String.valueOf(cod));
         jtNome.grabFocus();
         jdcDtAdm.setDate(dt);
         operacao=1;
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbConfirmaActionPerformed(java.awt.event.ActionEvent evt) {                                           
//        dt = jdcDtAdm.getDate();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(jdcDtAdm.getDate());
//        DateTime jodatime = new DateTime(dt);
//        Garcon garcon = new Garcon();
//        garcon.setGarCodigo(Integer.parseInt(jtCod.getText()));
//        garcon.setGarNome(jtNome.getText());
//        garcon.setGarEndereco(jtEndereco.getText());
//        garcon.setGarTelefone(jtTelefone.getText());
//        garcon.setGarRg(jtRG.getText());
//        garcon.setGarCpf(jtCPF.getText());
//        garcon.setGarDataAdmissao(dt);
//        garcon.setGarDataAdmissao(jodatime.getYear()+"-"+jodatime.getMonthOfYear()+"-"+jodatime.getDayOfMonth());
//        JOptionPane.showMessageDialog(this, jodatime.getYear()+"-"+jodatime.getMonthOfYear()+"-"+jodatime.getDayOfMonth());
//        String sql;
//        String data = jodatime.getYear()+"-"+jodatime.getMonthOfYear()+"-"+jodatime.getDayOfMonth();
//        dt = jodatime.;
        desBotoes();
        jbNovo.setEnabled(true);
        jbBusca.setEnabled(true);
        GarconController garconController = new GarconController();
        if(operacao==1) {
            try {
                garconController.salvar(jtNome.getText(),jtEndereco.getText(),jtTelefone.getText(),
                    data,jtRG.getText(),jtCPF.getText());
                JOptionPane.showMessageDialog(this,"Informação registrada com sucesso");
            } catch (SQLException e) {
                 JOptionPane.showMessageDialog(this,"Nao foi possivel salvar contato!\n"  + e.getLocalizedMessage());
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Data possui formato inválido!\n" + e.getLocalizedMessage());
            }
        } else {
            try {
                garconController.alterar(Integer.parseInt(jtCod.getText()),jtNome.getText(),jtEndereco.getText(),jtTelefone.getText(),
                    data,jtRG.getText(),jtCPF.getText());
                JOptionPane.showMessageDialog(this,"Informação registrada com sucesso");
            } catch (SQLException e) {
                 JOptionPane.showMessageDialog(this,"Nao foi possivel salvar contato!\n"  + e.getLocalizedMessage());
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Data possui formato inválido!\n" + e.getLocalizedMessage());
            }
        }
        apagarCampos();
    }

    private void jbAlteraActionPerformed(java.awt.event.ActionEvent evt) {
        desBotoes();
        habBotoes();
        jbBusca.setEnabled(false);
        jtNome.grabFocus();
        jtNome.selectAll();
        operacao=2;
    }

    private void jbExcluiActionPerformed(java.awt.event.ActionEvent evt) {
         if(JOptionPane.showConfirmDialog(null,"Confirma a Exclusão?")==JOptionPane.YES_OPTION)
            if(Gamb.getConexao().manipular("delete from Garcon where gar_codigo="+jtCod.getText())==false)//Erro
                       JOptionPane.showMessageDialog(this,Gamb.getConexao().getMensagemErro());
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
        dt = jdcDtAdm.getDate();
        ResultSet rs=Gamb.getConexao().consultar("select * from Garcon");
        BrowseTable bt=new BrowseTable(rs,new String[]{"Cód","Nome","Endereço","Telefone","Data de Admissão","RG","CPF"},null);
        bt.setSize(640,480);
        bt.setLocationRelativeTo(null);
        bt.setTitle("Relação de Garçons");
        if(bt.Execute()) {
            jtCod.setText(bt.getSelecao("codigo"));
            jtNome.setText(bt.getSelecao("Nome"));
            jtEndereco.setText(bt.getSelecao("Endereço"));
            jtTelefone.setText(bt.getSelecao("Telefone"));
            String data=bt.getSelecao("Data de Admissão");
            int h=Integer.parseInt(data.substring(0,4));
            int m=Integer.parseInt(data.substring(5,7));
            int d=Integer.parseInt(data.substring(8,10));
            jdcDtAdm.setDate(new Date(h-1900,m-1,d));
            bt.getSelecao("Data de Admissão");
            jtRG.setText(bt.getSelecao("RG"));
            jtCPF.setText(bt.getSelecao("CPF"));
            desBotoes();
            jbAltera.setEnabled(true);
            jbExclui.setEnabled(true);
            jbCancela.setEnabled(true);
        }
    }                                       

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
}//GEN-LAST:event_jbSairActionPerformed

    private void jbSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSairKeyPressed

}//GEN-LAST:event_jbSairKeyPressed

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
    private com.toedter.calendar.JDateChooser jdcDtAdm;
    private javax.swing.JFormattedTextField jtCPF;
    private javax.swing.JTextField jtCod;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JFormattedTextField jtRG;
    private javax.swing.JFormattedTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
    private int operacao;
    private Date dt;
}
