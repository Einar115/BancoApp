package mx.enas.BancoApp.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal monto;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal tasa_interes;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_vencimiento", nullable = false)
    private LocalDate fechaVencimiento;

    @Column(length = 20)
    private String estado="ACTIVO";

    @ManyToOne(targetEntity = Cliente.class)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(targetEntity = PagoPrestamo.class, mappedBy = "prestamo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PagoPrestamo> pagos;

    //Contructores
    public Prestamo() {}

    public Prestamo(BigDecimal monto, BigDecimal tasa_interes, LocalDate fechaInicio, LocalDate fechaVencimiento, String estado, Cliente cliente, List<PagoPrestamo> pagos) {
        this.monto = monto;
        this.tasa_interes = tasa_interes;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
        this.cliente = cliente;
        this.pagos = pagos;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PagoPrestamo> getPagos() {
        return pagos;
    }

    public void setPagos(List<PagoPrestamo> pagos) {
        this.pagos = pagos;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", monto=" + monto +
                ", tasa_interes=" + tasa_interes +
                ", fecha_inicio=" + fechaInicio +
                ", fecha_vencimiento=" + fechaVencimiento +
                ", estado='" + estado + '\'' +
                ", cliente=" + cliente +
                ", pagos=" + pagos +
                '}';
    }
}
