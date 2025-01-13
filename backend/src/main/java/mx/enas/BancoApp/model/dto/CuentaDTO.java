package mx.enas.BancoApp.model.dto;

import java.math.BigDecimal;

public class CuentaDTO {
    private Long id;
    private String numeroCuenta;
    private BigDecimal saldo;
    private String tipo;
    private String estado;
    private Long clienteId;

    public CuentaDTO(Long id, String numeroCuenta, BigDecimal saldo, String tipo, String estado, Long clienteId) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
        this.estado = estado;
        this.clienteId = clienteId;
    }

    public CuentaDTO() {
    }

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

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", clienteId=" + clienteId +
                '}';
    }
}
