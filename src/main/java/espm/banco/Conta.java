package espm.banco;

import java.util.UUID;

public class Conta {

    final public String id = UUID.randomUUID().toString();

    // encapsula um objeto do tipo Cliente
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
