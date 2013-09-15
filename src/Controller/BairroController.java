package Controller;

import DAO.BairroDao;
import classes.Bairro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class BairroController {
    
    public void salvar(String nome) {
        Bairro bairro = new Bairro();
        bairro.setBaiNome(nome);
        new BairroDao().salvar(bairro);
    }
 
    public void alterar(int id, String nome) {
        Bairro bairro = new Bairro();
        bairro.setBaiCodigo(id);
        bairro.setBaiNome(nome);
        new BairroDao().alterar(bairro);
    }
 
    public Integer excluir(int id) {
        if (new BairroDao().excluir(id)==1)
                return 1;
            return 0;    
    }

    public List<Bairro> listaBairros() {
        BairroDao dao = new BairroDao();
        try {
            return dao.findBairros();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cliente\n" + e.getLocalizedMessage());
        }
        return null;
    }
 
    public List<Bairro> listaDeBairroPorNome(String nome) {
        try {
            return new BairroDao().findBairroPorNome(nome);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar bairro\n" + e.getLocalizedMessage());
        }
        return null;
    }
 
    public Bairro buscaBairroPorNome(String nome) throws SQLException {
        return new BairroDao().findByName(nome);
    }

    public int ultimoID(String tabela, String chave) {
        return new BairroDao().getMaxPK(tabela,chave);
    }

    public ResultSet bairrosResultSet() {
        return new BairroDao().bairrosResultSet();
    }
}
