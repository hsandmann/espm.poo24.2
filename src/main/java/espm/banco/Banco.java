package espm.banco;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Banco {

    private final String nome;

    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<String, PessoaFisica> clientesByCPF = new HashMap<>();
    private Map<String, PessoaJuridica> clientesByCNPJ = new HashMap<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void add(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        if (cliente instanceof PessoaFisica pf) clientesByCPF.put(pf.getCpf(), pf);
        if (cliente instanceof PessoaJuridica pj) clientesByCNPJ.put(pj.getCnpj(), pj);
    }

    public Set<Cliente> getClientes() {
        // retorna a colecao de clientes de dentro do map, ignorando as chaves
        Collection<Cliente> colecao = clientes.values();
        // tornei a colecao imodificavel
        colecao = Collections.unmodifiableCollection(colecao);
        // a colecao pode ser List ou Set, optamos por Set, pois a classe
        // Cliente ja implementa hashCode e equals a fim de garantir a unicidade
        return Collections.unmodifiableSet(new HashSet<>(colecao));
    }

}
