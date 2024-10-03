package espm.banco;

import java.util.Scanner;

public class Console {

    private static Banco banco = new Banco("ESPM Bank");
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao " + banco.getNome());
        Cliente clienteAtual = null;
        Conta contaAtual = null;
        while (true) {
            try {
                // montando o prompt
                StringBuffer radical = new StringBuffer();
                radical.append(clienteAtual == null ? "" : clienteAtual.getNome());
                radical.append(radical.length() == 0 ? "" : "|");
                radical.append(contaAtual == null ? "" : contaAtual);
                radical.append("> ");
                System.out.print(radical.toString());

                // capturando o prompt
                String linha = scanner.nextLine().trim();

                // menu
                if (linha.equals("exit")) break;
                else if (linha.equals("help")) help();
                else if (linha.equals("1")) listCustomers();
                else if (linha.equals("2")) {
                    clienteAtual = insertCustomer();
                    contaAtual = null;
                }
                else if (linha.equals("3")) {
                    clienteAtual = selectCliente();
                    contaAtual = null;
                }
                else if (linha.equals("4")) listContas(clienteAtual);
                else if (linha.equals("5")) contaAtual = createConta(clienteAtual);
                else if (linha.equals("6")) contaAtual = selectConta(clienteAtual);
                else if (linha.equals("7")) deposit(contaAtual);
                else if (linha.equals("8")) withdraw(contaAtual);
                else if (linha.length() == 0) continue;
                else System.err.println("comando invalido");

            } catch (RuntimeException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Bye, bye!");
        scanner.close();
    }

    private static void help() {
        System.out.println(
            " --- " + banco.getNome() + " --- " +
            "\n" +
            "\n 1. listar clientes" +
            "\n 2. cadastrar cliente" +
            "\n 3. selecionar cliente" +
            "\n 4. listar contas" +
            "\n 5. criar contas" +
            "\n 6. selecionr contas" +
            "\n 7. depositar" + 
            "\n 8. sacar" 
        );
    }

    private static void listCustomers() {
        System.out.println("--- Lista de Clientes:");
        banco.getClientes().forEach(cliente -> {
            System.out.println(cliente);
        });
    }

    private static Cliente insertCustomer() {
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
        return cliente;
    }

    private static void deposit(Conta conta) {
        if (conta == null) {
            throw new RuntimeException("Conta não selecionada");
        }
        System.out.print("depositar: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
    }

    private static void withdraw(Conta conta) {
        if (conta == null) {
            throw new RuntimeException("Conta não selecionada");
        }
        System.out.print("sacar: ");
        double valor = scanner.nextDouble();
        conta.sacar(valor);
    }

    private static void listContas(Cliente cliente) {
        if (cliente == null) {
            throw new RuntimeException("Cliente não selecionadao");
        }
        cliente.getContas().forEach(conta -> System.out.println(conta));
    }

    private static Cliente selectCliente() {
        System.out.println("--- Clientes ---");
        listCustomers();
        System.out.println();
        System.out.print("codigo: ");
        String codigo = scanner.nextLine();
        for (Cliente cliente : banco.getClientes()) {
            if (cliente.getId().equalsIgnoreCase(codigo)) return cliente;        
        }
        throw new RuntimeException("cliente nao encontrado: " + codigo);
    }

    private static Conta selectConta(Cliente cliente) {
        if (cliente == null) {
            throw new RuntimeException("Cliente não selecionadao");
        }
        listContas(cliente);
        System.out.println();
        System.out.print("codigo: ");
        String codigo = scanner.nextLine();
        for (Conta conta : cliente.getContas()) {
            if (conta.getId().equalsIgnoreCase(codigo)) return conta;        
        }
        throw new RuntimeException("cliente nao encontrado: " + codigo);
    }

    private static Conta createConta(Cliente cliente) {
        if (cliente == null) {
            throw new RuntimeException("Cliente não selecionadao");
        }
        System.out.print("tipo da conta [C|P|I]: ");
        String tipo = scanner.nextLine();
        Conta conta =
            tipo.equalsIgnoreCase("C") ? new ContaCorrente(cliente) :
            tipo.equalsIgnoreCase("P") ? new ContaPoupanca(cliente) :
            tipo.equalsIgnoreCase("I") ? new ContaInvestimento(cliente) : null;
        if (conta == null) {
            throw new RuntimeException("Tipo invalido");
        }
        cliente.getContas().add(conta);
        return conta;
    }

}
