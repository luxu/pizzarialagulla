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
    
    // Lista de Sócios a serem exibidos na tabela
    private List<Cliente> linhas;
    // Array com os nomes das colunas.
//    private String[] colunas = new String[] {"Código","Bairro","Nome","Endereço","CEP","Idade","TelRes","Cel1","Cel2","Email","Sexo","DtNas","OBS"};
    private String[] colunas = new String[] {"Nome","Endereço","TelRes","Cel1","Cel2","OBS"};
    // Constantes representando o índice das colunas
//    private static final int CODIGO = 0;
//    private static final int BAIRRO = 1;
    private static final int NOME = 0;
    private static final int ENDERECO = 1;
//    private static final int CEP = 4;
//    private static final int IDADE = 5;
    private static final int TELRES = 2;
    private static final int CELULAR1 = 3;
    private static final int CELULAR2 = 4;
//    private static final int EMAIL = 9;
//    private static final int SEXO = 10;
    private static final int OBS = 5;
//    private static final int DATANASCIMENTO = 11;

    // Cria um SocioTableModel sem nenhuma linha
    public ClienteTableModel(){
        linhas = new ArrayList<Cliente>();
    }
    
    // Cria um SocioTableModel contendo a lista recebida por parâmetro
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
//            case CODIGO:
//                return Integer.class;
//            case BAIRRO:
//                return Integer.class;
            case NOME:
                return String.class;
            case ENDERECO:
                return String.class;
//            case CEP:
//                return String.class;
//            case IDADE:
//                return Integer.class;
            case TELRES:
                return String.class;
            case CELULAR1:
                return String.class;
            case CELULAR2:
                return String.class;
//            case EMAIL:
//                return String.class;
//            case SEXO:
//                return String.class;
            case OBS:
                return String.class;
//            case DATANASCIMENTO:
//                return Date.class;
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
        Cliente cliente = linhas.get(rowIndex);
        
        switch(columnIndex){
//            case CODIGO:
//                return cliente.getCliCodigo();
//            case BAIRRO:
//                return cliente.getBaiCodigo();
            case NOME:
                return cliente.getCliNome();
            case ENDERECO:
                return cliente.getCliEndereco();
//            case CEP:
//                return cliente.getCliCEP();
//            case IDADE:
//                return cliente.getCliIdade();
            case TELRES:
                return cliente.getCliTelres();
            case CELULAR1:
                return cliente.getCliCelular1();
            case CELULAR2:
                return cliente.getCliCelular2();
//            case EMAIL:
//                return cliente.getCliEmail();
//            case SEXO:
//                return cliente.getCliSexo();
            case OBS:
                return cliente.getCliObs();
//            case DATANASCIMENTO:
//                return cliente.getCliDtnasc();
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
    public Cliente getClientes(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    /**
     * Adiciona um novo {@link Cliente} e notifica os listeners que um novo
     * registro foi adicionado.
     */
    public void adiciona(Cliente i) {
        linhas.add(i);

        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    /**
     * Similar ao {@link #adiciona(Cliente)}, porém para remover. Recebe o
     * índice do cliente a ser removido. Se não souber o índice, use o método
     * {@link #getIndice(Cliente)} antes.
     */
    public Cliente remove(int indice) {
        Cliente clientes = this.getClientes(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return clientes;
    }

    /* Adiciona uma lista de sócios ao final dos registros. */
    public void addListaDeUfs(List<Cliente> clientes) {
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

    public void atualizar(int row, Cliente clientes) {
        linhas.set(row, clientes);
        this.fireTableRowsUpdated(row, row);
    }
}
