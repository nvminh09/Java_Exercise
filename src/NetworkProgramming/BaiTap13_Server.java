package NetworkProgramming;

import java.net.ServerSocket;
import java.net.Socket;

public class BaiTap13_Server {
    public static void main(String[] args) {
        try {
            // Create a server socket and bind it to the port
            int port = 99;
            ServerSocket serverSocket = new ServerSocket(port);
            // Accept the client connections
            while (true) {
                // Accept the 1 client connection
                Socket clientSocket = serverSocket.accept();
                MyProcess process = new MyProcess(clientSocket);
                process.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

