package classes;

import Controller.BairroController;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class CampoDinamico extends JDialog {

    private JTextField io_tf_campo1;//, io_tf_campo2, io_tf_campo3;
    private JComboBox io_cb_lista;
    private String[] is_lista;
    private List<Bairro> is_bairro;

    public CampoDinamico() {
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(200, 300);
        WindowGUI();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void WindowGUI() {
        io_tf_campo1 = new JTextField();
        io_tf_campo1.setBounds(10, 10, 100, 25);
        io_tf_campo1.addKeyListener(io_kl_campos);
        getContentPane().add(io_tf_campo1);

//        io_tf_campo2 = new JTextField();
//        io_tf_campo2.setBounds(10, 40, 100, 25);
//        io_tf_campo2.addKeyListener(io_kl_campos);
//        getContentPane().add(io_tf_campo2);

//        io_tf_campo3 = new JTextField();
//        io_tf_campo3.setBounds(10, 70, 100, 25);
//        io_tf_campo3.setEditable(false);
//        getContentPane().add(io_tf_campo3);

        io_cb_lista = new JComboBox();
        is_bairro = new BairroController().listaBairros();

        is_lista = new String[is_bairro.size()];
        int i = 0;
        for (Bairro bairro : is_bairro) {
            is_lista[i++] = bairro.getBaiNome();
        }
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(is_lista);
        io_cb_lista.setModel(defaultComboBoxModel);
        io_cb_lista.setBounds(10, 100, 200, 25);
        getContentPane().add(io_cb_lista);
    }
    
    
    KeyListener io_kl_campos = new KeyListener() {
        @Override
        public void keyPressed(KeyEvent e) {
            new Thread() {
                @Override
                public void run() {
                    while (!isInterrupted()) {
                        if (!io_tf_campo1.getText().isEmpty()) {
                            ArrayList<String> ls_nova_lista = new ArrayList<String>();
                            for (int ln = 0;ln < is_lista.length;ln++) {
                                if (is_lista[ln].toLowerCase().startsWith(io_tf_campo1.getText().toLowerCase())) {
                                    ls_nova_lista.add(is_lista[ln]);
                                }
                            }
                            io_cb_lista.setModel(new DefaultComboBoxModel(ls_nova_lista.toArray()));
                        }interrupt();
                    }
                }
            }.start();
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
    };

    public static void main(String[] args) {
        JDialog.setDefaultLookAndFeelDecorated(true);
        new CampoDinamico().setVisible(true);
    }
}
