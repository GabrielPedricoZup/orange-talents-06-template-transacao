package gabrielpedrico.transacao.dtos;

import gabrielpedrico.transacao.models.Compra;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CompraResponse {

    private BigDecimal valor;
    private LocalDateTime dataCompra;

    public CompraResponse(Compra compra) {
        this.valor = compra.getValor();
        this.dataCompra = compra.getEfetivadaEm();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public static Page<CompraResponse> convert(Page<Compra> compras) {
        return compras.map(CompraResponse::new);
    }
}
