package mx.enas.BancoApp.services.impl;

import mx.enas.BancoApp.mapper.ClienteMapper;
import mx.enas.BancoApp.model.dto.ClienteDTO;
import mx.enas.BancoApp.model.entities.Cliente;
import mx.enas.BancoApp.repositories.ClienteRepository;
import mx.enas.BancoApp.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    //repositorio
    @Autowired
    private ClienteRepository clienteRepository;
    //mapper
    @Autowired
    private ClienteMapper clienteMapper;

    //metodos sobrescritos
    @Override
    public List<ClienteDTO> getAllClientes(){
        return clienteMapper.toDTOList(clienteRepository.findAll());
    }

    @Override
    public Optional<ClienteDTO> getClienteById(Long id) {
        return clienteRepository.findById(id).map(clienteMapper::toDTO);
    }

    @Override
    public ClienteDTO saveCliente(ClienteDTO clienteDTO) throws IllegalArgumentException {
        if (clienteRepository.findByCorreo(clienteDTO.getCorreo()) != null) {
            throw new IllegalArgumentException();
        }
        Cliente entity=clienteMapper.toEntity(clienteDTO);
        return clienteMapper.toDTO(clienteRepository.save(entity));
    }

    @Override
    public void deleteClienteById(Long id){
        clienteRepository.deleteById(id);
    }

    @Override
    public ClienteDTO findByCorreo(String correo){
        return clienteMapper.toDTO(clienteRepository.findByCorreo(correo));
    }
}
