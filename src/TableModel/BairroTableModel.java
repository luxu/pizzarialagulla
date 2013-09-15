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
    
    private List<Bairro> linhas;
    private String[] colunas = new String[] {"Código","Nome"};
    private static final int CODIGO = 0;
    private static final int NOME = 1;

    public BairroTableModel(){
        linhas = new ArrayList<Bairro>();
    }
    
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
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    public Bairro getBairros(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void adiciona(Bairro i) {
        linhas.add(i);
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    public Bairro remove(int indice) {
        Bairro clientes = this.getBairros(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return clientes;
    }

    public void addListaDeUfs(List<Bairro> clientes) {
        int tamanhoAntigo = getRowCount();
        linhas.addAll(clientes);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public void atualizar(int row, Bairro clientes) {
        linhas.set(row, clientes);
        this.fireTableRowsUpdated(row, row);
    }
}
