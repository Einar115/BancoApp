package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.entities.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {
}
