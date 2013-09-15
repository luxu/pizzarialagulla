package DAO;

import classes.Usuario;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luxu
 */
public class UsuarioDao extends GenericDao {

    public Integer salvar(Usuario usuario) {
        String insert = "INSERT INTO usuario(usu_nome,usu_login,usu_senha,usu_perfil,usu_ativo) VALUES(?,?,?,?,?)";
        try {
            save(insert, usuario.getUsuNome(), usuario.getUsuLogin(), this.criptografia(usuario.getUsuSenha()), 
                    usuario.getUsuPerfil(), usuario.getUsuAtivo());
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public Integer alterar(Usuario usuario) {
        String update = "UPDATE usuario SET usu_nome = ?, usu_login = ?, usu_senha = ?, usu_perfil = ?, usu_ativo = ? WHERE usu_codigo = ?";
        try {
            update(update, usuario.getUsuCodigo(), usuario.getUsuNome(), usuario.getUsuLogin(), 
                    this.criptografia(usuario.getUsuSenha()), usuario.getUsuPerfil(), usuario.getUsuAtivo());
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro= "+ex.getMessage()+"\n"+usuario.getUsuAtivo());
            return 0;
        }
    }

    public Integer excluir(int id) {
        String delete = "DELETE FROM usuario WHERE usu_codigo = ?";
        try {
            delete(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    @Override
    public int getMaxPK(String tabela, String chave) {
        String sql = "select max(" + chave + ") from " + tabela;
        String erro = "";
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

    public List<Usuario> findUsers() {
        List<Usuario> usuarios = new ArrayList<>();
        String select = "SELECT * FROM usuario";
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setUsuCodigo(rs.getInt("usu_codigo"));
                usuario.setUsuNome(rs.getString("usu_nome"));
                usuario.setUsuLogin(rs.getString("usu_login"));
                usuario.setUsuSenha(rs.getString("usu_senha"));
                usuario.setUsuPerfil(rs.getString("usu_perfil"));
                usuario.setUsuAtivo(rs.getString("usu_ativo"));
                usuarios.add(usuario);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    public List<Usuario> findUserByName(String nome) {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        String select = "SELECT * FROM Usuario WHERE usu_nome like '%" + nome + "%'";
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setUsuCodigo(rs.getInt("usu_codigo"));
                usuario.setUsuNome(rs.getString("usu_nome"));
                usuario.setUsuLogin(rs.getString("usu_login"));
                usuario.setUsuSenha(rs.getString("usu_senha"));
                usuario.setUsuPerfil(rs.getString("usu_perfil"));
                usuario.setUsuAtivo(rs.getString("usu_ativo"));
                usuarios.add(usuario);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuarios;
    }

    public Usuario findUserByLoginAndPassword(String login, String senha) {
        String select = "SELECT * FROM Usuario WHERE usu_login = ? AND usu_senha = ?";
        Usuario usuario = null;
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setUsuCodigo(rs.getInt("usu_codigo"));
                usuario.setUsuNome(rs.getString("usu_nome"));
                usuario.setUsuLogin(rs.getString("usu_login"));
                usuario.setUsuSenha(rs.getString("usu_senha"));
                usuario.setUsuPerfil(rs.getString("usu_perfil"));
                usuario.setUsuAtivo(rs.getString("usu_ativo"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

    public Usuario findByCodigo(Integer usu_codigo) {
        String select = "SELECT * FROM usuario WHERE usu_codigo = ?";
        Usuario usuario = null;
        PreparedStatement stmt;
        try {
            stmt = getConnection().prepareStatement(select);
            stmt.setInt(1, usu_codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setUsuCodigo(rs.getInt("usu_codigo"));
                usuario.setUsuNome(rs.getString("usu_nome"));
                usuario.setUsuLogin(rs.getString("usu_login"));
                usuario.setUsuSenha(rs.getString("usu_senha"));
                usuario.setUsuPerfil(rs.getString("usu_perfil"));
                usuario.setUsuAtivo(rs.getString("usu_ativo"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

    public String criptografia(String original) {
        String senha = null;
        MessageDigest algoritmo;
        byte messageDigest[];
        StringBuilder hexString;
        try {
            //algoritmo =MessageDigest.getInstance("SHA-256");// 64 letras
            algoritmo = MessageDigest.getInstance("MD5");  // 32 letras
            messageDigest = algoritmo.digest(original.getBytes("UTF-8"));
            hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            senha = hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        System.out.println("Senha normal: " + original + " - Senha criptografada: " + senha);
        return senha;
    }
}
