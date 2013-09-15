package classes;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author luxu
 */
public class Controle {

    private Integer conCodigo;
    private Date conData;
    private Double condespesasDoDia;
    private BigDecimal contotalVendasDia;
    private Double convendasCartaoDia;
    private Double convendasDinheiroDia;
    private Integer contotalPizzaVendidaDia;
    private Integer contotalPizzaEntregueDia;
    private Double convalorNotaFiscal;

    public Integer getConCodigo() {
        return conCodigo;
    }

    public void setConCodigo(Integer conCodigo) {
        this.conCodigo = conCodigo;
    }

    public Date getConData() {
        return conData;
    }

    public void setConData(Date conData) {
        this.conData = conData;
    }

    public Double getCondespesasDoDia() {
        return condespesasDoDia;
    }

    public void setCondespesasDoDia(Double condespesasDoDia) {
        this.condespesasDoDia = condespesasDoDia;
    }

    public BigDecimal getContotalVendasDia() {
        return contotalVendasDia;
    }

    public void setContotalVendasDia(BigDecimal contotalVendasDia) {
        this.contotalVendasDia = contotalVendasDia;
    }

    public Double getConvendasCartaoDia() {
        return convendasCartaoDia;
    }

    public void setConvendasCartaoDia(Double convendasCartaoDia) {
        this.convendasCartaoDia = convendasCartaoDia;
    }

    public Double getConvendasDinheiroDia() {
        return convendasDinheiroDia;
    }

    public void setConvendasDinheiroDia(Double convendasDinheiroDia) {
        this.convendasDinheiroDia = convendasDinheiroDia;
    }

    public Integer getContotalPizzaVendidaDia() {
        return contotalPizzaVendidaDia;
    }

    public void setContotalPizzaVendidaDia(Integer contotalPizzaVendidaDia) {
        this.contotalPizzaVendidaDia = contotalPizzaVendidaDia;
    }

    public Integer getContotalPizzaEntregueDia() {
        return contotalPizzaEntregueDia;
    }

    public void setContotalPizzaEntregueDia(Integer contotalPizzaEntregueDia) {
        this.contotalPizzaEntregueDia = contotalPizzaEntregueDia;
    }

    public Double getConvalorNotaFiscal() {
        return convalorNotaFiscal;
    }

    public void setConvalorNotaFiscal(Double convalorNotaFiscal) {
        this.convalorNotaFiscal = convalorNotaFiscal;
    }
}
