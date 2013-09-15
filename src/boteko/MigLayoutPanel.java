package boteko;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class MigLayoutPanel extends JPanel {
    
    MigLayout layout;
    
    public MigLayoutPanel(){
        initialize();
    }
    
    public void initialize(){
        layout = new MigLayout("wrap 3", "grow", "grow");
    setLayout(layout);
    setPreferredSize(new Dimension(400, 300));
    add(new JButton("Northwest"), "align left top");
    add(new JButton("North"), "align center top");
    add(new JButton("Northeast"), "align right top");
    add(new JButton("West"), "align left center");
    add(new JButton("Center"), "align center");
    add(new JButton("East"), "align right center");
    add(new JButton("Southwest"), "align left bottom");
    add(new JButton("South"), "align center bottom");
    add(new JButton("Southeast"), "align right bottom");
    }
}
