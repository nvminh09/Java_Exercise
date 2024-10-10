package NetworkProgramming.BaiTap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BaiTap16_Client {
    public static void main(String[] args) {
        try {
            //Create a socket UDP
            DatagramSocket socket = new DatagramSocket();
            // Define address and port of server
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9000;

            int i = 0;
            while (i <= 100) {
                // Create message
                String message = "UDP Server + " + i;
                // Convert message to the byte
                byte[] sendData = message.getBytes();
                // Create DatagramPacket and send to the server
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                socket.send(sendPacket);
                Thread.sleep(3000);
                // Count
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
