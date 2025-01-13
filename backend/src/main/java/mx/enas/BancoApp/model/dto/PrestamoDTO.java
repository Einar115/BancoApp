package mx.enas.BancoApp.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PrestamoDTO {
    private Long id;
    private BigDecimal monto;
    private BigDecimal tasa_interes;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private String estado;
    private Long clienteId;

    public PrestamoDTO(Long id, BigDecimal monto, BigDecimal tasa_interes, LocalDate fechaInicio, LocalDate fechaVencimiento, String estado, Long clienteId) {
        this.id = id;
        this.monto = monto;
        this.tasa_interes = tasa_interes;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
        this.clienteId = clienteId;
    }

    public PrestamoDTO() {
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

    public BigDecimal getTasa_interes() {
        return tasa_interes;
    }

    public void setTasa_interes(BigDecimal tasa_interes) {
        this.tasa_interes = tasa_interes;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "PrestamoDTO{" +
                "id=" + id +
                ", monto=" + monto +
                ", tasa_interes=" + tasa_interes +
                ", fechaInicio=" + fechaInicio +
                ", fechaVencimiento=" + fechaVencimiento +
                ", estado='" + estado + '\'' +
                ", clienteId=" + clienteId +
                '}';
    }
}
