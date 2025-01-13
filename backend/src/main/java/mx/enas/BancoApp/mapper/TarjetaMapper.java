package mx.enas.BancoApp.mapper;

import mx.enas.BancoApp.model.dto.TarjetaDTO;
import mx.enas.BancoApp.model.entities.Tarjeta;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarjetaMapper {
    TarjetaDTO toDTO(Tarjeta tarjeta);
    Tarjeta toEntity(TarjetaDTO tarjetaDTO);
    List<TarjetaDTO> toDTOList(List<Tarjeta> tarjetas);
}
