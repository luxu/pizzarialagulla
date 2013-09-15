package classes;

import javax.swing.JFrame;

/**
 *
 * @author luxu
 */
public class Tela extends JFrame {  
  
    private static final long serialVersionUID = 1L;  
    //O controle implementa IFonteDados  
    private Control control;  
    //O painel de autoComplete  
    private PainelAutoComplete pnlAutoComplete;  
  
    public Tela() {  
        super("Exemplo de auto complete");  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setSize(300, 300);  
        setLayout(null);  
        control = new Control();
        pnlAutoComplete = new PainelAutoComplete(control);  
        pnlAutoComplete.setBounds(5,5, 200,50);  
        add(pnlAutoComplete);  
    }  
  
    public static void main(String[] args) {  
        Tela teste = new Tela();  
        teste.setVisible(true);  
    }  
}  