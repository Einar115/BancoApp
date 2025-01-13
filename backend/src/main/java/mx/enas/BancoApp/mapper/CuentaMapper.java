package mx.enas.BancoApp.mapper;

import mx.enas.BancoApp.model.dto.CuentaDTO;
import mx.enas.BancoApp.model.entities.Cuenta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CuentaMapper {
    CuentaDTO toDTO(Cuenta cuenta);
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "estado", ignore = true)
    Cuenta toEntity(CuentaDTO cuentaDTO);
    List<CuentaDTO> toDTOList(List<Cuenta> cuentas);
}
