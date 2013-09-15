package classes;

import boteko.Gamb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luxu
 */
public class ServicoCliente {
    
//    public List<Bairro> listarBairros() {
//        String sentencaSelect = "SELECT * FROM Bairro";
//        ResultSet resultsetSelect = Gamb.getConexao().consultar(sentencaSelect);
//        List<Bairro> bairros = new ArrayList<>();
//        try {
//            while (resultsetSelect.next()) {
//                bairros.add(recuperarObjeto(resultsetSelect));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ServicoCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
////        for (Bairro bairro : bairros) {
////            System.out.println("Código: "+bairro.getBaiCodigo()+" - Nome: "+bairro.getBaiNome());
////        }
//        return bairros;
//    }

    private Bairro recuperarObjeto(ResultSet resultsetSelect) throws SQLException {
        Bairro bairro = new Bairro();
        bairro.setBaiCodigo(resultsetSelect.getInt("bai_codigo"));
        bairro.setBaiNome(resultsetSelect.getString("bai_nome"));
        return bairro;
    }
}
