package Controller;

import DAO.PedidoDao;
import classes.Cliente;
import classes.Pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class PedidoController {
    
    public void salvar(Integer cli_codigo, Date ped_datahora, Double ped_valortotal, Double ped_desconto, Date ped_entrega, 
            String ped_cancelado, Double ped_valorpago, String ped_formapagamento, String ped_fechado)
            throws SQLException, ParseException {
        Pedido pedido = new Pedido();
        pedido.setCliCodigo(cli_codigo);
        pedido.setPedDatahora(ped_datahora);
        pedido.setPedValortotal(ped_valortotal);
        pedido.setPedDesconto(ped_desconto);
        pedido.setPedEntrega(ped_entrega);
        pedido.setPedCancelado(ped_cancelado);
        pedido.setPedValorpago(ped_valorpago);
        pedido.setPedFormapagamento(ped_formapagamento);
        pedido.setPedFechado(ped_fechado);
        new PedidoDao().salvar(pedido);
    }
 
    public void salvar(Integer cli_codigo, Date ped_datahora, Double ped_valortotal, String ped_fechado)
            throws SQLException, ParseException {
        Pedido pedido = new Pedido();
        pedido.setCliCodigo(cli_codigo);
        pedido.setPedDatahora(ped_datahora);
        pedido.setPedValortotal(ped_valortotal);
        pedido.setPedFechado(ped_fechado);
        new PedidoDao().salvar(pedido);
    }
 
    public void alterar(Integer id, Integer cli_codigo, Date ped_datahora, Double ped_valortotal, 
                        Double ped_desconto, Date ped_entrega, String ped_cancelado, Double ped_valorpago, 
                        String ped_formapagamento, String ped_fechado) {
        Pedido pedido = new Pedido();
        pedido.setPedCodigo(id);
        pedido.setCliCodigo(cli_codigo);
        pedido.setPedDatahora(ped_datahora);
        pedido.setPedValortotal(ped_valortotal);
        pedido.setPedDesconto(ped_desconto);
        pedido.setPedEntrega(ped_entrega);
        pedido.setPedCancelado(ped_cancelado);
        pedido.setPedValorpago(ped_valorpago);
        pedido.setPedFormapagamento(ped_formapagamento);
        pedido.setPedFechado(ped_fechado);
        try {
            new PedidoDao().alterar(pedido);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void excluir(int id) throws SQLException {
        new PedidoDao().excluir(id);
    }

    public int ultimoID(String tabela, String chave){
        PedidoDao dao = new PedidoDao();
        return dao.getMaxPK(tabela,chave);
    }
    
    public List<Pedido> listaPedidos() {
        PedidoDao dao = new PedidoDao();
        try {
            return dao.findPedidos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar Pedido\n" + e.getLocalizedMessage());
        }
        return null;
    }
 
    public List<Pedido> listarPedidoPorCliente(Integer cli_codigo){
        PedidoDao dao = new PedidoDao();
        return dao.findPedidoPorCliente(cli_codigo);
    }

//    public Pedido listaDeContatoPorTelefone(String telefone) {
//        PedidoDao dao = new PedidoDao();
//        return dao.findContatoPorTelefone(telefone);
//    }

    public Pedido PedidoPorCliente(Integer ped_codigo) {
        return new PedidoDao().PedidoPorCliente(ped_codigo);
    }
    
      public ResultSet pedidosResultSet(int cli_codigo) {
        return new PedidoDao().pedidosResultSet(cli_codigo);
    }

    public List<Cliente> buscarClientePorPedido() {
        return new PedidoDao().buscarClientePorPedido();
    }
}
