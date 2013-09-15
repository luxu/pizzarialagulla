package TableModel;

import Controller.ProdutoController;
import classes.Itens;
import classes.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luxu
 */
public class ItensTableModel extends AbstractTableModel {

    private List<Itens> linhas;
    private String[] colunas = new String[]{"Prod", "Vlr", "Qtd"};
    private static final int PRODUTO = 0;
    private static final int VALOR = 1;
    private static final int QUANTIDADE = 2;

    public ItensTableModel() {
        linhas = new ArrayList<>();
    }

    public ItensTableModel(List<Itens> listaDeItens) {
        linhas = new ArrayList<>(listaDeItens);
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
            case PRODUTO:
                return String.class;
            case VALOR:
                return Double.class;
            case QUANTIDADE:
                return Integer.class;
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
        Itens itens = linhas.get(rowIndex);
        switch (columnIndex) {
            case PRODUTO:{
                ProdutoController controller = new ProdutoController();
                Produto produto = new Produto();
                produto = controller.buscaProdutoPorDescricao(itens.getIteProCodigo());
                return produto.getProDescricao();
            }
            case VALOR:
                return itens.getIteValor();
            case QUANTIDADE:
                return itens.getIteQuantidade();
            default:
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    public Itens getItens(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void adiciona(Itens i) {
        linhas.add(i);
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    public Itens remove(int indice) {
        Itens itens = this.getItens(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return itens;
    }

    public void addListaDeUfs(List<Itens> itens) {
        int tamanhoAntigo = getRowCount();
        linhas.addAll(itens);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public void atualizar(int row, Itens itens) {
        linhas.set(row, itens);
        this.fireTableRowsUpdated(row, row);
    }
}
