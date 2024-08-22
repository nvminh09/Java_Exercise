package Interface.Drawable;

import javax.swing.*;
import java.awt.*;

class Triangle implements Drawable {
    @Override
    public void draw() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.GREEN);
                int[] xPoint = {200, 100, 300};
                int[] yPoint = {100, 300, 300};
                g.fillPolygon(xPoint, yPoint, 3);
            }
        };
        frame.add(panel);
    }
}