package mx.enas.BancoApp.model.dto;

import mx.enas.BancoApp.model.entities.Cuenta;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransaccionDTO {
    private Long id;
    private BigDecimal monto;
    private LocalDateTime fecha;
    private String tipo;
    private String descripcion;
    private Cuenta cuenta;

    public TransaccionDTO(Long id, BigDecimal monto, LocalDateTime fecha, String tipo, String descripcion, Cuenta cuenta) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.cuenta = cuenta;
    }

    public TransaccionDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "TransaccionDTO{" +
                "id=" + id +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cuenta=" + cuenta +
                '}';
    }
}
