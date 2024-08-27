package espm.aula05;

import espm.banco.Cliente;
import espm.banco.Conta;

public class ExemploBanco {

    public static void main(String[] args) {
        

        Cliente c1 = new Cliente("1berto");

        Conta conta1 = new Conta(c1);

        System.out.println(conta1.id + " - saldo: " + conta1.getSaldo());
        conta1.sacar(10);
        System.out.println(conta1.id + " - saldo: " + conta1.getSaldo());
        conta1.depositar(20);
        System.out.println(conta1.id + " - saldo: " + conta1.getSaldo());

    }
    
}
