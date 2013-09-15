package classes;

/**
 *
 * @author luxu
 */
public class Pagamento {

    private Integer pagCodigo;
    private String pagPagamento;
    private String pagAtivo;

    public Integer getPagCodigo() {
        return pagCodigo;
    }

    public void setPagCodigo(Integer pagCodigo) {
        this.pagCodigo = pagCodigo;
    }

    public String getPagPagamento() {
        return pagPagamento;
    }

    public void setPagPagamento(String pagPagamento) {
        this.pagPagamento = pagPagamento;
    }

    public String getPagAtivo() {
        return pagAtivo;
    }

    public void setPagAtivo(String pagAtivo) {
        this.pagAtivo = pagAtivo;
    }
}
