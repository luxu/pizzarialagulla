package Controller;

import DAO.ControleDao;
import classes.Controle;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luxu
 */
public class ControleController {
    
    public Integer salvar(Date data, Double despesasDoDia, BigDecimal totalVendasDia, Double vendasCartaoDia, 
            Double vendasDinheiroDia, Integer totalPizzaVendidaDia, Integer totalPizzaEntregueDia, 
            Double valorNotaFiscal) 
    {
        Controle controle = new Controle();
        controle.setConData(data);
        controle.setCondespesasDoDia(despesasDoDia);
        controle.setContotalVendasDia(totalVendasDia);
        controle.setConvendasCartaoDia(vendasCartaoDia);
        controle.setConvendasDinheiroDia(vendasDinheiroDia);
        controle.setContotalPizzaVendidaDia(totalPizzaVendidaDia);
        controle.setContotalPizzaEntregueDia(totalPizzaEntregueDia);
        controle.setConvalorNotaFiscal(valorNotaFiscal);
        if (new ControleDao().salvar(controle)==1)
            return 1;
        return 0;
    }

    public Integer alterar(Integer id,Date data, Double despesasDoDia, BigDecimal totalVendasDia, Double vendasCartaoDia, 
            Double vendasDinheiroDia,Integer totalPizzaVendidaDia,Integer totalPizzaEntregueDia, Double valorNotaFiscal){
        Controle controle = new Controle();
        controle.setConCodigo(id);
        controle.setConData(data);
        controle.setCondespesasDoDia(despesasDoDia);
        controle.setContotalVendasDia(totalVendasDia);
        controle.setConvendasCartaoDia(vendasCartaoDia);
        controle.setConvendasDinheiroDia(vendasDinheiroDia);
        controle.setContotalPizzaVendidaDia(totalPizzaVendidaDia);
        controle.setContotalPizzaEntregueDia(totalPizzaEntregueDia);
        controle.setConvalorNotaFiscal(valorNotaFiscal);
        if (new ControleDao().alterar(controle)==1)
            return 1;
        return 0;
    }

    public Integer excluir(int id){
        if (new ControleDao().excluir(id)==1)
            return 1;
        return 0;
    }
    
    public List<Controle> listaControles() {
        return new ControleDao().findControles();
    }

    public int ultimoID(String tabela, String chave){
        return new ControleDao().getMaxPK(tabela,chave);
    }
    
    public Controle listaDeControlePorData(Date data){
        return new ControleDao().findByDate(data);
    }

    public ResultSet controlesResultSet() {
        return new ControleDao().controlesResultSet();
    }
}
