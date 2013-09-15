package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luxu
 */
public abstract class GenericDao {
    
    private Connection connection;
    private String erro = "";
    
    protected GenericDao() {
        this.connection = ConnectionDataBase.getConnection();
    }
    protected Connection getConnection() {
        return connection;
    }
    protected void save(String insertSql, Object... parametros) throws
            SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(insertSql);
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        pstmt.execute();
        pstmt.close();
    }
    protected void update(String updateSql, Object id, Object... parametros) throws SQLException{
        PreparedStatement pstmt = getConnection().prepareStatement(updateSql);
            for (int i = 0; i < parametros.length; i++) {
                pstmt.setObject(i + 1, parametros[i]);
            }
            pstmt.setObject(parametros.length + 1, id);
            pstmt.execute();
            pstmt.close();
    }

    protected void delete(String deleteSql, Object... parametros) throws
            SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(deleteSql);
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        pstmt.execute();
        pstmt.close();
    }
    
    public int getMaxPK(String tabela, String chave) {
        String sql = "select max(" + chave + ") from " + tabela;
        int max = 0;
        ResultSet rs = null;
        try {
            Statement statement = getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rs = statement.executeQuery(sql);

            if (rs.next()) {
                max = rs.getInt(1);
            }
            statement.close();
        } catch (SQLException sqlex) {
            erro = "Erro: " + sqlex.toString();
            return -1;
        }

        return max;
    }
}
