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

    private List<Usuario> linhas;
    private String[] colunas = new String[]{"Código","Nome","Login","Perfil","Ativo"};
    private static final int CODIGO = 0;
    private static final int NOME = 1;
    private static final int LOGIN = 2;
    private static final int PERFIL = 3;
    private static final int ATIVO = 4;

    public UsuarioTableModel() {
        linhas = new ArrayList<Usuario>();
    }

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
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
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
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }

    public Usuario getUsuario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void adiciona(Usuario c) {
        linhas.add(c);
        fireTableRowsInserted(linhas.size() - 1, linhas.size() - 1);
    }

    public Usuario remove(int indice) {
        Usuario usuario = this.getUsuario(indice);
        linhas.remove(indice);
        fireTableRowsDeleted(indice, indice);
        return usuario;
    }

    public void addListaDeUfs(List<Usuario> usuarios) {
        int tamanhoAntigo = getRowCount();
        linhas.addAll(usuarios);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.isEmpty();
    }

    public void atualizar(int row, Usuario usuario) {
        linhas.set(row, usuario);
        this.fireTableRowsUpdated(row, row);
    }
}
