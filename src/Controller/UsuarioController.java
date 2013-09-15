package Controller;

import DAO.UsuarioDao;
import classes.Usuario;
import java.util.List;

/**
 *
 * @author luxu
 */
public class UsuarioController {

    public Integer salvar(String nome, String login, String senha, String perfil, String ativo) {
        Usuario usuario = new Usuario();
        usuario.setUsuNome(nome);
        usuario.setUsuLogin(login);
        usuario.setUsuSenha(senha);
        usuario.setUsuPerfil(perfil);
        usuario.setUsuAtivo(ativo);
        if (new UsuarioDao().salvar(usuario)==1)
            return 1;
        return 0;
    }

    public Integer alterar(Integer id, String nome, String login, String senha, String perfil, String ativo){
        Usuario usuario = new Usuario();
        usuario.setUsuCodigo(id);
        usuario.setUsuNome(nome);
        usuario.setUsuLogin(login);
        usuario.setUsuSenha(senha);
        usuario.setUsuPerfil(perfil);
        usuario.setUsuAtivo(ativo);
        if (new UsuarioDao().alterar(usuario)==1)
            return 1;
        return 0;
    }

    public Integer excluir(int id){
        if (new UsuarioDao().excluir(id)==1)
            return 1;
        return 0;
    }
    
    public List<Usuario> listaUsuarios() {
        return new UsuarioDao().findUsers();
    }

    public int ultimoID(String tabela, String chave){
        return new UsuarioDao().getMaxPK(tabela,chave);
    }
    
    public List<Usuario> buscaUsuarioPorNome(String nome){
        return new UsuarioDao().findUserByName(nome);
    }

    public Usuario buscaUsuarioPorCodigo(Integer cli_codigo){
        return new UsuarioDao().findByCodigo(cli_codigo);
    }

    public Usuario buscaUsuarioPorLoginSenha(String nome, String senha) {
        return new UsuarioDao().findUserByLoginAndPassword(nome, senha);
    }
    
    public String criptografarSenha(String original){
        return new UsuarioDao().criptografia(original);
    }
}
