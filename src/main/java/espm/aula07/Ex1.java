package espm.aula07;

import espm.banco.Cliente;
import espm.banco.Conta;
import espm.banco.PessoaFisica;

public class Ex1 {

    public static void main(String[] args) {
        
        PessoaFisica pf1 = new PessoaFisica("423.423.128-23");
        pf1.setNome("Fernando");

        Conta c1 = new Conta(pf1);

        System.out.println(c1.getCliente().getNome());

        Cliente cliente1 = new PessoaFisica("234.234.234-23");
        cliente1.setNome("Paulo");
        ((PessoaFisica) cliente1).getCpf(); // cast de tipo

        PessoaFisica p2 = ((PessoaFisica) cliente1);
        System.out.println("cpf: " + p2.getCpf());
        System.out.println(p2);
        System.out.println(cliente1);
        System.out.println((Cliente) cliente1);

    }
    
}
