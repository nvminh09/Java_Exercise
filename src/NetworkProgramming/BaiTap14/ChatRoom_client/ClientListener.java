package NetworkProgramming.BaiTap14.ChatRoom_client;

import java.io.InputStream;
import java.net.Socket;

public class ClientListener implements Runnable {
    private Socket socket;
    private InputStream input;
    public ClientListener(Socket socket) {
        this.socket = socket;
        try {
            this.input = socket.getInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) { // While there is data to read
                String message = new String(buffer, 0, bytesRead);
                System.out.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
