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

    private List<Pedido> linhas;
    private String[] colunas = new String[]{"Cód", "Cliente", "DataHora", "ValorTotal", "Desconto", "Entrega",
                                            "Cancelado", "ValorPago", "FormaPagamento", "Fechado"};
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

    public PedidoTableModel() {
        linhas = new ArrayList<Pedido>();
    }

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
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
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
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    public Pedido getPedido(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void adiciona(Pedido i) {
        linhas.add(i);
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    public Pedido remove(int indice) {
        Pedido pedido = this.getPedido(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return pedido;
    }

    public void addListaDeUfs(List<Pedido> pedido) {
        int tamanhoAntigo = getRowCount();
        linhas.addAll(pedido);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public void atualizar(int row, Pedido pedido) {
        linhas.set(row, pedido);
        this.fireTableRowsUpdated(row, row);
    }
}
