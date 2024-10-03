package espm.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Cliente {

    private List<Conta> contas = new ArrayList<>();

    // cria um identificado unico e atribui ao atributo id,
    // final nao permite que ninguem mais altere seu conteudo
    private String id;

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

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + nome;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null
            && (obj instanceof Cliente)
            && ((Cliente) obj).id.equals(this.id);
    }

    public List<Conta> getContas() {
        return contas;
    }

}
