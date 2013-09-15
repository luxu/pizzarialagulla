package classes;

import boteko.Gamb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luxu
 */
public class ServicoProduto {
    public List<Produto> listarProdutos() throws SQLException {
        String sentencaSelect = "SELECT * FROM Produto ";
        ResultSet resultsetSelect = Gamb.getConexao().consultar(sentencaSelect);
        List<Produto> produtos = new ArrayList<>();
        while (resultsetSelect.next()) {
            produtos.add(recuperarObjeto(resultsetSelect));
        }
//        for (Produto produto : produtos) {
//            System.out.println("Código: "+produto.getProCodigo()+" - Descrição: "+produto.getProDescricao());
//        }
        return produtos;
    }

    private Produto recuperarObjeto(ResultSet resultsetSelect) throws SQLException {
        Produto produto = new Produto();
//        produto.setProCodigo(resultsetSelect.getInt("pro_codigo"));
        produto.setProDescricao(resultsetSelect.getString("pro_descricao"));
        return produto;
    }
}
