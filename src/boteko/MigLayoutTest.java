package boteko;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MigLayoutTest extends JFrame {
    
    public MigLayoutTest(){
        super("MigLayoutTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new MigLayoutPanel());
        pack();
    }
    
    public static void main (String args[]){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MigLayoutTest().setVisible(true);
            }
        });
    }
}
