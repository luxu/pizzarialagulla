package DAO;

import classes.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class ProdutoDao extends GenericDao {

    public void salvar(Produto produto) {
        String insert = "INSERT INTO Produto(pro_descricao,pro_preco_venda,pro_unidade) "
                + "VALUES( ?,  ?,  ?)";
        try {
            save(insert, produto.getProDescricao(), produto.getProPrecoVenda(),produto.getProUnidade());
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Produto produto) {
        String update = "UPDATE Produto "
                + "SET pro_descricao = ?, pro_preco_venda = ?, pro_unidade = ?"
                + " WHERE pro_codigo = ?";
        try {
            update(update, produto.getProCodigo(), produto.getProDescricao(), produto.getProPrecoVenda(), produto.getProUnidade());
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluir(int id) throws SQLException {
        String delete = "DELETE FROM Produto WHERE pro_codigo = ?";
        delete(delete, id);
    }

    public List<Produto> findProdutos() throws SQLException {
        List<Produto> contatos = new ArrayList<Produto>();
        String select = "SELECT * FROM produto";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Produto produto = new Produto();
            produto.setProCodigo(rs.getInt("pro_codigo"));
            produto.setProDescricao(rs.getString("pro_descricao"));
            produto.setProPrecoVenda(rs.getDouble("pro_preco_venda"));
            produto.setProUnidade(rs.getString("pro_unidade"));
            contatos.add(produto);
        }
        rs.close();
        stmt.close();
        return contatos;
    }

    public List<Produto> findContatoPorNome(String nome) throws SQLException {
        List<Produto> contatos = new ArrayList<>();
        String select = "SELECT * FROM Produto WHERE pro_descricao like '%" + nome + "%'";
        try (
            PreparedStatement stmt = getConnection().prepareStatement(select); 
            ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setProCodigo(rs.getInt("pro_codigo"));
                produto.setProDescricao(rs.getString("pro_descricao"));
                produto.setProPrecoVenda(rs.getDouble("pro_preco_venda"));
                produto.setProUnidade(rs.getString("pro_unidade"));
                contatos.add(produto);
            }
        }
        return contatos;
    }

    public Produto findProdutoPorNome(int prod_codigo){
        Produto produto = new Produto();
        String select = "SELECT * FROM produto WHERE pro_codigo = ?";
        PreparedStatement stmt;
        ResultSet rs = null;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setInt(1, prod_codigo);
            rs = stmt.executeQuery();
            while (rs.next()) {
                produto.setProCodigo(rs.getInt("pro_codigo"));
                produto.setProDescricao(rs.getString("pro_descricao"));
                produto.setProPrecoVenda(rs.getDouble("pro_preco_venda"));
                produto.setProUnidade(rs.getString("pro_unidade"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }
        return produto;
    }

    public Produto findByName(String nome) {
        String select = "SELECT * FROM produto WHERE pro_descricao = ?";
        Produto produto = null;
        PreparedStatement stmt;
        ResultSet rs = null;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            while (rs.next()) {
                produto = new Produto();
                produto.setProCodigo(rs.getInt("pro_codigo"));
                produto.setProDescricao(rs.getString("pro_descricao"));
                produto.setProPrecoVenda(rs.getDouble("pro_preco_venda"));
                produto.setProUnidade(rs.getString("pro_unidade"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produto;
    }

    public Produto findContatoPorTelefone(String telefone) throws SQLException {
        String select = "SELECT * FROM Produto WHERE cli_telres = ?";
        Produto produto = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, telefone);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            produto = new Produto();
            produto.setProCodigo(rs.getInt("cli_codigo"));
            produto.setProDescricao(rs.getString("pro_descricao"));
            produto.setProPrecoVenda(rs.getDouble("pro_preco_venda"));
            produto.setProUnidade(rs.getString("pro_unidade"));
        }
        rs.close();
        stmt.close();
        return produto;
    }
    
    public ResultSet produtosResultSet() {
        ResultSet rs = null;
        try {
            Statement stmt = (Statement) getConnection().createStatement();;
            rs = stmt.executeQuery("select * from produto order by pro_descricao");
        } catch (Exception e) {
            e.printStackTrace();
        } 
         return rs;
    }            
}
