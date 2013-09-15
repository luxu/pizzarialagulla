package relatorios;

import Controller.BairroController;
import Controller.ClienteController;
import Controller.ControleController;
import Controller.PedidoController;
import Controller.ProdutoController;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author luxu
 */
public class Relatorios {

    public void relClientes() {
        JRResultSetDataSource jrRS = new JRResultSetDataSource(new ClienteController().clientesResultSet());
        try {
            JasperPrint jasperPrint = JasperFillManager
                    .fillReport(getClass().getClassLoader().getResourceAsStream("relatorios/rel_clientes.jasper"), new HashMap(), jrRS);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            System.out.println("Problemas " + ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void relPedidos(int cli_codigo) {
        try {
            JRResultSetDataSource jrRS = new JRResultSetDataSource(new PedidoController().pedidosResultSet(cli_codigo));
            JasperPrint jasperPrint = JasperFillManager
                    .fillReport(getClass().getClassLoader().getResourceAsStream("relatorios/rel_pedidos.jasper"), new HashMap(), jrRS);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void relProdutos() {
        try {
            JRResultSetDataSource jrRS = new JRResultSetDataSource(new ProdutoController().produtosResultSet());
            JasperPrint jasperPrint = JasperFillManager
                    .fillReport(getClass().getClassLoader().getResourceAsStream("relatorios/rel_produto.jasper"), new HashMap(), jrRS);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void relBairros() {
        try {
            JRResultSetDataSource jrRS = new JRResultSetDataSource(new BairroController().bairrosResultSet());
            JasperPrint jasperPrint = JasperFillManager
                    .fillReport(getClass().getClassLoader().getResourceAsStream("relatorios/rel_bairros.jasper"), new HashMap(), jrRS);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void relControles() {
        try {
            JRResultSetDataSource jrRS = new JRResultSetDataSource(new ControleController().controlesResultSet());
            JasperPrint jasperPrint = JasperFillManager
                    .fillReport(getClass().getClassLoader().getResourceAsStream("relatorios/rel_controle.jasper"), new HashMap(), jrRS);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
