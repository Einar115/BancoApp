package mx.enas.BancoApp.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 16)
    private String numero_tarjeta;

    @Column(nullable = false)
    private LocalDate fecha_expiracion;

    @Column(nullable = false, length = 3)
    private String cvv;

    @Column(nullable = false, length = 20)
    private String tipo;

    @ManyToOne(targetEntity = Cuenta.class)
    @JoinColumn(name = "cuenta_id", nullable = false)
    private Cuenta cuenta;

    //Contructores
    public Tarjeta() {}

    public Tarjeta(String numero_tarjeta, LocalDate fecha_expiracion, String cvv, String tipo, Cuenta cuenta) {
        this.numero_tarjeta = numero_tarjeta;
        this.fecha_expiracion = fecha_expiracion;
        this.cvv = cvv;
        this.tipo = tipo;
        this.cuenta = cuenta;
    }

    //Getters y Setters
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

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "id=" + id +
                ", numero_tarjeta='" + numero_tarjeta + '\'' +
                ", fecha_expiracion=" + fecha_expiracion +
                ", cvv='" + cvv + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cuenta=" + cuenta +
                '}';
    }
}
