package mx.enas.BancoApp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 16)
    private String numero_tarjeta;

    @Column(nullable = false)
    private LocalDateTime fecha_expiracion;

    @Column(nullable = false, length = 3)
    private String cvv;

    @Column(nullable = false, length = 20)
    private String tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta_id", nullable = false)
    private String cuenta_id;

    //Contructores
    public Tarjeta() {}

    public Tarjeta(String numero_tarjeta, LocalDateTime fecha_expiracion, String cvv, String tipo, String cuenta_id) {
        this.numero_tarjeta = numero_tarjeta;
        this.fecha_expiracion = fecha_expiracion;
        this.cvv = cvv;
        this.tipo = tipo;
        this.cuenta_id = cuenta_id;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public LocalDateTime getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(LocalDateTime fecha_expiracion) {
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

    public String getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(String cuenta_id) {
        this.cuenta_id = cuenta_id;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "id=" + id +
                ", numero_tarjeta='" + numero_tarjeta + '\'' +
                ", fecha_expiracion=" + fecha_expiracion +
                ", cvv='" + cvv + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cuenta_id='" + cuenta_id + '\'' +
                '}';
    }

}
