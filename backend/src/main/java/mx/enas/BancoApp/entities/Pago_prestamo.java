package mx.enas.BancoApp.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Pago_prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal monto;

    @Column(nullable = false)
    private LocalDateTime fecha = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prestamo_id", nullable = false)
    private int prestamo_id;

    //Contructores
    public Pago_prestamo() {}

    public Pago_prestamo(BigDecimal monto, LocalDateTime fecha, int prestamo_id) {
        this.monto = monto;
        this.fecha = fecha;
        this.prestamo_id = prestamo_id;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getPrestamo_id() {
        return prestamo_id;
    }

    public void setPrestamo_id(int prestamo_id) {
        this.prestamo_id = prestamo_id;
    }

    @Override
    public String toString() {
        return "Pago_prestamo{" +
                "id=" + id +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", prestamo_id=" + prestamo_id +
                '}';
    }

}
