package classes;

import java.util.Date;

/**
 *
 * @author luxu
 */

public class Pedido {
    
    private Integer pedCodigo;
    private Integer cliCodigo;
    private Date pedDatahora;
    private Double pedValortotal;
    private Double pedDesconto;
    private Date pedEntrega;
    private String pedCancelado;
    private Double pedValorpago;
    private String pedFormapagamento;
    private String pedFechado;

    public Integer getPedCodigo() {
        return pedCodigo;
    }

    public void setPedCodigo(Integer pedCodigo) {
        this.pedCodigo = pedCodigo;
    }

    public Integer getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Date getPedDatahora() {
        return pedDatahora;
    }

    public void setPedDatahora(Date pedDatahora) {
        this.pedDatahora = pedDatahora;
    }

    public Double getPedValortotal() {
        return pedValortotal;
    }

    public void setPedValortotal(Double pedValortotal) {
        this.pedValortotal = pedValortotal;
    }

    public Double getPedDesconto() {
        return pedDesconto;
    }

    public void setPedDesconto(Double pedDesconto) {
        this.pedDesconto = pedDesconto;
    }

    public Date getPedEntrega() {
        return pedEntrega;
    }

    public void setPedEntrega(Date pedEntrega) {
        this.pedEntrega = pedEntrega;
    }

    public String getPedCancelado() {
        return pedCancelado;
    }

    public void setPedCancelado(String pedCancelado) {
        this.pedCancelado = pedCancelado;
    }

    public Double getPedValorpago() {
        return pedValorpago;
    }

    public void setPedValorpago(Double pedValorpago) {
        this.pedValorpago = pedValorpago;
    }

    public String getPedFormapagamento() {
        return pedFormapagamento;
    }

    public void setPedFormapagamento(String pedFormapagamento) {
        this.pedFormapagamento = pedFormapagamento;
    }

    public String getPedFechado() {
        return pedFechado;
    }

    public void setPedFechado(String pedFechado) {
        this.pedFechado = pedFechado;
    }
}
