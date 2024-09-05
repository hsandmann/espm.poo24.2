package espm.banco;

public class Banco {

    private final String nome;

    private Conta[] contas = new Conta[100];

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
