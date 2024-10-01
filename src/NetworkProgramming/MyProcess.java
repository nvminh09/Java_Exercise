package NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyProcess extends Thread {
    private Socket socket;

    public MyProcess(Socket clientSocket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // Read message from the client
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Send message to the client
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            // Read message from the user
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String message;
                // Receive the message from the client
                message = reader.readLine();
                System.out.println("Client: " + message);
                // Send the message to the client
                System.out.print("Server: ");
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
            }

        } catch (Exception e) {
            //
        }
    }
}
