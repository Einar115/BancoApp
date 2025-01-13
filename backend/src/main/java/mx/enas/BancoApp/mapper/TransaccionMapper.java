package mx.enas.BancoApp.mapper;

import mx.enas.BancoApp.model.dto.TransaccionDTO;
import mx.enas.BancoApp.model.entities.Transaccion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransaccionMapper {
    TransaccionDTO toDTO(Transaccion transaccion);
    Transaccion toEntity(TransaccionDTO transaccionDTO);
    List<TransaccionDTO> toDTOList(List<Transaccion> transaccions);
}
