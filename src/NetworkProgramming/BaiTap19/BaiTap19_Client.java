package NetworkProgramming.BaiTap19;

import javax.swing.*;
import java.awt.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class BaiTap19_Client {
    public static void main(String[] args) {
            LightControllerGUI gui = new LightControllerGUI();
            gui.createAndShowGUI();
        }
    }
    class LightControllerGUI {
        private JLabel lightLabel;
        private JPanel mainPanel;
        public void createAndShowGUI() {
            JFrame frame = new JFrame("Light Controller");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            lightLabel = new JLabel("Light Status: ");
            lightLabel.setHorizontalAlignment(JLabel.CENTER);
            mainPanel.add(lightLabel, BorderLayout.CENTER);

            frame.setMinimumSize(new Dimension(300, 200));
            frame.getContentPane().add(mainPanel);
            frame.pack();
            frame.setVisible(true);
            startListening();
        }

        private void startListening() {
            try {
                InetAddress group = InetAddress.getByName("230.0.0.3");
                MulticastSocket socket = new MulticastSocket(9000);
                socket.joinGroup(group);
                while (true) {
                    byte[] receiveData = new byte[1024];
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    socket.receive(receivePacket);
                    String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                    System.out.println("Received: " + receivedMessage);
                    updateLightStatus(receivedMessage);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void updateLightStatus(String color) {
            switch (color) {
                case "Red":
                    lightLabel.setText("Light Status: Red");
                    mainPanel.setBackground(Color.RED);
                    break;
                case "Green":
                    lightLabel.setText("Light Status: Green");
                    mainPanel.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    lightLabel.setText("Light Status: Blue");
                    mainPanel.setBackground(Color.BLUE);
                    break;
                default:
                    lightLabel.setText("Light Status: Unknown");
                    mainPanel.setBackground(Color.WHITE);
                    break;
            }
        }
    }
