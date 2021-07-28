package gabrielpedrico.transacao.listeners;

import gabrielpedrico.transacao.dtos.TransacaoResponse;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoResponse eventoDeTransacao) {
        System.out.println(eventoDeTransacao);
    }

}
