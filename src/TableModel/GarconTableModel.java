package TableModel;

import classes.Garcon;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luxu
 */
public class GarconTableModel extends AbstractTableModel{
    
    // Lista de Sócios a serem exibidos na tabela
    private List<Garcon> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[] {"Código","Nome","Endereço","Telefone","Admissão","RG","CPF"};
    // Constantes representando o índice das colunas
    private static final int CODIGO = 0;
    private static final int NOME = 1;
    private static final int ENDERECO = 2;
    private static final int TELEFONE = 3;
    private static final int ADMISSAO = 4;
    private static final int RG = 5;
    private static final int CPF = 6;

    // Cria um SocioTableModel sem nenhuma linha
    public GarconTableModel(){
        linhas = new ArrayList<Garcon>();
    }
    
    // Cria um SocioTableModel contendo a lista recebida por parâmetro
    public GarconTableModel(List<Garcon> listaDeGarcons){
        linhas = new ArrayList<Garcon>(listaDeGarcons);
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
            case ENDERECO:
                return String.class;
            case TELEFONE:
                return String.class;
            case ADMISSAO:
                return Date.class;
            case RG:
                return String.class;
            case CPF:
                return String.class;
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
        Garcon garcon = linhas.get(rowIndex);
        
        switch(columnIndex){
            case CODIGO:
                return garcon.getGarCodigo();
            case NOME:
                return garcon.getGarNome();
            case ENDERECO:
                return garcon.getGarEndereco();
            case TELEFONE:
                return garcon.getGarTelefone();
            case ADMISSAO:
                return garcon.getGarDataAdmissao();
            case RG:
                return garcon.getGarRg();
            case CPF:
                return garcon.getGarCpf();
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex fora dos limites!");
        }
    }
}
