package mx.enas.BancoApp.repositories;

import mx.enas.BancoApp.entities.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}
