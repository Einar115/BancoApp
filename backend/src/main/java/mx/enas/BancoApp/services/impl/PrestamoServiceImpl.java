package mx.enas.BancoApp.services.impl;

import mx.enas.BancoApp.model.dto.PrestamoDTO;
import mx.enas.BancoApp.model.entities.Prestamo;
import mx.enas.BancoApp.repositories.PrestamoRepository;
import mx.enas.BancoApp.services.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoServiceImpl implements PrestamoService {

    @Override
    public List<PrestamoDTO> getPrestamosByClienteId(Long clienteId) {
        return List.of();
    }
}
