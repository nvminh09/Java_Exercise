package NetworkProgramming.BaiTap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BaiTap16_Server {
    public static void main(String[] args) {
        try {
            //Create a socket UDP and listen on the port 9000
            DatagramSocket socket = new DatagramSocket(9000);
            byte[] receiveData = new byte[1024];
            while (true) {
                // Create a DatagramPacket to receive data
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                // Receive a data package
                socket.receive(receivePacket);
                // Convert received data to the string and scan it
                String receiveMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                // Check the receiving data before scanning
                if (!receiveMessage.trim().isEmpty()) {
                    System.out.println("Server received: " + receiveMessage);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
