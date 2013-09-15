package TableModel;

import classes.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luxu
 */
public class ClienteTableModel extends AbstractTableModel{
    
    private List<Cliente> linhas;
    private String[] colunas = new String[] {"Nome","Endereço","TelRes","Cel1","Cel2","OBS"};
    private static final int NOME = 0;
    private static final int ENDERECO = 1;
    private static final int TELRES = 2;
    private static final int CELULAR1 = 3;
    private static final int CELULAR2 = 4;
    private static final int OBS = 5;

    public ClienteTableModel(){
        linhas = new ArrayList<Cliente>();
    }
    
    public ClienteTableModel(List<Cliente> listaDeClientes){
        linhas = new ArrayList<Cliente>(listaDeClientes);
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
            case NOME:
                return String.class;
            case ENDERECO:
                return String.class;
            case TELRES:
                return String.class;
            case CELULAR1:
                return String.class;
            case CELULAR2:
                return String.class;
            case OBS:
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
        Cliente cliente = linhas.get(rowIndex);
        
        switch(columnIndex){
            case NOME:
                return cliente.getCliNome();
            case ENDERECO:
                return cliente.getCliEndereco();
            case TELRES:
                return cliente.getCliTelres();
            case CELULAR1:
                return cliente.getCliCelular1();
            case CELULAR2:
                return cliente.getCliCelular2();
            case OBS:
                return cliente.getCliObs();
            default:
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }
    
    public Cliente getClientes(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void adiciona(Cliente i) {
        linhas.add(i);
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    public Cliente remove(int indice) {
        Cliente clientes = this.getClientes(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return clientes;
    }

    public void addListaDeUfs(List<Cliente> clientes) {
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

    public void atualizar(int row, Cliente clientes) {
        linhas.set(row, clientes);
        this.fireTableRowsUpdated(row, row);
    }
}
