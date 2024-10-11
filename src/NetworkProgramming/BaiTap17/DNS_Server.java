package NetworkProgramming.BaiTap17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DNS_Server {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9000);
            System.out.println("DNS Server is running ...");
            // Create sample web and IP
            String [][] dnsTable = {
                    {"www.example.com", "192.168.1.100"},
                    {"www.google.com", "8.8.8.8"},
                    {"www.titv.vn", "31.13.65.36"}
            };
            while (true) {
                // Create and receive packet
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                // Query IP from the Address
                String domainName = new String(receivePacket.getData(), 0, receivePacket.getLength());
                domainName = domainName.trim();
                domainName = domainName.toLowerCase();
                String response = "Not found.";
                for (String[] entry : dnsTable) {
                    if (entry[0].equals(domainName)) {
                        response = entry[1];
                        break;
                    }
                }
                // Feed back
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                byte[] responseData = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
