package espm.aula08;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("b: ");
        int b = scanner.nextInt();

        double c = Math.pow(a*a + b*b, .5);
        System.out.println("C: " + c);
        int d = (int) c;
        System.out.println("D: " + d);

        scanner.close();

    }
    
}
