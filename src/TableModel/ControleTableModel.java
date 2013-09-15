package TableModel;

import classes.Controle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luxu
 */
public class ControleTableModel extends AbstractTableModel{
    
    private List<Controle> linhas;
    private String[] colunas = new String[] {"Data","Despesas","Cartão","Dinheiro","TotalDia","TotalPizza","Entregas","NF"};
    private static final int DATA = 0;
    private static final int DESPESAS = 1;
    private static final int CARTAO = 2;
    private static final int DINHEIRO = 3;
    private static final int TOTALDIA = 4;
    private static final int TOTALPIZZA = 5;
    private static final int ENTREGAS = 6;
    private static final int NF = 7;

    public ControleTableModel(){
        linhas = new ArrayList<>();
    }
    
    public ControleTableModel(List<Controle> listaDeControles){
        linhas = new ArrayList<>(listaDeControles);
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch(columnIndex){
            case DATA:
                return Date.class;
            case DESPESAS:
                return Double.class;
            case CARTAO:
                return Double.class;
            case DINHEIRO:
                return Double.class;
            case TOTALDIA:
                return Double.class;
            case TOTALPIZZA:
                return Integer.class;
            case ENTREGAS:
                return Integer.class;
            case NF:
                return Double.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Controle controle = linhas.get(rowIndex);
        switch(columnIndex){
            case DATA:
                return controle.getConData();
            case DESPESAS:
                return controle.getCondespesasDoDia();
            case CARTAO:
                return controle.getConvendasCartaoDia();
            case DINHEIRO:
                return controle.getConvendasDinheiroDia();
            case TOTALDIA:
                return controle.getContotalVendasDia();
            case TOTALPIZZA:
                return controle.getContotalPizzaVendidaDia();
            case ENTREGAS:
                return controle.getContotalPizzaEntregueDia();
            case NF:
                return controle.getConvalorNotaFiscal();
            default:
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }
    
    public Controle getControles(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void adiciona(Controle i) {
        linhas.add(i);
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    public Controle remove(int indice) {
        Controle controles = this.getControles(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return controles;
    }

    public void addListaDeUfs(List<Controle> controles) {
        int tamanhoAntigo = getRowCount();
        linhas.addAll(controles);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public void atualizar(int row, Controle controles) {
        linhas.set(row, controles);
        this.fireTableRowsUpdated(row, row);
    }
}
