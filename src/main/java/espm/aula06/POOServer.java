package espm.aula06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class POOServer {

    public static void main(String[] args) {
        ServerSocket server = null;
        try {

            server = new ServerSocket(9401);
            System.out.println(server.getLocalPort());
            while (true) {
                Socket client = server.accept();
            
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                while (true) {
                    String msg = in.readLine();
                    System.out.println(client.getInetAddress() + "[" + client.getPort() + "]: " + msg);
                    out.println(msg);
                    if (msg.equalsIgnoreCase("exit")) break;
                    if (msg.equalsIgnoreCase("shutdown")) {
                        server.close();
                        break;
                    }
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (server != null) server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }

}
