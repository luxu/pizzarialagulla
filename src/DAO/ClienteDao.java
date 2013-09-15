package DAO;

import classes.Cliente;
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
public class ClienteDao extends GenericDao {

    public Integer salvar(Cliente cliente) {
        String insert = "INSERT INTO Cliente("
                + "bai_codigo,cli_nome,cli_endereco,cli_CEP,cli_telres,cli_celular1,"
                + "cli_celular2,cli_email,cli_dtnasc,cli_obs) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            save(insert, cliente.getBaiCodigo(), cliente.getCliNome(), cliente.getCliEndereco(), cliente.getCliCEP(), cliente.getCliTelres(),
                    cliente.getCliCelular1(), cliente.getCliCelular2(), cliente.getCliEmail(), cliente.getCliDtnasc(), cliente.getCliObs());
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public Integer alterar(Cliente cliente) {
        String update = "UPDATE cliente "
                + "SET bai_codigo = ?, cli_nome = ?, cli_endereco = ?, cli_CEP = ?, cli_telres = ?,"
                + "cli_celular1 = ?, cli_celular2 = ?,cli_email = ?,cli_dtnasc = ?,cli_obs = ?"
                + " WHERE cli_codigo = ?";
        try {
            update(update, cliente.getCliCodigo(),   cliente.getBaiCodigo(),   cliente.getCliNome(),     
                           cliente.getCliEndereco(), cliente.getCliCEP(),      cliente.getCliTelres(),   
                           cliente.getCliCelular1(), cliente.getCliCelular2(), cliente.getCliEmail(),    
                           cliente.getCliDtnasc(),   cliente.getCliObs()
                           );
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public Integer excluir(int id) {
        String delete = "DELETE FROM cliente WHERE cli_codigo = ?";
        try {
            delete(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public int getMaxPK(String tabela, String chave) {
        String sql = "select max(" + chave + ") from " + tabela;
        String erro ="";
        int max = 0;
        ResultSet rs = null;
        try {
            Statement statement = getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rs = statement.executeQuery(sql);

            if (rs.next()) {
                max = rs.getInt(1);
            }
            statement.close();
        } catch (SQLException sqlex) {
            erro = "Erro: " + sqlex.toString();
            return -1;
        }

        return max;
    }

    public List<Cliente> findClientes() {
        List<Cliente> contatos = new ArrayList<>();
        String select = "SELECT * FROM Cliente";
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCliCodigo(rs.getInt("cli_codigo"));
            cliente.setBaiCodigo(rs.getInt("bai_codigo"));
            cliente.setCliNome(rs.getString("cli_nome"));
            cliente.setCliEndereco(rs.getString("cli_endereco"));
            cliente.setCliCEP(rs.getString("cli_cep"));
            cliente.setCliTelres(rs.getString("cli_telres"));
            cliente.setCliCelular1(rs.getString("cli_celular1"));
            cliente.setCliCelular2(rs.getString("cli_celular2"));
            cliente.setCliEmail(rs.getString("cli_email"));
            cliente.setCliDtnasc(rs.getDate("cli_dtnasc"));
            cliente.setCliObs(rs.getString("cli_obs"));
            contatos.add(cliente);
        }
        rs.close();
        stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contatos;
    }

    public List<Cliente> findClientePorNome(String nome) {
        List<Cliente> contatos = new ArrayList<Cliente>();
        String select = "SELECT * FROM Cliente WHERE cli_nome like '%" + nome + "%'";
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
       ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCliCodigo(rs.getInt("cli_codigo"));
            cliente.setBaiCodigo(rs.getInt("bai_codigo"));
            cliente.setCliNome(rs.getString("cli_nome"));
            cliente.setCliEndereco(rs.getString("cli_endereco"));
            cliente.setCliCEP(rs.getString("cli_cep"));
            cliente.setCliTelres(rs.getString("cli_telres"));
            cliente.setCliCelular1(rs.getString("cli_celular1"));
            cliente.setCliCelular2(rs.getString("cli_celular2"));
            cliente.setCliEmail(rs.getString("cli_email"));
            cliente.setCliDtnasc(rs.getDate("cli_dtnasc"));
            cliente.setCliObs(rs.getString("cli_obs"));
            contatos.add(cliente);
        }
        rs.close();
        stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return contatos;
    }

    public Cliente findByName(String nome) {
        String select = "SELECT * FROM Cliente WHERE cli_nome = ?";
        Cliente cliente = null;
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setCliCodigo(rs.getInt("cli_codigo"));
                cliente.setBaiCodigo(rs.getInt("bai_codigo"));
                cliente.setCliNome(rs.getString("cli_nome"));
                cliente.setCliEndereco(rs.getString("cli_endereco"));
                cliente.setCliCEP(rs.getString("cli_cep"));
                cliente.setCliTelres(rs.getString("cli_telres"));
                cliente.setCliCelular1(rs.getString("cli_celular1"));
                cliente.setCliCelular2(rs.getString("cli_celular2"));
                cliente.setCliEmail(rs.getString("cli_email"));
                cliente.setCliDtnasc(rs.getDate("cli_dtnasc"));
                cliente.setCliObs(rs.getString("cli_obs"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public Cliente findClientePorTelefone(String telefone) {
        String select = "SELECT * FROM Cliente WHERE cli_telres = ?";
        Cliente cliente = null;
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setString(1, telefone);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setCliCodigo(rs.getInt("cli_codigo"));
                cliente.setBaiCodigo(rs.getInt("bai_codigo"));
                cliente.setCliNome(rs.getString("cli_nome"));
                cliente.setCliEndereco(rs.getString("cli_endereco"));
                cliente.setCliCEP(rs.getString("cli_cep"));
                cliente.setCliTelres(rs.getString("cli_telres"));
                cliente.setCliCelular1(rs.getString("cli_celular1"));
                cliente.setCliCelular2(rs.getString("cli_celular2"));
                cliente.setCliEmail(rs.getString("cli_email"));
                cliente.setCliDtnasc(rs.getDate("cli_dtnasc"));
                cliente.setCliObs(rs.getString("cli_obs"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cliente;
    }

    public List<Cliente> findClientesPorTelefone(String telefone) {
        String select = "SELECT * FROM Cliente WHERE cli_telres = ?";
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setString(1, telefone);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCliCodigo(rs.getInt("cli_codigo"));
                cliente.setBaiCodigo(rs.getInt("bai_codigo"));
                cliente.setCliNome(rs.getString("cli_nome"));
                cliente.setCliEndereco(rs.getString("cli_endereco"));
                cliente.setCliCEP(rs.getString("cli_cep"));
                cliente.setCliTelres(rs.getString("cli_telres"));
                cliente.setCliCelular1(rs.getString("cli_celular1"));
                cliente.setCliCelular2(rs.getString("cli_celular2"));
                cliente.setCliEmail(rs.getString("cli_email"));
                cliente.setCliDtnasc(rs.getDate("cli_dtnasc"));
                cliente.setCliObs(rs.getString("cli_obs"));
                clientes.add(cliente);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public Cliente findByCodigo(Integer cli_codigo) {
        String select = "SELECT * FROM Cliente WHERE cli_codigo = ?";
        Cliente cliente = null;
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setInt(1, cli_codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setCliCodigo(rs.getInt("cli_codigo"));
                cliente.setBaiCodigo(rs.getInt("bai_codigo"));
                cliente.setCliNome(rs.getString("cli_nome"));
                cliente.setCliEndereco(rs.getString("cli_endereco"));
                cliente.setCliCEP(rs.getString("cli_cep"));
                cliente.setCliTelres(rs.getString("cli_telres"));
                cliente.setCliCelular1(rs.getString("cli_celular1"));
                cliente.setCliCelular2(rs.getString("cli_celular2"));
                cliente.setCliEmail(rs.getString("cli_email"));
                cliente.setCliDtnasc(rs.getDate("cli_dtnasc"));
                cliente.setCliObs(rs.getString("cli_obs"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
    
    public ResultSet clientesResultSet() {
        ResultSet rs = null;
        try {
            Statement stmt = (Statement) getConnection().createStatement();;
            rs = stmt.executeQuery("SELECT * FROM cliente ORDER BY cli_nome");
        } catch (Exception e) {
            e.printStackTrace();
        } 
         return rs;
    }
}
