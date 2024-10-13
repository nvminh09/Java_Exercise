package NetworkProgramming.BaiTap18;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receiver {
    public static void main(String[] args) {
        System.out.println("Receiver 1: ");
        try {
            InetAddress group = InetAddress.getByName("230.0.0.1");
            MulticastSocket socket = new MulticastSocket(9000);
            socket.joinGroup(group);
            while (true) {
                byte[] receiveData = new byte[1024];
                socket.receive(new DatagramPacket(receiveData, receiveData.length));
                String message = new String(receiveData).trim();
                System.out.println("Received: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
