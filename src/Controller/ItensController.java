package Controller;

import DAO.ItensDao;
import classes.Itens;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class ItensController {

    public void salvar(int pro_codigo, int ped_codigo, Double valor, Integer quantidade)
            throws SQLException, ParseException {
        Itens produto = new Itens();
        produto.setIteProCodigo(pro_codigo);
        produto.setItePedCodigo(ped_codigo);
        produto.setIteValor(valor);
        produto.setIteQuantidade(quantidade);
        new ItensDao().salvar(produto);
    }

    public void alterar(int ite_codigo, int pro_codigo, int ped_codigo, Double valor, Integer quantidade)
            throws ParseException, SQLException {
        Itens produto = new Itens();
        produto.setIteCodigo(ite_codigo);
        produto.setIteProCodigo(pro_codigo);
        produto.setItePedCodigo(ped_codigo);
        produto.setIteValor(valor);
        produto.setIteQuantidade(quantidade);
        new ItensDao().alterar(produto);
    }

    public void excluir(int id) throws SQLException {
        new ItensDao().excluir(id);
    }

    public List<Itens> listaItenss() {
        ItensDao dao = new ItensDao();
        try {
            return dao.findItens();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar Itens\n" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Itens> buscaPorProduto(int pro_codigo) {
        ItensDao dao = new ItensDao();
        try {
            return dao.findItensPorProduto(pro_codigo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar Itens\n" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Itens> buscaPorPedido(int ped_codigo) {
        ItensDao dao = new ItensDao();
        try {
            return dao.findItensPorPedido(ped_codigo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar Itens\n" + e.getLocalizedMessage());
        }
        return null;
    }
    
    public int ultimoID(String tabela, String chave){
        ItensDao dao = new ItensDao();
        return dao.getMaxPK(tabela,chave);
    }
}
