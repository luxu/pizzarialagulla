package DAO;

import classes.Cliente;
import classes.Pedido;
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
public class PedidoDao extends GenericDao {

    public void salvar(Pedido pedido) throws SQLException {
        String insert = "INSERT INTO pedido(cli_codigo, ped_datahora, ped_valortotal, ped_desconto, ped_entrega, ped_cancelado"
                + ", ped_valorpago, ped_formapagamento, ped_fechado) "
                + "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        save(insert,
                pedido.getCliCodigo(),
                pedido.getPedDatahora(),
                pedido.getPedValortotal(),
                pedido.getPedDesconto(),
                pedido.getPedEntrega(),
                pedido.getPedCancelado(),
                pedido.getPedValorpago(),
                pedido.getPedFormapagamento(),
                pedido.getPedFechado());
    }

    public void alterar(Pedido pedido) throws SQLException {
        String update = "UPDATE pedido "
                + "SET cli_codigo = ?, ped_datahora = ?, ped_valortotal = ?, "
                + "ped_desconto = ?, ped_entrega = ?, ped_cancelado = ?, "
                + "ped_valorpago = ?, ped_formapagamento = ?, ped_fechado = ?"
                + " WHERE ped_codigo = ?";
        update(update,
                pedido.getPedCodigo(), pedido.getCliCodigo(), pedido.getPedDatahora(),
                pedido.getPedValortotal(), pedido.getPedDesconto(), pedido.getPedEntrega(),
                pedido.getPedCancelado(), pedido.getPedValorpago(), pedido.getPedFormapagamento(),
                pedido.getPedFechado());
    }

    public void excluir(int id) throws SQLException {
        String delete = "DELETE FROM pedido WHERE ped_codigo = ?";
        delete(delete, id);
    }

    public List<Pedido> findPedidos() throws SQLException {
        List<Pedido> pedidos = new ArrayList<>();
        String select = "SELECT * FROM pedido";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setPedCodigo(rs.getInt("ped_codigo"));
            pedido.setCliCodigo(rs.getInt("cli_codigo"));
            pedido.setPedDatahora(rs.getDate("ped_datahora"));
            pedido.setPedValortotal(rs.getDouble("ped_valortotal"));
            pedido.setPedDesconto(rs.getDouble("ped_desconto"));
            pedido.setPedEntrega(rs.getDate("ped_entrega"));
            pedido.setPedCancelado(rs.getString("ped_cancelado"));
            pedido.setPedValorpago(rs.getDouble("ped_valorpago"));
            pedido.setPedFormapagamento(rs.getString("ped_formapagamento"));
            pedido.setPedFechado(rs.getString("ped_fechado"));
            pedidos.add(pedido);
        }
        return pedidos;
    }

    public List<Pedido> findPedidoPorCliente(int cli_codigo) {
        List<Pedido> pedidos = new ArrayList<>();
        String select = "SELECT * FROM pedido WHERE cli_codigo = ? and ped_fechado = 'N'";
        Pedido pedido;
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
        stmt.setInt(1, cli_codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            pedido = new Pedido();
            pedido.setPedCodigo(rs.getInt("ped_codigo"));
            pedido.setCliCodigo(rs.getInt("cli_codigo"));
            pedido.setPedDatahora(rs.getDate("ped_datahora"));
            pedido.setPedValortotal(rs.getDouble("ped_valortotal"));
            pedido.setPedDesconto(rs.getDouble("ped_desconto"));
            pedido.setPedEntrega(rs.getDate("ped_entrega"));
            pedido.setPedCancelado(rs.getString("ped_cancelado"));
            pedido.setPedValorpago(rs.getDouble("ped_valorpago"));
            pedido.setPedFormapagamento(rs.getString("ped_formapagamento"));
            pedido.setPedFechado(rs.getString("ped_fechado"));
            pedidos.add(pedido);
        }
        rs.close();
        stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedidos;
    }

    @Override
    public int getMaxPK(String tabela, String chave) {
        String sql = "select max(" + chave + ") from " + tabela;
        int max = 0;
        try {
            Statement statement = getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                max = rs.getInt(1);
            }
            statement.close();
        } catch (SQLException sqlex) {
            String erro;
            erro = "Erro: " + sqlex.toString();
            return -1;
        }
        return max;
    }

    public Pedido findContatoPorTelefone(String telefone) throws SQLException {
        String select = "SELECT * FROM pedido WHERE ped_telres = ?";
        Pedido pedido = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, telefone);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            pedido = new Pedido();
            //            pedido.setCliCodigo(rs.getInt("cli_codigo"));
            //            pedido.setBaiCodigo(rs.getInt("bai_codigo"));
            //            pedido.setCliNome(rs.getString("cli_nome"));
            //            pedido.setCliEndereco(rs.getString("cli_endereco"));
            //            pedido.setCliCEP(rs.getString("cli_cep"));
            //            pedido.setCliIdade(rs.getShort("cli_idade"));
            //            pedido.setCliTelres(rs.getString("cli_telres"));
            //            pedido.setCliCelular1(rs.getString("cli_celular1"));
            //            pedido.setCliCelular2(rs.getString("cli_celular2"));
            //            pedido.setCliEmail(rs.getString("cli_email"));
            //            pedido.setCliDtnasc(rs.getString("cli_dtnasc"));
            //            pedido.setCliObs(rs.getString("cli_obs"));
        }
        rs.close();
        stmt.close();
        return pedido;
    }

    public Pedido PedidoPorCliente(Integer ped_codigo) {
        String select = "SELECT * FROM pedido WHERE ped_codigo = ?";
        Pedido pedido = null;
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setInt(1, ped_codigo);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            pedido = new Pedido();
            pedido.setPedCodigo(rs.getInt("ped_codigo"));
            pedido.setCliCodigo(rs.getInt("cli_codigo"));
            pedido.setPedDatahora(rs.getDate("ped_datahora"));
            pedido.setPedValortotal(rs.getDouble("ped_valortotal"));
        }
        rs.close();
        stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pedido;
    }
    
    public ResultSet pedidosResultSet(int cli_codigo) {
        ResultSet rs = null;
        try {
            Statement stmt = (Statement) getConnection().createStatement();;
//            rs = stmt.executeQuery("SELECT * FROM pedido");
            rs = stmt.executeQuery("SELECT c.cli_codigo, c.cli_nome, p.ped_valortotal, p.ped_codigo, p.ped_datahora FROM "
                    + "cliente c, pedido p WHERE c.cli_codigo = p.cli_codigo "
                    + "and c.cli_codigo = " + cli_codigo);
        } catch (Exception e) {
            e.printStackTrace();
        } 
         return rs;
    }

    public List<Cliente> buscarClientePorPedido() {
        List<Cliente> clientes = new ArrayList<>();
        String select = "SELECT c.cli_codigo,cli_nome FROM pedido p, cliente c WHERE p.cli_codigo = c.cli_codigo"
                + " GROUP BY c.cli_codigo";
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCliCodigo(rs.getInt("c.cli_codigo"));
                cliente.setCliNome(rs.getString("cli_nome"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
}
