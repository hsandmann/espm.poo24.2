package espm.banco;

public class PessoaFisica extends Cliente {

    private final String cpf;

    public PessoaFisica(String cpf) {
        super();
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + cpf + ")";
    }
    
}
