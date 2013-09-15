package Ferramentas;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class Restaurar {

    private int res;
    private String arq;
    private String snh = "";
    private String banco = "boteko";
    private File bkp;
    private Process proc = null;
    private JFileChooser chooser = new JFileChooser("D:\\SDO-Backup");

    public void Restore() {
        chooser.setDialogTitle("Selecione o arquivo de backup");
        chooser.showOpenDialog(chooser);
        if (chooser.getSelectedFile().isFile()){
            bkp = chooser.getSelectedFile();
            arq = bkp.getPath();
            String comando = "C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql";
            ProcessBuilder pb = new ProcessBuilder(comando,
                    " --user=root --password= boteko --execute='source D:\\SDO-Backup\\bkp_boteko.sql'");
            try {
                pb.start();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else{
            JOptionPane.showMessageDialog(null, "Nenhum Arquivo Selecionado para restaurar...");
        }
    }
    
    public void Mensagem(){
        JOptionPane.showMessageDialog(null, "Em construção...");
    }
}
