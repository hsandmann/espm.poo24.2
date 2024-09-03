package espm.aula09;

import espm.banco.Cliente;
import espm.banco.Conta;
import espm.banco.ContaInvestimento;
import espm.banco.PessoaFisica;

public class TesteSacarInvestimento {
    
    public static void main(String[] args) {

        Cliente marcio = new PessoaFisica("232.232.423");
        ContaInvestimento ci = new ContaInvestimento(marcio);

        ci.depositar(100);
        ci.sacar(50);
        System.out.println(ci.getQtdDepositos() + ": " + ci);
        
    }

}
