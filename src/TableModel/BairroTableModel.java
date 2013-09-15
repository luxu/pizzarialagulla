package TableModel;

import classes.Bairro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luxu
 */
public class BairroTableModel extends AbstractTableModel{
    
    // Lista de Sócios a serem exibidos na tabela
    private List<Bairro> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[] {"Código","Nome"};
    // Constantes representando o índice das colunas
    private static final int CODIGO = 0;
    private static final int NOME = 1;

    // Cria um SocioTableModel sem nenhuma linha
    public BairroTableModel(){
        linhas = new ArrayList<Bairro>();
    }
    
    // Cria um SocioTableModel contendo a lista recebida por parâmetro
    public BairroTableModel(List<Bairro> listaDeBairros){
        linhas = new ArrayList<Bairro>(listaDeBairros);
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
            case CODIGO:
                return Integer.class;
            case NOME:
                return String.class;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Bairro bairro = linhas.get(rowIndex);
        
        switch(columnIndex){
            case CODIGO:
                return bairro.getBaiCodigo();
            case NOME:
                return bairro.getBaiNome();
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }
/**
     * ************************ MÉTODOS NOVOS IMPLEMENTADOS PARA SEREM USADOS SE
     * PRECISAR **************************
     */
    /* Retorna linha especificada. */
    public Bairro getBairros(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    /**
     * Adiciona um novo {@link Bairro} e notifica os listeners que um novo
     * registro foi adicionado.
     */
    public void adiciona(Bairro i) {
        linhas.add(i);

        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    /**
     * Similar ao {@link #adiciona(Bairro)}, porém para remover. Recebe o
     * índice do cliente a ser removido. Se não souber o índice, use o método
     * {@link #getIndice(Bairro)} antes.
     */
    public Bairro remove(int indice) {
        Bairro clientes = this.getBairros(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return clientes;
    }

    /* Adiciona uma lista de sócios ao final dos registros. */
    public void addListaDeUfs(List<Bairro> clientes) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        linhas.addAll(clientes);

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

    public void atualizar(int row, Bairro clientes) {
        linhas.set(row, clientes);
        this.fireTableRowsUpdated(row, row);
    }
}
