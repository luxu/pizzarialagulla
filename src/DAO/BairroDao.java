package DAO;

import classes.Bairro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luxu
 */
public class BairroDao extends GenericDao {

    public Integer salvar(Bairro bairro) {
        String insert = "INSERT INTO Bairro(bai_nome) VALUES(?)";
        try {
            save(insert, bairro.getBaiNome());
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(BairroDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public Integer alterar(Bairro bairro) {
        String update = "UPDATE Bairro SET bai_nome = ? WHERE bai_codigo = ?";
        try {
            update(update, bairro.getBaiCodigo(), bairro.getBaiNome());
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(BairroDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public Integer excluir(int id) {
        String delete = "DELETE FROM Bairro WHERE bai_codigo = ?";
        try {
            delete(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public List<Bairro> findBairros() throws SQLException {
        List<Bairro> contatos = new ArrayList<>();
        String select = "SELECT * FROM Bairro ORDER BY bai_nome";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Bairro bairro = new Bairro();
            bairro.setBaiCodigo(rs.getInt("bai_codigo"));
            bairro.setBaiNome(rs.getString("bai_nome"));
            contatos.add(bairro);
        }
        rs.close();
        stmt.close();
        return contatos;
    }

    public List<Bairro> findBairroPorNome(String nome) throws SQLException {
        List<Bairro> contatos = new ArrayList<>();
        String select = "SELECT * FROM Bairro WHERE bai_nome like '%" + nome + "%'";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Bairro bairro = new Bairro();
            bairro.setBaiCodigo(rs.getInt("bai_codigo"));
            bairro.setBaiNome(rs.getString("bai_nome"));
            contatos.add(bairro);
        }
        rs.close();
        stmt.close();
        return contatos;
    }

    public Bairro findByName(String nome) throws SQLException {
        String select = "SELECT * FROM Bairro WHERE bai_nome = ?";
        Bairro bairro = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            bairro = new Bairro();
            bairro.setBaiCodigo(rs.getInt("bai_codigo"));
            bairro.setBaiNome(rs.getString("bai_nome"));
        }
        rs.close();
        stmt.close();
        return bairro;
    }

    public ResultSet bairrosResultSet() {
        ResultSet rs = null;
        try {
            Statement stmt = (Statement) getConnection().createStatement();;
            rs = stmt.executeQuery("select * from bairro");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}