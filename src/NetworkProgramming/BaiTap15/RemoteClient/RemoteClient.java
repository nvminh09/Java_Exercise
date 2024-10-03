package NetworkProgramming.BaiTap15.RemoteClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RemoteClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 3000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                System.out.println("\nMenu:");
                System.out.println("1. Shutdown");
                System.out.println("2. Restart");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        writer.println("shutdown");
                        writer.flush();
                        System.out.println(reader.readLine());
                        break;
                    case 2:
                        writer.println("restart");
                        writer.flush();
                        System.out.println(reader.readLine());
                        break;
                    default:
                        exit = true;
                        break;
                }
            }

            //System.out.println("Connected to " + socket.getInetAddress().getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
