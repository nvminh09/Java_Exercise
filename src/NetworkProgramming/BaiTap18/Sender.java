package NetworkProgramming.BaiTap18;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Sender {
    public static void main(String[] args) {
        System.out.println("Sending data...");
        try {
            InetAddress group = InetAddress.getByName("230.0.0.1");
            MulticastSocket socket = new MulticastSocket();
            String message = "Hello, this is a multicast message";
            byte[] sendData = message.getBytes();
            while (true) {
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, group, 9000);
                socket.send(sendPacket);
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
