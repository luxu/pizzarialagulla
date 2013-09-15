package boteko;

import DAO.Conexao;

public class Gamb {

    static Conexao con;

    /**
     *
     */
    public Gamb() {
        con = new Conexao();
    }

    static public Conexao getConexao() {
        return con;
    }
}
