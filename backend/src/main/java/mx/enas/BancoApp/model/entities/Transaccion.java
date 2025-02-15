package mx.enas.BancoApp.model.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal monto;

    @Column(nullable = false)
    private final LocalDateTime fecha=LocalDateTime.now();

    @Column(nullable = false, length = 20)
    private String tipo;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @ManyToOne(targetEntity = Cuenta.class)
    @JoinColumn(name = "cuenta_id", nullable = false)
    private Cuenta cuenta;

    //Contructores
    public Transaccion() {}

    public Transaccion(BigDecimal monto, String tipo, String descripcion, Cuenta cuenta) {
        this.monto = monto;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.cuenta = cuenta;
    }

    //Getters y Setters
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
        return "Transaccion{" +
                "id=" + id +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cuenta=" + cuenta +
                '}';
    }
}
