package espm.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    private double limite = 1000;

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (limite + saldo)) {
            this.saldo -= valor;
        }
    }
    
}
