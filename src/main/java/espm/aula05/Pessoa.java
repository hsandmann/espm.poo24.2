package espm.aula05;

public class Pessoa {

    /* construtor */
    // define os parametros minimos para o objeto existir
    public Pessoa(String nome) {
        this.nome = nome; // o parametro nome eh colocado no atributo nome
    }

    public Pessoa(String c, String n) {
        this.nome = n;
        this.cpf = c;
    }

    // atributos
    private String nome; // apenas os metodos do objeto enxergam esse atributo
    String cpf;
    int idade = 1;

    public String getNome() {
        return this.nome;
    }
    
}
