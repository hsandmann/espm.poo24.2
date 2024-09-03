package espm.aula09;

import espm.banco.Cliente;
import espm.banco.Conta;
import espm.banco.ContaCorrente;
import espm.banco.PessoaFisica;

public class TesteConta {

    public static void main(String[] args) {

        Cliente c1 = new PessoaFisica("123.312.312-32");
        Conta cc1 = new ContaCorrente(c1);
        cc1.sacar(800);
        System.out.println(cc1);
        cc1.sacar(800);
        System.out.println(cc1);

    }

}
