package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luxu
 */
public class ConnectionDataBase {

    private static final String URL = "jdbc:mysql://localhost:3306/boteko";//caminho
    private static final String DRIVER = "com.mysql.jdbc.Driver";//driver padrão do mysql arquivo .jar
    private static final String USER = "root"; //usuario
    private static final String PASS = "";//senha

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Falha ao ler o driver JDBC" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Impossivel conectar com a base de dados" + e.getMessage());
            throw new RuntimeException(e);
        }
        return null;
    }
}
