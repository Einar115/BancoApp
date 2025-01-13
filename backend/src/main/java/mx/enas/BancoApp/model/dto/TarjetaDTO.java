package mx.enas.BancoApp.model.dto;

import java.time.LocalDate;

public class TarjetaDTO {
    private Long id;
    private String numero_tarjeta;
    private LocalDate fecha_expiracion;
    private String cvv;
    private String tipo;
    private Long cuentaId;

    public TarjetaDTO(Long id, String numero_tarjeta, LocalDate fecha_expiracion, String cvv, String tipo, Long cuentaId) {
        this.id = id;
        this.numero_tarjeta = numero_tarjeta;
        this.fecha_expiracion = fecha_expiracion;
        this.cvv = cvv;
        this.tipo = tipo;
        this.cuentaId = cuentaId;
    }

    public TarjetaDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public LocalDate getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(LocalDate fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(Long cuentaId) {
        this.cuentaId = cuentaId;
    }

    @Override
    public String toString() {
        return "TarjetaDTO{" +
                "id=" + id +
                ", numero_tarjeta='" + numero_tarjeta + '\'' +
                ", fecha_expiracion=" + fecha_expiracion +
                ", cvv='" + cvv + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cuentaId=" + cuentaId +
                '}';
    }
}
