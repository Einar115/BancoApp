package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.model.entities.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    List<Prestamo> findByClienteId(Long clienteId);
}
