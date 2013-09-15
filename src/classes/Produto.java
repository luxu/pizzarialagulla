package classes;

/**
 *
 * @author luxu
 */
public class Produto {

    private Integer proCodigo;
    private String proDescricao;
    private Double proPrecoVenda;
    private String proUnidade;

    public Integer getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProDescricao() {
        return proDescricao;
    }

    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    public Double getProPrecoVenda() {
        return proPrecoVenda;
    }

    public void setProPrecoVenda(Double proPrecoVenda) {
        this.proPrecoVenda = proPrecoVenda;
    }

    public String getProUnidade() {
        return proUnidade;
    }

    public void setProUnidade(String proUnidade) {
        this.proUnidade = proUnidade;
    }
}
