package mx.enas.BancoApp.model.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero_cuenta", nullable = false, unique = true, length = 20)
    private String numeroCuenta;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal saldo;

    @Column(nullable = false, length = 20)
    private String tipo;

    @Column(length = 20)
    private String estado="ACTIVA";

    @ManyToOne(targetEntity = Cliente.class)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(targetEntity = Transaccion.class, mappedBy = "cuenta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaccion> transaccions;

    @OneToMany(targetEntity = Tarjeta.class, mappedBy = "cuenta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarjeta> tarjetas;

    //Contructores
    public Cuenta() {}

    public Cuenta(String numeroCuenta, BigDecimal saldo, String tipo, String estado, Cliente cliente, List<Transaccion> transaccions, List<Tarjeta> tarjetas) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
        this.estado = estado;
        this.cliente = cliente;
        this.transaccions = transaccions;
        this.tarjetas = tarjetas;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public List<Transaccion> getTransaccions() {
        return transaccions;
    }

    public void setTransaccions(List<Transaccion> transaccions) {
        this.transaccions = transaccions;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", numero_cuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", cliente=" + cliente +
                ", transaccions=" + transaccions +
                ", tarjetas=" + tarjetas +
                '}';
    }
}
