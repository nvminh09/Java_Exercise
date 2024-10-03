package NetworkProgramming.BaiTap14.ChatRoom_client;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    private static final String URL = "localhost";
    private static final int PORT = 5000;
    public void StartClient() {
        try {
            Socket socket = new Socket(URL, PORT);
            System.out.println("Connected to server.");
            // Countinue reading data from server
            ClientListener client = new ClientListener(socket);
            new Thread(client).start();
            // Countinue reading data from scanner
            OutputStream output = socket.getOutputStream();
            Scanner sc = new Scanner(System.in);
            while (true) {
                String message = sc.nextLine();
                output.write(message.getBytes());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
