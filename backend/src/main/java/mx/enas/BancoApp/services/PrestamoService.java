package mx.enas.BancoApp.services;

import mx.enas.BancoApp.model.dto.PrestamoDTO;
import mx.enas.BancoApp.model.entities.Prestamo;

import java.util.List;

public interface PrestamoService {

    //metodos abstractos
    List<PrestamoDTO> getPrestamosByClienteId(Long clienteId);

}
