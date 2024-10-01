package NetworkProgramming;
import java.net.InetAddress;
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            String domainName = "www.google.com";
            InetAddress address = InetAddress.getByName(domainName);
            System.out.println("Domain Name: " + domainName);
            System.out.println("IP Address: " + address.getHostAddress());
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localAddress.getHostName());
            System.out.println("Local IP Address: " + localAddress.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
