package espm.aula09;

import espm.banco.Cliente;
import espm.banco.Conta;
import espm.banco.ContaInvestimento;
import espm.banco.ContaPoupanca;
import espm.banco.PessoaFisica;
import espm.banco.Rendimento;

public class TestarRendimento {

    public static void main(String[] args) {
        
        Cliente paulo = new PessoaFisica("234.234.234-23");

        Conta cp = new ContaPoupanca(paulo);
        Conta ci = new ContaInvestimento(paulo);

        cp.depositar(100);
        ci.depositar(100);

        System.out.println(cp);
        System.out.println(ci);

        ((Rendimento) cp).aplicar();
        ((Rendimento) ci).aplicar();

        System.out.println(cp);
        System.out.println(ci);
    
    }

}
