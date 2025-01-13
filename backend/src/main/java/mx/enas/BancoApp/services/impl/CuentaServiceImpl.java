package mx.enas.BancoApp.services.impl;

import mx.enas.BancoApp.mapper.CuentaMapper;
import mx.enas.BancoApp.model.dto.CuentaDTO;
import mx.enas.BancoApp.model.entities.Cuenta;
import mx.enas.BancoApp.repositories.CuentaRepository;
import mx.enas.BancoApp.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceImpl implements CuentaService {
    //Repositorio
    @Autowired
    private CuentaRepository cuentaRepository;

    //Mapper
    @Autowired
    private CuentaMapper cuentaMapper;

    //Metodos
    @Override
    public List<CuentaDTO> getAllCuentasByClienteId(Long clienteId) {
        return cuentaMapper.toDTOList(cuentaRepository.findByClienteId(clienteId));
    }

    @Override
    public CuentaDTO saveCuenta(CuentaDTO cuentaDTO) {
        Cuenta entity = cuentaMapper.toEntity(cuentaDTO);
        return cuentaMapper.toDTO(cuentaRepository.save(entity));
    }

    @Override
    public void deleteCuenta(Long id) {
        cuentaRepository.deleteById(id);
    }
}
