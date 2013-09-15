package Controller;

import DAO.ProdutoDao;
import classes.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class ProdutoController {

    public void salvar(String descricao, Double preco_venda, String unidade) {
        Produto produto = new Produto();
        produto.setProDescricao(descricao);
        produto.setProPrecoVenda(preco_venda);
        produto.setProUnidade(unidade);
        new ProdutoDao().salvar(produto);
    }

    public void alterar(Integer id, String descricao, Double preco_venda, String unidade) {
        Produto produto = new Produto();
        produto.setProCodigo(id);
        produto.setProDescricao(descricao);
        produto.setProPrecoVenda(preco_venda);
        produto.setProUnidade(unidade);
        new ProdutoDao().alterar(produto);
    }

    public void excluir(int id) throws SQLException {
        new ProdutoDao().excluir(id);
    }

    public int ultimoID(String tabela, String chave){
        return new ProdutoDao().getMaxPK(tabela,chave);
    }
    
    public List<Produto> listaProdutos() {
        ProdutoDao dao = new ProdutoDao();
        try {
            return dao.findProdutos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar Produto\n" + e.getLocalizedMessage());
        }
        return null;
    }

    public Produto buscaProdutoPorDescricao(String nome) {
        ProdutoDao dao = new ProdutoDao();
        return dao.findByName(nome);
    }

    public Produto buscaProdutoPorDescricao(int pro_codigo) {
        ProdutoDao dao = new ProdutoDao();
        return dao.findProdutoPorNome(pro_codigo);
    }

    public List<Produto> listaProdutosPorDescricao(String descricao) {
        ProdutoDao dao = new ProdutoDao();
        try {
            return dao.findContatoPorNome(descricao);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar Produto\n" + e.getLocalizedMessage());
        }
        return null;
    }
    
    public ResultSet produtosResultSet() {
        return new ProdutoDao().produtosResultSet();
    }
}
