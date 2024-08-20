package espm.banco;

import java.util.UUID;

public class Conta {

    final private String id = UUID.randomUUID().toString();

    private Cliente cliente;
    private double saldo = 0;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) return;
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > this.saldo) return;
        this.saldo -= valor;
    }
    
}
