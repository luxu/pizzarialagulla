package classes;

import Controller.BairroController;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author luxu
 */
public class PainelAutoComplete extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtBusca;
    private IFonteDados fonteDados;
    private JComboBox listSug;
    private BairroController bairroController;
    private String dados[];  

    public PainelAutoComplete(IFonteDados fonte) {
        super(new GridLayout(2, 1));
        this.fonteDados = fonte;
        setSize(300, 300);
        txtBusca = new JTextField();
        add(txtBusca);
        listSug = new JComboBox();
        listSug.setMaximumRowCount(4);
        listSug.setVisible(false);
        add(listSug);
        txtBusca.addKeyListener(new KeyListener() {
            
            @Override
            public void keyPressed(KeyEvent e) {}
            
            @Override
            public void keyTyped(KeyEvent e) {}
            
            @Override
            public void keyReleased(KeyEvent e) {
                if (txtBusca.getText().equals("")) {
                    listSug.setVisible(false);
                    return;
                }
                /* 
                 * Aqui é onde usamos o estratégia para buscar os dados A fonte, 
                 * desde que implemente nossa interface IFonteDados, pode ser um 
                 * banco de dados, arquivo de texto e outros, sendo que a busca 
                 * de dados é encapsulada pelo padrão estratégia 
                 */
//                String dados[] = fonteDados.buscaDados(txtBusca.getText());
                String dados[] = buscaDados(txtBusca.getText());
                listSug.removeAllItems();
                listSug.setVisible(true);
                if (dados[0] == null) dados[0] = "Não encontrado!!";
                for (int i = 0; i < dados.length; i++) {
                    listSug.addItem(dados[i]);
                }
            }
        });

        listSug.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent arg0) {}
            @Override
            public void focusLost(FocusEvent arg0) {
                txtBusca.setText((String) listSug.getSelectedItem());
            }
        });
    }

    public JTextField getTxtBusca() {
        return txtBusca;
    }

    public void setTxtBusca(JTextField txtBusca) {
        this.txtBusca = txtBusca;
    }

    public JComboBox getListSug() {
        return listSug;
    }

    public void setListSug(JComboBox listSug) {
        this.listSug = listSug;
    }
    
    public String[] buscaDados(String texto) {  
//        ResultSet rs = daoNome.buscaDadosPessoais(texto); 
        ResultSet rs = bairroController.bairrosResultSet();
        int i = 0;  
        // Vamos limitar a 10 sugestões <img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">  
        dados = new String[40];  
        try {  
            for (i = 0; rs.next() && i < dados.length; i++) {  
//                dados[i] = rs.getString("nome");  
                dados[i] = rs.getString("bai_nome");  
//                System.out.println(i + " - " + dados[i]);  
                System.out.println(dados[i]);  
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        return dados;  
    }  
}
