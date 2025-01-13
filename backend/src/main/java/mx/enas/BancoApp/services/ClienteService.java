package mx.enas.BancoApp.services;

import mx.enas.BancoApp.model.dto.ClienteDTO;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    //metodos abstractos
    List<ClienteDTO> getAllClientes();

    Optional<ClienteDTO> getClienteById(Long id);

    ClienteDTO saveCliente(ClienteDTO cliente);

    void deleteClienteById(Long id);

    ClienteDTO findByCorreo(String correo);

}
