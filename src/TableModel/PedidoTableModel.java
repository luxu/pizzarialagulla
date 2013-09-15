package TableModel;

import classes.Pedido;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luxu
 */
public class PedidoTableModel extends AbstractTableModel {

    // Lista de Pedidos a serem exibidos na tabela
    private List<Pedido> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Cód", "Cliente", "DataHora", "ValorTotal", "Desconto", "Entrega",
                                            "Cancelado", "ValorPago", "FormaPagamento", "Fechado"};
    // Constantes representando o índice das colunas
    private static final int CODIGO = 0;
    private static final int CLIENTE = 1;
    private static final int DATAHORA = 2;
    private static final int VALORTOTAL = 3;
    private static final int DESCONTO = 4;
    private static final int ENTREGA = 5;
    private static final int CANCELADO = 6;
    private static final int VALORPAGO = 7;
    private static final int FORMAPAGAMENTO = 8;
    private static final int FECHADO = 9;

    // Cria um PedidoTableModel sem nenhuma linha
    public PedidoTableModel() {
        linhas = new ArrayList<Pedido>();
    }

    // Cria um PedidoTableModel contendo a lista recebida por parâmetro
    public PedidoTableModel(List<Pedido> listaDePedido) {
        linhas = new ArrayList<>(listaDePedido);
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
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case CODIGO:
                return Integer.class;
            case CLIENTE:
                return Integer.class;
            case DATAHORA:
                return Date.class;
            case VALORTOTAL:
                return Double.class;
            case DESCONTO:
                return Double.class;
            case ENTREGA:
                return Date.class;
            case CANCELADO:
                return Character.class;
            case VALORPAGO:
                return Double.class;
            case FORMAPAGAMENTO:
                return String.class;
            case FECHADO:
                return Character.class;
            default:
                // Não deve ocorrer, pois só existem 10 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o pedido referente a linha especificada.
        Pedido pedido = linhas.get(rowIndex);

        switch (columnIndex) {
            case CODIGO:
                return pedido.getPedCodigo();
            case CLIENTE:
                return pedido.getCliCodigo();
            case DATAHORA:
                return pedido.getPedDatahora();
            case VALORTOTAL:
                return pedido.getPedValortotal();
            case DESCONTO:
                return pedido.getPedDesconto();
            case ENTREGA:
                return pedido.getPedEntrega();
            case CANCELADO:
                return pedido.getPedCancelado();
            case VALORPAGO:
                return pedido.getPedValorpago();
            case FORMAPAGAMENTO:
                return pedido.getPedFormapagamento();
            case FECHADO:
                return pedido.getPedFechado();
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    /**
     * MÉTODOS NOVOS IMPLEMENTADOS PARA SEREM USADOS SE PRECISAR
     */
    
    /* Retorna linha especificada. */
    public Pedido getPedido(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    /**
     * Adiciona um novo {@link Cliente} e notifica os listeners que um novo
     * registro foi adicionado.
     */
    public void adiciona(Pedido i) {
        linhas.add(i);

        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    /**
     * Similar ao {@link #adiciona(Cliente)}, porém para remover. Recebe o
     * índice do cliente a ser removido. Se não souber o índice, use o método
     * {@link #getIndice(Cliente)} antes.
     */
    public Pedido remove(int indice) {
        Pedido pedido = this.getPedido(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return pedido;
    }

    /* Adiciona uma lista de pedidos ao final dos registros. */
    public void addListaDeUfs(List<Pedido> pedido) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        linhas.addAll(pedido);

        // Reporta a mudança. O JTable recebe a notificação  
        // e se redesenha permitindo que visualizemos a atualização.  
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        // Remove todos os elementos da lista
        linhas.clear();

        // Reporta a mudança. O JTable recebe a notificação  
        // e se redesenha permitindo que visualizemos a atualização.  
        fireTableDataChanged();
    }

    /* Verifica se este table model está vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public void atualizar(int row, Pedido pedido) {
        linhas.set(row, pedido);
        this.fireTableRowsUpdated(row, row);
    }
}
