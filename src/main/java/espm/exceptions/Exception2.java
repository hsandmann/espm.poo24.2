package espm.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("abriu o scanner");

        try {

            scanner.nextInt();
            FileReader reader = new FileReader("ceuminion.txt");

            reader.close();
        } catch (FileNotFoundException e) {
            throw new ESPMException("file.not.found", e, "arquivo nao achou");
        } catch (IOException e) {
            throw new ESPMException("io exception" , e.getMessage());
        } finally {
            scanner.close();
            System.out.println("fechou o scanner");
        }

    }
    
}
