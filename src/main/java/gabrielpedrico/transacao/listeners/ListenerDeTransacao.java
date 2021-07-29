package gabrielpedrico.transacao.listeners;

import gabrielpedrico.transacao.dtos.TransacaoResponse;
import gabrielpedrico.transacao.models.Compra;
import gabrielpedrico.transacao.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    CompraRepository compraRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoResponse eventoDeTransacao) {

        System.out.println(eventoDeTransacao);

        Compra compra = eventoDeTransacao.conversor();

        compraRepository.save(compra);
    }

}
