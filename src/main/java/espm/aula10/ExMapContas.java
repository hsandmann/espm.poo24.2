package espm.aula10;

import java.util.HashMap;
import java.util.Map;

import espm.banco.Cliente;
import espm.banco.PessoaFisica;

public class ExMapContas {

    public static void main(String[] args) {

        PessoaFisica isabella = new PessoaFisica("123", "isabella");
        PessoaFisica isabelle = new PessoaFisica("1232", "isabelle");

        Map<String, Cliente> clientesById = new HashMap<>();
        clientesById.put(isabella.getId(), isabella);
        clientesById.put(isabelle.getId(), isabelle);
        clientesById.put(isabella.getId(), isabella);

        System.out.println(clientesById);

        Map<String, Cliente> clientesByCPF = new HashMap<>();
        clientesByCPF.put(isabella.getCpf(), isabella);
        clientesByCPF.put(isabelle.getCpf(), isabelle);

        System.out.println(clientesByCPF);
        
    }

}
