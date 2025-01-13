package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.model.entities.PagoPrestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagoPrestamoRepository extends JpaRepository<PagoPrestamo, Long> {
    List<PagoPrestamo> findByPrestamoId(Long prestamoid);
}
