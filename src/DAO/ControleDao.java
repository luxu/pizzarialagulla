package DAO;

import classes.Controle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class ControleDao extends GenericDao {

    public Integer salvar(Controle controle) {
        String insert = "INSERT INTO Controle(" +
                "con_Data," +
                "con_despesasDoDia," +
                "con_totalVendasDia," +
                "con_vendasCartaoDia," +
                "con_vendasDinheiroDia," +
                "con_totalPizzaVendidaDia," +
                "con_totalPizzaEntregueDia," +
                "con_valorNotaFiscal) VALUES(?,?,?,?,?,?,?,?)";
        try {
            save(insert, 
                controle.getConData(),
                controle.getCondespesasDoDia(),
                controle.getContotalVendasDia(),
                controle.getConvendasCartaoDia(),
                controle.getConvendasDinheiroDia(),
                controle.getContotalPizzaVendidaDia(),
                controle.getContotalPizzaEntregueDia(),
                controle.getConvalorNotaFiscal()
                );
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public Integer alterar(Controle controle) {
        String update = "UPDATE controle SET con_data = ?, con_despesasDoDia = ?, con_totalVendasDia = ?," 
                + "con_vendasCartaoDia = ?, con_vendasDinheiroDia = ?, con_totalPizzaVendidaDia = ?," 
                + "con_totalPizzaEntregueDia = ?,con_valorNotaFiscal = ? WHERE con_codigo = ?";
        try {
            update(update,controle.getConCodigo(),controle.getConData(),controle.getCondespesasDoDia(),controle.getContotalVendasDia(),
                    controle.getConvendasCartaoDia(),controle.getConvendasDinheiroDia(),controle.getContotalPizzaVendidaDia(),
                    controle.getContotalPizzaEntregueDia(),controle.getConvalorNotaFiscal());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return 0;
        }
//        JOptionPane.showMessageDialog(null, update+"\n"+
//                controle.getConData()+ " - " +
//                controle.getCondespesasDoDia() + " - " +
//                controle.getContotalVendasDia() + " - " +
//                controle.getConvendasCartaoDia() + " - " +
//                controle.getConvendasDinheiroDia() + " - " +
//                controle.getContotalPizzaVendidaDia() + " - " +
//                controle.getContotalPizzaEntregueDia() + " - " +
//                controle.getConvalorNotaFiscal() + " - " +
//                controle.getConCodigo());
        return 1;
    }

    public Integer excluir(int id) {
        String delete = "DELETE FROM controle WHERE con_codigo = ?";
        try {
            delete(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public List<Controle> findControles() {
        List<Controle> controles = new ArrayList<Controle>();
        String select = "SELECT * FROM Controle order by con_data desc";
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Controle controle = new Controle();
            controle.setConCodigo(rs.getInt("con_codigo"));
            controle.setConData(rs.getDate("con_data"));
            controle.setCondespesasDoDia(rs.getDouble("con_despesasDoDia"));
            controle.setContotalVendasDia(rs.getBigDecimal("con_totalVendasDia"));
            controle.setContotalPizzaEntregueDia(rs.getInt("con_totalPizzaEntregueDia"));
            controle.setContotalPizzaVendidaDia(rs.getInt("con_totalPizzaVendidaDia"));
            controle.setConvalorNotaFiscal(rs.getDouble("con_valorNotaFiscal"));
            controle.setConvendasCartaoDia(rs.getDouble("con_vendasCartaoDia"));
            controle.setConvendasDinheiroDia(rs.getDouble("con_vendasDinheiroDia"));
            controles.add(controle);
        }
        rs.close();
        stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return controles;
    }

    public Controle findByDate(Date data) {
        Controle controle = null;
        String select = "SELECT * FROM Controle WHERE con_data = ?";
        try {
            PreparedStatement stmt = getConnection().prepareStatement(select);
            stmt.setDate(1, new java.sql.Date(data.getTime()));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                controle = new Controle();
                controle.setConCodigo(rs.getInt("con_codigo"));
                controle.setConData(rs.getDate("con_data"));
                controle.setCondespesasDoDia(rs.getDouble("con_despesasDoDia"));
                controle.setContotalVendasDia(rs.getBigDecimal("con_totalVendasDia"));
                controle.setContotalPizzaEntregueDia(rs.getInt("con_totalPizzaEntregueDia"));
                controle.setContotalPizzaVendidaDia(rs.getInt("con_totalPizzaVendidaDia"));
                controle.setConvalorNotaFiscal(rs.getDouble("con_valorNotaFiscal"));
                controle.setConvendasCartaoDia(rs.getDouble("con_vendasCartaoDia"));
                controle.setConvendasDinheiroDia(rs.getDouble("con_vendasDinheiroDia"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return controle;
    }

    public ResultSet controlesResultSet() {
                ResultSet rs = null;
        try {
            Statement stmt = (Statement) getConnection().createStatement();;
            rs = stmt.executeQuery("select * from controle");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;

    }
}