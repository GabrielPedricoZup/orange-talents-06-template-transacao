package gabrielpedrico.transacao.dtos;

import gabrielpedrico.transacao.models.Compra;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class TransacaoResponse {

    private String id;
    private BigDecimal valor;
    private Map<String, String> estabelecimento;
    private Map<String, String> cartao;
    private LocalDateTime efetivadaEm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Map<String, String> getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Map<String, String> estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Map<String, String> getCartao() {
        return cartao;
    }

    public void setCartao(Map<String, String> cartao) {
        this.cartao = cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public void setEfetivadaEm(LocalDateTime efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }

    @Override
    public String toString() {
        return "TransacaoRequest{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }

    public Compra conversor(){
        return new Compra(this.valor,this.id,this.efetivadaEm);
    }
}
