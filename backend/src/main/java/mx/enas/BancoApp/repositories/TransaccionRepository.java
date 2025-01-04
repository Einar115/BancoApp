package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.entities.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
}
