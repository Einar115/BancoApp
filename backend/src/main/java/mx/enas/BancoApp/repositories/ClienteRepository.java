package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.model.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByCorreo(String correo);
}
