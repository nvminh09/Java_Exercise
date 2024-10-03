package NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class BaiTap13_Client {
    public static void main(String[] args) {
        try {
            // Connect to the server
            int port = 99;
            Socket socket = new Socket("localhost", port);
            // Read message from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Send message to the server
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            // Read message from the user
            Scanner scanner = new Scanner(System.in);
            String message;
            while (true) {
                // Send the message to the server
                System.out.print("Client: ");
                message = scanner.nextLine();
                writer.flush();
                // Receive the message from the server
                message = reader.readLine();
                System.out.println("Server: " + message);
            }

        } catch (Exception e) {
            System.out.println("Cannot connect to the server.");
        }
    }
}
