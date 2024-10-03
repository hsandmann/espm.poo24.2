package espm.banco;

public class ContaPoupanca extends Conta implements Rendimento {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }

    @Override
    public double getTaxa() {
        return .005;
    }

    @Override
    public void aplicar() {
        this.saldo += saldo * getTaxa();
    }

    
}
