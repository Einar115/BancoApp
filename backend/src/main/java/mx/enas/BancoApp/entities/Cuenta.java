package mx.enas.BancoApp.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 20)
    private String numero_cuenta;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal saldo;

    @Column(nullable = false, length = 20)
    private String tipo;

    @Column(nullable = false, length = 20)
    private String estado="ACTIVA";

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private int cliente_id;

    //Contructores
    public Cuenta() {}

    public Cuenta(String numero_cuenta, BigDecimal saldo, String tipo, String estado, int cliente_id) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.tipo = tipo;
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

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
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

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", numero_cuenta='" + numero_cuenta + '\'' +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", cliente_id=" + cliente_id +
                '}';
    }
}
