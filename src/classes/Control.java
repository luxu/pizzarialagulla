package classes;

import Controller.BairroController;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luxu
 */
public class Control implements IFonteDados{  
    private BairroController bairroController;
    String dados[];  
  
    public Control() {  
        bairroController = new BairroController();  
    }  
  
    @Override  
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