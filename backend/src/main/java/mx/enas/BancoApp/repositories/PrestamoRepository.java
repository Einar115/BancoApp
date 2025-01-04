package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.entities.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
