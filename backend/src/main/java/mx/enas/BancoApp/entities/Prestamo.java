package mx.enas.BancoApp.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal monto;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal tasa_interes;

    @Column(nullable = false)
    private final LocalDateTime fecha_inicio=LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime fecha_vencimiento;

    @Column(nullable = false, length = 20)
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private int cliente_id;

    //Contructores
    public Prestamo() {}

    public Prestamo(BigDecimal monto, BigDecimal tasa_interes, LocalDateTime fecha_vencimiento, String estado, int cliente_id) {
        this.monto = monto;
        this.tasa_interes = tasa_interes;
        this.fecha_vencimiento = fecha_vencimiento;
        this.estado = estado;
        this.cliente_id = cliente_id;
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

    public BigDecimal getTasa_interes() {
        return tasa_interes;
    }

    public void setTasa_interes(BigDecimal tasa_interes) {
        this.tasa_interes = tasa_interes;
    }

    public LocalDateTime getFecha_inicio() {
        return fecha_inicio;
    }

    public LocalDateTime getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDateTime fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", monto=" + monto +
                ", tasa_interes=" + tasa_interes +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_vencimiento=" + fecha_vencimiento +
                ", estado='" + estado + '\'' +
                ", cliente_id=" + cliente_id +
                '}';
    }

}
