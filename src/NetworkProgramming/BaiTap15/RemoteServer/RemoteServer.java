package NetworkProgramming.BaiTap15.RemoteServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RemoteServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connected to " + socket.getInetAddress().getHostAddress());
                // Create a new thread to handle the client
                Thread thread = new Thread(
                        () -> handleClientRequest(socket)
                );
                thread.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void handleClientRequest(Socket socket) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            while (true) {
                String request = reader.readLine();
                System.out.println("Request from client: " + request);
                if (request.equals("shutdown")) {
                    Runtime.getRuntime().exec("shutdown -s -t 3600");
                    writer.println("Shutdown command has been sent to the client");
                    writer.flush();
                } else if (request.equals("restart")) {
                    Runtime.getRuntime().exec("shutdown -r -t 1");
                    writer.println("Restart command has been sent to the client");
                    writer.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
