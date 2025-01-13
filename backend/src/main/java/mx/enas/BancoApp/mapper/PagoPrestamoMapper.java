package mx.enas.BancoApp.mapper;

import mx.enas.BancoApp.model.dto.PagoPrestamoDTO;
import mx.enas.BancoApp.model.entities.PagoPrestamo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "string")
public interface PagoPrestamoMapper {
    PagoPrestamoDTO toDTO(PagoPrestamo pagoPrestamo);
    PagoPrestamo toEntity(PagoPrestamoDTO pagoPrestamoDTO);
    List<PagoPrestamoDTO> toDTOList(List<PagoPrestamo> pagoPrestamos);
}
