package NetworkProgramming.BaiTap14.ChatRoom_server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private static final int PORT = 5000;
    private List<ClientHandler> clients = new ArrayList<>();
    public void startServer() {
        try {
            // Websocket
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is running on port " + PORT);
            // Client connect to server
            while (true) { // While server is running and waiting for client to connect
                Socket clientSocket = serverSocket.accept(); // Accept the connection between client and server
                System.out.println("New client connected: " + clientSocket.getInetAddress().getHostAddress());
                ClientHandler clientHandler = new ClientHandler(clientSocket, System.currentTimeMillis() + "", this);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void broadcastMessage(String id, String message) {
        for (ClientHandler client : clients) {
            //client.sendMessage(message);
            if(!(client.getId().equals(id)))
                client.sendMessage(id+" : " +message);
        }
    }
}
