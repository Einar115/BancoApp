package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
