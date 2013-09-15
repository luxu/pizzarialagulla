package Controller;

import DAO.ClienteDao;
import classes.Cliente;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luxu
 */
public class ClienteController {

    public Integer salvar(Integer bairro, String nome, String endereco, String CEP, String telefone, String celular1, 
            String celular2, String email, Date dtNascimento, String obs) {
        Cliente cliente = new Cliente();
        cliente.setBaiCodigo(bairro);
        cliente.setCliNome(nome);
        cliente.setCliEndereco(endereco);
        cliente.setCliCEP(CEP);
        cliente.setCliTelres(telefone);
        cliente.setCliCelular1(celular1);
        cliente.setCliCelular2(celular2);
        cliente.setCliEmail(email);
        cliente.setCliDtnasc(dtNascimento);
        cliente.setCliObs(obs);
        if (new ClienteDao().salvar(cliente)==1)
            return 1;
        return 0;
    }

    public Integer alterar(Integer id, Integer bairro, String nome, String endereco, String CEP, String telefone, String celular1, 
            String celular2, String email, Date dtNascimento, String obs){
        Cliente cliente = new Cliente();
        cliente.setCliCodigo(id);
        cliente.setBaiCodigo(bairro);
        cliente.setCliNome(nome);
        cliente.setCliEndereco(endereco);
        cliente.setCliCEP(CEP);
        cliente.setCliTelres(telefone);
        cliente.setCliCelular1(celular1);
        cliente.setCliCelular2(celular2);
        cliente.setCliEmail(email);
        cliente.setCliDtnasc(dtNascimento);
        cliente.setCliObs(obs);
        if (new ClienteDao().alterar(cliente)==1)
            return 1;
        return 0;
    }

    public Integer excluir(int id){
        if (new ClienteDao().excluir(id)==1)
            return 1;
        return 0;
    }
    
    public List<Cliente> listaClientes() {
        return new ClienteDao().findClientes();
    }

    public int ultimoID(String tabela, String chave){
        return new ClienteDao().getMaxPK(tabela,chave);
    }
    
    public Cliente buscaClientePorNome(String nome){
        return new ClienteDao().findByName(nome);
    }

    public Cliente buscaClientePorCodigo(Integer cli_codigo){
        return new ClienteDao().findByCodigo(cli_codigo);
    }

    public Cliente buscaDeClientePorTelefone(String telefone) {
        return new ClienteDao().findClientePorTelefone(telefone);
    }

    public List<Cliente> listaDeClientePorNome(String nome) {
        return new ClienteDao().findClientePorNome(nome);
    }

    public List<Cliente> listaDeClientePorTelefone(String telefone) {
        return new ClienteDao().findClientesPorTelefone(telefone);
    }

    public ResultSet clientesResultSet() {
        return new ClienteDao().clientesResultSet();
    }
}
