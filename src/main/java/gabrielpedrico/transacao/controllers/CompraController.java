package gabrielpedrico.transacao.controllers;

import gabrielpedrico.transacao.dtos.CompraResponse;
import gabrielpedrico.transacao.models.Compra;
import gabrielpedrico.transacao.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CompraController {

    @Autowired
    CompraRepository compraRepository;

    @GetMapping("/cartao/{id}/compras")
    ResponseEntity<?> buscaCompras(@PathVariable String id,@PageableDefault(sort = "efetivadaEm", direction = Sort.Direction.DESC) Pageable pageable){

        Page<Compra> compras = compraRepository.findAllByIdCartao(id, pageable);

        if (compras.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("mensagem", "Cartão sem transação ou inexistente"));

        return ResponseEntity.ok().body(CompraResponse.convert(compras));
    }
}
