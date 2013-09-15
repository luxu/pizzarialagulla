package TableModel;

import classes.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luxu
 */
public class UsuarioTableModel extends AbstractTableModel {

    // Lista de Sócios a serem exibidos na tabela
    private List<Usuario> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código","Nome","Login","Perfil","Ativo"};
    // Constantes representando o índice das colunas
    private static final int CODIGO = 0;
    private static final int NOME = 1;
    private static final int LOGIN = 2;
    private static final int PERFIL = 3;
    private static final int ATIVO = 4;

    // Cria um UsuarioTableModel sem nenhuma linha
    public UsuarioTableModel() {
        linhas = new ArrayList<Usuario>();
    }

    // Cria um UsuarioTableModel contendo a lista recebida por parâmetro
    public UsuarioTableModel(List<Usuario> listaDeUsuarios) {
        linhas = new ArrayList<Usuario>(listaDeUsuarios);
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
            case NOME:
                return String.class;
            case LOGIN:
                return String.class;
            case PERFIL:
                return String.class;
            case ATIVO:
                return String.class;
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
        Usuario usuario = linhas.get(rowIndex);

        switch (columnIndex) {
            case CODIGO:
                return usuario.getUsuCodigo();
            case NOME:
                return usuario.getUsuNome();
            case LOGIN:
                return usuario.getUsuLogin();
            case PERFIL:
                return usuario.getUsuPerfil();
            case ATIVO:
                return usuario.getUsuAtivo().equals("s")?"Sim":"Não";
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    /* MÉTODOS NOVOS IMPLEMENTADOS PARA SEREM USADOS SE PRECISAR */
    /* Retorna a empresa da linha especificada. */
    public Usuario getUsuario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    /**
     * Adiciona um novo {@link Cliente} e notifica os listeners que um novo
     * registro foi adicionado.
     */
    public void adiciona(Usuario c) {
        linhas.add(c);
        
        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    /**
     * Similar ao {@link #adiciona(Cliente)}, por�m para remover. Recebe o
     * �ndice do cliente a ser removido. Se n�o souber o �ndice, use o m�todo
     * {@link #getIndice(Cliente)} antes.
     */
    public Usuario remove(int indice) {
        Usuario usuario = this.getUsuario(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return usuario;
    }

    /* Adiciona uma lista de sócios ao final dos registros. */
    public void addListaDeUfs(List<Usuario> usuarios) {
        // Pega o tamanho antigo da tabela.  
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.  
        linhas.addAll(usuarios);

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

    public void atualizar(int row, Usuario usuario) {
        linhas.set(row, usuario);
        this.fireTableRowsUpdated(row, row);
    }
}
