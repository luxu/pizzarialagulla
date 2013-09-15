package classes;

/**
 *
 * @author luxu
 */
public class Usuario {

    private Integer usuCodigo;
    private String usuNome;
    private String usuLogin;
    private String usuSenha;
    private String usuPerfil;
    private String usuAtivo;

    public Integer getUsuCodigo() {
        return usuCodigo;
    }

    public void setUsuCodigo(Integer usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    public String getUsuPerfil() {
        return usuPerfil;
    }

    public void setUsuPerfil(String usuPerfil) {
        this.usuPerfil = usuPerfil;
    }

    public String getUsuAtivo() {
        return usuAtivo;
    }

    public void setUsuAtivo(String usuAtivo) {
        this.usuAtivo = usuAtivo;
    }
}
