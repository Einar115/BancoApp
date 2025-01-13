package mx.enas.BancoApp.mapper;

import mx.enas.BancoApp.model.dto.PrestamoDTO;
import mx.enas.BancoApp.model.entities.Prestamo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PrestamoMapper {
    PrestamoDTO toDTO(Prestamo prestamo);
    Prestamo toEntity(PrestamoDTO prestamoDTO);
    List<PrestamoDTO> toDTOList(List<Prestamo> prestamos);
}
