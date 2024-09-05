package espm.aula10;

import java.util.HashSet;
import java.util.Set;

import espm.banco.Cliente;
import espm.banco.PessoaFisica;
import espm.banco.PessoaJuridica;

public class ExSetContas {

    public static void main(String[] args) {

        Set<Cliente> clientes = new HashSet<>();

        Cliente isabella = new PessoaFisica("123.123", "isabella");
        isabella.setId("1");
        Cliente henrique = new PessoaFisica("123x.x123", "henrique");
        henrique.setId("2");

        clientes.add(isabella);
        clientes.add(henrique);
        clientes.add(null);

        System.out.println(clientes);

        Cliente espm = new PessoaJuridica("234234", "ESPM");
        espm.setId("1");

        // erroneamente ira retornar true, pois o criterio de comparacao eh apenas um equals
        System.err.println(espm.getNome() + " in clientes: " + clientes.contains(espm));

        System.out.println(isabella.equals(espm));
        System.out.println(espm.equals(isabella));
        
    }

}
