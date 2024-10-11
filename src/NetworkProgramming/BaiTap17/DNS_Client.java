package NetworkProgramming.BaiTap17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DNS_Client {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPost = 9000;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter Address: ");
                String domainName = scanner.nextLine();
                // Send the request
                byte[] sendData = domainName.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPost);
                socket.send(sendPacket);
                // Receive the response
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                // Export the result
                String IP = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("IP:" + IP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
