package mx.enas.BancoApp.services;

import mx.enas.BancoApp.model.dto.PagoPrestamoDTO;
import mx.enas.BancoApp.model.entities.PagoPrestamo;

import java.util.List;

public interface PagoPrestamoService {

    //metodos abstractos
    List<PagoPrestamoDTO> getPagoPrestamoByPrestamoId(Long prestamoId);

    PagoPrestamoDTO savePagoPrestamo(PagoPrestamoDTO pagoPrestamo);

    void deletePagoPrestamo(Long id);

}
