package boteko;

import javax.swing.UIManager;
import telas.TelaLogin;

public class Main {

    public static void main(String[] args) {
//        new Gamb();
        UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
        new TelaLogin().setVisible(true);
    }
}
