package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.entities.PagoPrestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoPrestamoRepository extends JpaRepository<PagoPrestamo, Long> {
}
