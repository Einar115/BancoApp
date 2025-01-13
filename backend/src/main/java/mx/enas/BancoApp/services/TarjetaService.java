package mx.enas.BancoApp.services;

import mx.enas.BancoApp.model.dto.TarjetaDTO;
import mx.enas.BancoApp.model.entities.Tarjeta;

import java.util.List;

public interface TarjetaService {

    //metodos abstractos
    List<TarjetaDTO> getTarjetasByCuentaId(Long cuentaId);

    TarjetaDTO saveTarjeta(TarjetaDTO tarjeta);

}
