package mx.enas.BancoApp.services.impl;

import mx.enas.BancoApp.model.dto.TarjetaDTO;
import mx.enas.BancoApp.model.entities.Tarjeta;
import mx.enas.BancoApp.repositories.TarjetaRepository;
import mx.enas.BancoApp.services.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaServiceImpl implements TarjetaService {

    @Override
    public List<TarjetaDTO> getTarjetasByCuentaId(Long cuentaId) {
        return List.of();
    }

    @Override
    public TarjetaDTO saveTarjeta(TarjetaDTO tarjeta) {
        return null;
    }
}
