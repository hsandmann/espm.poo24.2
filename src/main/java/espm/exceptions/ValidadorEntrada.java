package espm.exceptions;

import java.util.Scanner;

public class ValidadorEntrada {
    

    public static void main(String[] args) {
        
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            while (true) {
                
                try {
                    System.out.print("> ");
                    String opc = input(scanner, "1", "2", "0");
                    if (opc == "0") break;
                } catch (TerminalException e) {
                    System.err.println(e.getMessage());
                }

            }
        } finally {
            if (scanner != null) scanner.close();
        }

    }

    private static String input(Scanner scanner, String... opcoes) throws TerminalException {
        String line = scanner.nextLine().trim();
        for (String opc : opcoes) {
            if (line.equalsIgnoreCase(opc)) return opc;
        }
        throw new TerminalException(line + " nao eh valida");
    }

    public static class TerminalException extends ESPMException {

        public TerminalException(String msg) {
            super("terminal.error", msg);
        }

    }
    
}
