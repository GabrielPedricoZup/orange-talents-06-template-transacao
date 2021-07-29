package gabrielpedrico.transacao.repositories;

import gabrielpedrico.transacao.models.Compra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra,Long> {
    Page<Compra> findAllByIdCartao(String id, Pageable pageable);
}
