package espm.banco;

public class PessoaJuridica extends Cliente {

    private final String cnpj;

    public PessoaJuridica(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof PessoaJuridica);
    }
    
}
