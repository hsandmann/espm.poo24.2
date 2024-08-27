package espm.banco;

import java.util.UUID;

public abstract class Cliente {

    // cria um identificado unico e atribui ao atributo id,
    // final nao permite que ninguem mais altere seu conteudo
    final private String id;

    private String nome;

    public Cliente() {
        this.id = UUID.randomUUID().toString();
    }

    public Cliente(String nome) {
        this();
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + nome;
    }

}
