package NetworkProgramming.BaiTap14.ChatRoom_server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket mySocket;
    private ChatServer chatServer;
    private String id;
    private InputStream input;
    private OutputStream output;
    public ClientHandler(Socket mySocket, String id, ChatServer chatServer) {
        this.mySocket = mySocket;
        this.id = id;
        this.chatServer = chatServer;
        try {
            this.input = mySocket.getInputStream();
            this.output = mySocket.getOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        try {
            byte[] buffet = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffet)) != -1) {
                String message = new String(buffet, 0, bytesRead);
                chatServer.broadcastMessage(this.id, message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void sendMessage(String message) {
        try {
            output.write(message.getBytes()); // getBytes() convert string to byte
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getId() {
        return id;
    }

}
