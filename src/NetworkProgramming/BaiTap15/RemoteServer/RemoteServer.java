package NetworkProgramming.BaiTap15.RemoteServer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
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
                    Runtime.getRuntime().exec("shutdown -r -t 3600");
                    writer.println("Restart command has been sent to the client");
                    writer.flush();
                } else if (request.equals("cancel shutdown/restart")) {
                    Runtime.getRuntime().exec("shutdown -a");
                    writer.println("Cancel Shutdown/Restart command has been sent to the client");
                    writer.flush();
                } else if (request.equals("screenshot")) {
                    // Capture screenshot
                    BufferedImage screenshot = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(screenshot, "png", baos);
                    writer.flush();
                    byte[] imageBytes = baos.toByteArray();
                    baos.close();
                    writer.println(imageBytes.length);
                    writer.flush();
                    socket.getOutputStream().write(imageBytes);
                } else {
                    writer.println("Invalid command");
                    writer.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
