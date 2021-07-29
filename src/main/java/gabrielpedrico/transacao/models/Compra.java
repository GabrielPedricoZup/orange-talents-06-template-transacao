package gabrielpedrico.transacao.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;

    private String idCartao;

    private LocalDateTime efetivadaEm;

    public Compra(BigDecimal valor, String idCartao, LocalDateTime efetivadaEm) {
        this.valor = valor;
        this.idCartao = idCartao;
        this.efetivadaEm = efetivadaEm;
    }

    @Deprecated
    public Compra(){
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
