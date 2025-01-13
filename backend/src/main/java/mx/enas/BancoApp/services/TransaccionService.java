package mx.enas.BancoApp.services;

import mx.enas.BancoApp.model.dto.TransaccionDTO;

import java.util.List;

public interface TransaccionService {

    //metodos abstractos
    List<TransaccionDTO> getTransaccionesByCuentaId(Long cuentaId);

    TransaccionDTO saveTransaccion(TransaccionDTO transaccion);

}
