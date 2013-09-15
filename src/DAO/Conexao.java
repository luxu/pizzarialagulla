package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    private Connection connect;
    private String erro = "";

    public Conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/boteko";
            connect = DriverManager.getConnection(url, "root", "iu00q71o");
        } catch (ClassNotFoundException cnfex) {
            erro = "Falha ao ler o driver JDBC" + cnfex.toString();
            System.out.println(erro);
        } catch (SQLException sqlex) {
            erro = "Impossivel conectar com a base de dados" + sqlex.toString();
            System.out.println(erro);
        } catch (Exception ex) {
            erro = "Outro erro" + ex.toString();
            System.out.println(erro);
        }
    }

    public String getMensagemErro() {
        return erro;
    }

    public boolean getEstadoConexao() {
        if (connect == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean manipular(String sql) // inserir, alterar,excluir
    {
        try {
            Statement statement = connect.createStatement();
            int result = statement.executeUpdate(sql);
            statement.close();
            if (result >= 1) {
                return true;
            }
        } catch (SQLException sqlex) {
            erro = "Erro: " + sqlex.toString();
            return false;
        }
        return false;
    }

    public ResultSet consultar(String sql) {
        ResultSet rs = null;
        try {
            Statement statement = connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rs = statement.executeQuery(sql);
            statement.close();
            rs.close();
        } catch (SQLException sqlex) {
            erro = "Erro: " + sqlex.toString();
            return null;
        }
        return rs;
    }
}
