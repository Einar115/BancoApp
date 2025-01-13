package mx.enas.BancoApp.services;

import mx.enas.BancoApp.model.dto.CuentaDTO;
import mx.enas.BancoApp.model.entities.Cuenta;

import java.util.List;

public interface CuentaService {

    //metodos abstractos
    List<CuentaDTO> getAllCuentasByClienteId(Long clienteId);

    CuentaDTO saveCuenta(CuentaDTO cuenta);

    void deleteCuenta(Long id);
}

