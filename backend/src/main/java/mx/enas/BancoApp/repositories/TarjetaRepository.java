package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.model.entities.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {
    List<Tarjeta> findByCuentaId(Long cuentaId);
}
