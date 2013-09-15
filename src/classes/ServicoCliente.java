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
    
    private Bairro recuperarObjeto(ResultSet resultsetSelect) throws SQLException {
        Bairro bairro = new Bairro();
        bairro.setBaiCodigo(resultsetSelect.getInt("bai_codigo"));
        bairro.setBaiNome(resultsetSelect.getString("bai_nome"));
        return bairro;
    }
}
