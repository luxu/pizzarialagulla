package TableModel;

import classes.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luxu
 */
public class ProdutoTableModel extends AbstractTableModel {

    private List<Produto> linhas;
    private String[] colunas = new String[]{"Código", "Descrição", "Preço Venda"};
    private static final int CODIGO = 0;
    private static final int DESCRICAO = 1;
    private static final int PRECOVENDA = 2;

    public ProdutoTableModel() {
        linhas = new ArrayList<Produto>();
    }

    public ProdutoTableModel(List<Produto> listaDeProdutos) {
        linhas = new ArrayList<Produto>(listaDeProdutos);
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
            case DESCRICAO:
                return String.class;
            case PRECOVENDA:
                return Double.class;
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
        Produto produto = linhas.get(rowIndex);

        switch (columnIndex) {
            case CODIGO:
                return produto.getProCodigo();
            case DESCRICAO:
                return produto.getProDescricao();
            case PRECOVENDA:
                return produto.getProPrecoVenda();
            default:
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    public Produto getProduto(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void adiciona(Produto c) {
        linhas.add(c);
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    public Produto remove(int indice) {
        Produto produto = this.getProduto(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return produto;
    }

    public void addListaDeUfs(List<Produto> produtos) {
        int tamanhoAntigo = getRowCount();
        linhas.addAll(produtos);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public void atualizar(int row, Produto produto) {
        linhas.set(row, produto);
        this.fireTableRowsUpdated(row, row);
    }
}
