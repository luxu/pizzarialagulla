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
    
    // Lista de Sócios a serem exibidos na tabela
    private List<Controle> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[] {"Data","Despesas","Cartão","Dinheiro","TotalDia","TotalPizza","Entregas","NF"};
    // Constantes representando o índice das colunas
    private static final int DATA = 0;
    private static final int DESPESAS = 1;
    private static final int CARTAO = 2;
    private static final int DINHEIRO = 3;
    private static final int TOTALDIA = 4;
    private static final int TOTALPIZZA = 5;
    private static final int ENTREGAS = 6;
    private static final int NF = 7;

    // Cria um SocioTableModel sem nenhuma linha
    public ControleTableModel(){
        linhas = new ArrayList<>();
    }
    
    // Cria um SocioTableModel contendo a lista recebida por parâmetro
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
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
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
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }
    
    /**
     * ************************ MÉTODOS NOVOS IMPLEMENTADOS PARA SEREM USADOS SE PRECISAR
    /* Retorna linha especificada. */
    public Controle getControles(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    /**
     * Adiciona um novo {@link Controle} e notifica os listeners que um novo
     * registro foi adicionado.
     */
    public void adiciona(Controle i) {
        linhas.add(i);

        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    /**
     * Similar ao {@link #adiciona(Controle)}, porém para remover. Recebe o
     * índice do controle a ser removido. Se não souber o índice, use o método
     * {@link #getIndice(Controle)} antes.
     */
    public Controle remove(int indice) {
        Controle controles = this.getControles(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return controles;
    }

    /* Adiciona uma lista de sócios ao final dos registros. */
    public void addListaDeUfs(List<Controle> controles) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        linhas.addAll(controles);

        // Reporta a mudança. O JTable recebe a notificação  
        // e se redesenha permitindo que visualizemos a atualização.  
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        // Remove todos os elementos da lista de sócios.  
        linhas.clear();

        // Reporta a mudança. O JTable recebe a notificação  
        // e se redesenha permitindo que visualizemos a atualização.  
        fireTableDataChanged();
    }

    /* Verifica se este table model está vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public void atualizar(int row, Controle controles) {
        linhas.set(row, controles);
        this.fireTableRowsUpdated(row, row);
    }
}
