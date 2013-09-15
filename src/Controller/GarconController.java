package Controller;

import DAO.GarconDao;
import classes.Garcon;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class GarconController {
    
    private Date formatarData(String data) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date novaData = new Date( formatter.parse(data).getTime() );
        return novaData;
    }
 
    public void salvar(String nome, String endereco, String telefone, String dtNascimento, String rg, String cpf) throws SQLException, ParseException {
        Garcon garcon = new Garcon();
        garcon.setGarNome(nome);
        garcon.setGarEndereco(endereco);
        garcon.setGarTelefone(telefone);
        garcon.setGarDataAdmissao(formatarData(dtNascimento));
        garcon.setGarRg(rg);
        garcon.setGarCpf(cpf);

        new GarconDao().salvar(garcon);
    }
 
    public void alterar(int id, String nome, String endereco, String telefone, String dtNascimento, String rg, String cpf) throws ParseException, SQLException {
        Garcon garcon = new Garcon();
        garcon.setGarCodigo(id);
        garcon.setGarNome(nome);
        garcon.setGarEndereco(endereco);
        garcon.setGarTelefone(telefone);
        garcon.setGarDataAdmissao(formatarData(dtNascimento));
        garcon.setGarRg(rg);
        garcon.setGarCpf(cpf);
 
        new GarconDao().alterar(garcon);
    }
 
    public List<Garcon> listaContatos() {
        GarconDao dao = new GarconDao();
        try {
            return dao.findContatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cliente\n" + e.getLocalizedMessage());
        }
        return null;
    }
 
    public List<Garcon> listaDeContatoPorNome(String nome) {
        GarconDao dao = new GarconDao();
        try {
            return dao.findContatoPorNome(nome);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cliente\n" + e.getLocalizedMessage());
        }
        return null;
    }
 
    public void excluir(int id) throws SQLException {
        new GarconDao().excluir(id);
    }
 
    public Garcon buscaContatoPorNome(String nome) throws SQLException {
        GarconDao dao = new GarconDao();
        return dao.findByName(nome);
    }
    
}
