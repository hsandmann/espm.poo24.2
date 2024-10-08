package espm.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Erro1 {
    
    public static void main(String[] args) {
        FileWriter file = null;
        try {
            file = new FileWriter("ola.txt");
            int a = 0;
            int b = 1;

            file.flush();
            file.close();
            System.out.println(b / a);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                }
            }
        }
    }

}
