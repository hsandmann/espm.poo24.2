package espm.banco;

import java.util.UUID;

public abstract class Conta {

    final public String id = UUID.randomUUID().toString();

    // encapsula um objeto do tipo Cliente
    private Cliente cliente;
    
    protected double saldo = 0;

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

    public abstract void sacar(double valor);

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return id + ": " + saldo;
    }

    
}
