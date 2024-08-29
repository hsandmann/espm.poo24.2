package espm.aula08;

import java.util.Arrays;
import java.util.Scanner;

public class ListaEstatica {

    public static void main(String[] args) {

        int numeros[] = { 40, 12, 56 };

        System.out.println(numeros[0]);

        int n = new Scanner(System.in).nextInt();
        double[] ns = new double[n]; 
        for (double x : ns) {
            System.out.println("aqui" + x);
        }
        // notacao lambda Java
        Arrays.stream(ns).forEach(x -> {
            x += 1;
            System.out.println(x);
        });
        Arrays.stream(ns).forEach(System.out::println);
    }
    
}
