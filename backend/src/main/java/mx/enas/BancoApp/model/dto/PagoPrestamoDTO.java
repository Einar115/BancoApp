package mx.enas.BancoApp.model.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PagoPrestamoDTO {
    private Long id;
    private BigDecimal monto;
    private LocalDateTime fecha;
    private Long prestamId;

    public PagoPrestamoDTO(Long id, BigDecimal monto, LocalDateTime fecha, Long prestamId) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.prestamId = prestamId;
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

    public Long getPrestamId() {
        return prestamId;
    }

    public void setPrestamId(Long prestamId) {
        this.prestamId = prestamId;
    }

    @Override
    public String toString() {
        return "PagoPrestamoDTO{" +
                "id=" + id +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", prestamId=" + prestamId +
                '}';
    }
}
