package mx.enas.BancoApp.services.impl;

import mx.enas.BancoApp.model.dto.TransaccionDTO;
import mx.enas.BancoApp.model.entities.Transaccion;
import mx.enas.BancoApp.repositories.TransaccionRepository;
import mx.enas.BancoApp.services.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionServiceImpl implements TransaccionService {
    @Override
    public List<TransaccionDTO> getTransaccionesByCuentaId(Long cuentaId) {
        return List.of();
    }

    @Override
    public TransaccionDTO saveTransaccion(TransaccionDTO transaccion) {
        return null;
    }
}
