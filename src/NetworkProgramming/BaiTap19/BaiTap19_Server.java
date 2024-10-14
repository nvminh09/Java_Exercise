package NetworkProgramming.BaiTap19;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class BaiTap19_Server {
    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("230.0.0.3");
            MulticastSocket socket = new MulticastSocket();
            String[] color = {"Red", "Green", "Blue"};
            int colorIndex = 0;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Choose a color: ");
                System.out.println("0. Red");
                System.out.println("1. Green");
                System.out.println("2. Blue");
                colorIndex = scanner.nextInt();
                if (colorIndex < 0 || colorIndex > 2) {
                    System.out.println("Invalid color index");
                    continue;
                }
                String message = color[colorIndex];
                byte[] sendData = message.getBytes();
                socket.send(new DatagramPacket(sendData, sendData.length, group, 9000));
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
