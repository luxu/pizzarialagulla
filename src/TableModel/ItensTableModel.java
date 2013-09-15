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

    // Lista de Sócios a serem exibidos na tabela
    private List<Itens> linhas;
    // Array com os nomes das colunas.
//    private String[] colunas = new String[]{"Cód", "Prod", "Ped", "Vlr", "Qtd"};
    private String[] colunas = new String[]{"Prod", "Vlr", "Qtd"};
    // Constantes representando o índice das colunas
//    private static final int CODIGO = 0;
    private static final int PRODUTO = 0;
//    private static final int PEDIDO = 2;
    private static final int VALOR = 1;
    private static final int QUANTIDADE = 2;

    // Cria um SocioTableModel sem nenhuma linha
    public ItensTableModel() {
        linhas = new ArrayList<>();
    }

    // Cria um ItensTableModel contendo a lista recebida por parâmetro
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
//            case CODIGO:
//                return Integer.class;
            case PRODUTO:
                return String.class;
//            case PEDIDO:
//                return Integer.class;
            case VALOR:
                return Double.class;
            case QUANTIDADE:
                return Integer.class;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Itens itens = linhas.get(rowIndex);

        switch (columnIndex) {
//            case CODIGO:
//                return itens.getIteCodigo();
            case PRODUTO:{
                ProdutoController controller = new ProdutoController();
                Produto produto = new Produto();
                produto = controller.buscaProdutoPorDescricao(itens.getIteProCodigo());
                return produto.getProDescricao();
//                itens.getIteProCodigo();
            }
//            case PEDIDO:
//                return itens.getItePedCodigo();
            case VALOR:
                return itens.getIteValor();
            case QUANTIDADE:
                return itens.getIteQuantidade();
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
    public Itens getItens(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    /**
     * Adiciona um novo {@link Cliente} e notifica os listeners que um novo
     * registro foi adicionado.
     */
    public void adiciona(Itens i) {
        linhas.add(i);

        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    /**
     * Similar ao {@link #adiciona(Cliente)}, porém para remover. Recebe o
     * índice do cliente a ser removido. Se não souber o índice, use o método
     * {@link #getIndice(Cliente)} antes.
     */
    public Itens remove(int indice) {
        Itens itens = this.getItens(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return itens;
    }

    /* Adiciona uma lista de sócios ao final dos registros. */
    public void addListaDeUfs(List<Itens> itens) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        linhas.addAll(itens);

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

    public void atualizar(int row, Itens itens) {
        linhas.set(row, itens);
        this.fireTableRowsUpdated(row, row);
    }
}
