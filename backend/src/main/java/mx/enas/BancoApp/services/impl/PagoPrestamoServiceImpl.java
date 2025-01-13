package mx.enas.BancoApp.services.impl;

import mx.enas.BancoApp.model.dto.PagoPrestamoDTO;
import mx.enas.BancoApp.model.entities.PagoPrestamo;
import mx.enas.BancoApp.repositories.PagoPrestamoRepository;
import mx.enas.BancoApp.services.PagoPrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoPrestamoServiceImpl implements PagoPrestamoService {
    @Override
    public List<PagoPrestamoDTO> getPagoPrestamoByPrestamoId(Long prestamoId) {
        return List.of();
    }

    @Override
    public PagoPrestamoDTO savePagoPrestamo(PagoPrestamoDTO pagoPrestamo) {
        return null;
    }

    @Override
    public void deletePagoPrestamo(Long id) {

    }
}
