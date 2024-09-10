package espm.banco;

import java.util.Scanner;

public class Console {

    private static Banco banco = new Banco("ESPM Bank");
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao " + banco.getNome());
        while (true) {
            System.out.print("> ");
            String linha = scanner.nextLine().trim();
            if (linha.equals("exit")) break;
            else if (linha.equals("help")) help();
            else if (linha.equals("1")) listCustomers();
            else if (linha.equals("2")) insertCustomer();
            else if (linha.length() == 0) continue;
            else System.err.println("comando invalido");
        }
        System.out.println("Bye, bye!");
        scanner.close();
    }

    private static void help() {
        System.out.println(
            " --- " + banco.getNome() + " --- " +
            "\n" +
            "\n 1. listar clientes" +
            "\n 2. cadastras cliente" 
        );
    }

    private static void listCustomers() {
        System.out.println("--- Lista de Clientes:");
        banco.getClientes().forEach(cliente -> {
            System.out.println(cliente);
        });
    }

    private static void insertCustomer() {
        System.out.print("Tipo [F|J]: ");
        boolean isFisica = scanner.nextLine().trim().equalsIgnoreCase("f");
        final Cliente cliente;
        System.out.print("Nome: ");
        String nome = scanner.nextLine().trim();
        if (isFisica) {
            System.out.print("CPF: ");
            String cpf = scanner.nextLine().trim();
            cliente = new PessoaFisica(cpf, nome);
        } else {
            System.out.print("CNPJ: ");
            String cnpj = scanner.nextLine().trim();
            cliente = new PessoaJuridica(cnpj, nome);
        }
        banco.add(cliente);
    }

}
