package espm.aula06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class POOClient {
    
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            Socket client = new Socket("127.0.0.1", 9401);

            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            while (true) {
                System.out.print("> ");
                String line = scanner.nextLine().trim();

                out.println(line);
                String resp = in.readLine();
                System.out.println(resp);
                if (resp.equalsIgnoreCase("exit")) break;
            }

            scanner.close();
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
