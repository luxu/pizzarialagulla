package DAO;

import classes.Itens;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luxu
 */
public class ItensDao extends GenericDao {

    public void salvar(Itens itens) throws SQLException {
        String insert = "INSERT INTO Itens(pro_codigo,ped_codigo,ite_valor,ite_quantidade) "
                + "VALUES( ?,  ?,  ?, ?)";
        save(insert, itens.getIteProCodigo(),itens.getItePedCodigo(),itens.getIteValor(),itens.getIteQuantidade());
    }

    public void alterar(Itens itens) throws SQLException {
        String update = "UPDATE Itens "
                + "SET pro_codigo = ?, ped_codigo = ?, ite_valor = ?, ite_quantidade = ?"
                + " WHERE ite_codigo = ?";
        update(update,itens.getIteProCodigo(),itens.getItePedCodigo(),itens.getIteValor(),itens.getIteQuantidade());
    }

    public void excluir(int id) throws SQLException {
        String delete = "DELETE FROM Itens WHERE ite_codigo = ?";
        delete(delete, id);
    }
    
    public int ultimoID(){
        return getMaxPK("itens", "gar_codigo")+1;
    }

    public List<Itens> findItens() throws SQLException {
        List<Itens> contatos = new ArrayList<Itens>();
        String select = "SELECT * FROM Itens";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Itens itens = new Itens();
            itens.setIteCodigo(rs.getInt("ite_codigo"));
            itens.setIteProCodigo(rs.getInt("pro_codigo"));
            itens.setItePedCodigo(rs.getInt("ped_codigo"));
            itens.setIteValor(rs.getDouble("ite_valor"));
            itens.setIteQuantidade(rs.getInt("ite_quantidade"));
            contatos.add(itens);
        }
        rs.close();
        stmt.close();
        return contatos;
    }
    
    public List<Itens> findItensPorProduto(int pro_codigo) throws SQLException {
        List<Itens> itens = new ArrayList<>();
        String select = "SELECT * FROM Itens WHERE pro_codigo ="+pro_codigo;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Itens item = new Itens();
            item.setIteCodigo(rs.getInt("ite_codigo"));
            item.setIteProCodigo(rs.getInt("pro_codigo"));
            item.setItePedCodigo(rs.getInt("ped_codigo"));
            item.setIteValor(rs.getDouble("ite_valor"));
            item.setIteQuantidade(rs.getInt("ite_quantidade"));
            itens.add(item);
        }
        rs.close();
        stmt.close();
        return itens;
    }

    public List<Itens> findItensPorPedido(int ped_codigo) throws SQLException {
//        String select = "SELECT * FROM Itens WHERE pro_codigo ="+ped_codigo;
        String select = "SELECT * FROM Itens WHERE ped_codigo ="+ped_codigo;
        List<Itens> itens = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Itens item = new Itens();
            item.setIteCodigo(rs.getInt("ite_codigo"));
            item.setIteProCodigo(rs.getInt("pro_codigo"));
            item.setItePedCodigo(rs.getInt("ped_codigo"));
            item.setIteValor(rs.getDouble("ite_valor"));
            item.setIteQuantidade(rs.getInt("ite_quantidade"));
            itens.add(item);
        }
        rs.close();
        stmt.close();
        return itens;
    }
}
