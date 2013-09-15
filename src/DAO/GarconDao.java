package DAO;

import classes.Garcon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luxu
 */
public class GarconDao extends GenericDao {

    public void salvar(Garcon garcon) throws SQLException {
        String insert = "INSERT INTO Garcon(gar_nome,gar_endereco,gar_telefone,gar_data_admissao,gar_rg,gar_cpf) "
                + "VALUES( ?,  ?,  ?, ?, ?, ?)";
        save(insert, garcon.getGarNome(),garcon.getGarEndereco(),garcon.getGarTelefone(),garcon.getGarDataAdmissao(),garcon.getGarRg(),
                garcon.getGarCpf());
    }

    public void alterar(Garcon garcon) throws SQLException {
        String update = "UPDATE Garcon "
                + "SET gar_nome = ?, gar_endereco = ?, gar_telefone = ?, gar_data_admissao = ?, gar_rg = ?, gar_cpf = ?"
                + " WHERE gar_codigo = ?";
        update(update,garcon.getGarCodigo(),garcon.getGarNome(),garcon.getGarEndereco(),garcon.getGarTelefone(),garcon.getGarDataAdmissao(),garcon.getGarRg(),
                garcon.getGarCpf());
    }

    public void excluir(int id) throws SQLException {
        String delete = "DELETE FROM Garcon WHERE gar_codigo = ?";
        delete(delete, id);
    }

    public List<Garcon> findContatos() throws SQLException {
        List<Garcon> contatos = new ArrayList<Garcon>();
        String select = "SELECT * FROM Garcon";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Garcon garcon = new Garcon();
            garcon.setGarCodigo(rs.getInt("gar_codigo"));
            garcon.setGarNome(rs.getString("gar_nome"));
            garcon.setGarEndereco(rs.getString("gar_endereco"));
            garcon.setGarTelefone(rs.getString("gar_telefone"));
            garcon.setGarDataAdmissao(rs.getDate("gar_data_admissao"));
            garcon.setGarRg(rs.getString("gar_rg"));
            garcon.setGarCpf(rs.getString("gar_cpf"));
            contatos.add(garcon);
        }
        rs.close();
        stmt.close();
        return contatos;
    }
    
    public List<Garcon> findContatoPorNome(String nome) throws SQLException {
        List<Garcon> contatos = new ArrayList<Garcon>();
        String select = "SELECT * FROM Garcon WHERE gar_nome like '%"+nome+"%'";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Garcon garcon = new Garcon();
            garcon.setGarCodigo(rs.getInt("gar_codigo"));
            garcon.setGarNome(rs.getString("gar_nome"));
            garcon.setGarEndereco(rs.getString("gar_endereco"));
            garcon.setGarTelefone(rs.getString("gar_telefone"));
            garcon.setGarDataAdmissao(rs.getDate("gar_data_admissao"));
            garcon.setGarRg(rs.getString("gar_rg"));
            garcon.setGarCpf(rs.getString("gar_cpf"));
            contatos.add(garcon);
        }
        rs.close();
        stmt.close();
        return contatos;
    }

    public Garcon findByName(String nome) throws SQLException {
        String select = "SELECT * FROM Garcon WHERE gar_nome = ?";
        Garcon garcon = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            garcon = new Garcon();
            garcon.setGarCodigo(rs.getInt("gar_codigo"));
            garcon.setGarNome(rs.getString("gar_nome"));
            garcon.setGarEndereco(rs.getString("gar_endereco"));
            garcon.setGarDataAdmissao(rs.getDate("gar_data_admissao"));
            garcon.setGarRg(rs.getString("gar_rg"));
            garcon.setGarCpf(rs.getString("gar_cpf"));
        }
        rs.close();
        stmt.close();
        return garcon;
    }
}
