package gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import static java.lang.Math.*;

import static net.mindview.util.SwingConsole.run;

class RectangleAct extends JPanel {
    java.awt.Rectangle d = getBounds(super.getBounds());
    private int x = d.x + 500, y = d.y + 500, xe = d.width - 300, ye = d.height - 300;
    private int lengthL = xe - x;
    private int x0 = d.width/2, y0 = d.height/2;
    private int point1X = x,point1Y = y,point2X = x + 200,point2Y = y,point3X = x + 200,point3Y = y - 200,point4X = x,point4Y = y - 200;
    private static final double cos10 = 1, sin10 = 0;
    public RectangleAct() {
        setCycles();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(point1X, point1Y, point2X, point2Y);
        g.drawLine(point2X, point2Y, point3X, point3Y);
        g.drawLine(point3X, point3Y, point4X, point4Y);
        g.drawLine(point4X, point4Y, point1X, point1Y);
    }


    public void setCycles() {
//        this.speed = speed;
        point1X = (int)(x0 + (point1X - x0) * cos(cos10) - (point1Y - y0) * sin(sin10));
        point1Y = (int)(y0 + (point1Y - y0) * cos(cos10) + (point1X - x0) * sin(sin10));
        point2X = (int)(x0 + (point2X - x0) * cos(cos10) - (point2Y - y0) * sin(sin10));
        point2Y = (int)(y0 + (point2Y - y0) * cos(cos10) + (point2X - x0) * sin(sin10));
        point3X = (int)(x0 + (point3X - x0) * cos(cos10) - (point3Y - y0) * sin(sin10));
        point3Y = (int)(y0 + (point3Y - y0) * cos(cos10) + (point3X - x0) * sin(sin10));
        point4X = (int)(x0 + (point4X - x0) * cos(cos10) - (point4Y - y0) * sin(sin10));
        point4Y = (int)(y0 + (point4Y - y0) * cos(cos10) + (point4X - x0) * sin(sin10));
        repaint();
    }
}

class RL {
    int X1, X2, Y1, Y2;
}

public class Rectangle extends JFrame {
    private RectangleAct rect = new RectangleAct();
    private JSlider speed = new JSlider(1, 30, 5);
    public Rectangle() {
        add(rect);
        speed.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
//                rect.setCycles(((JSlider)e.getSource()).getValue());
                rect.setCycles();
            }
        });
        add(BorderLayout.SOUTH, speed);
    }

    public static void main(String[] args) {
        run(new Rectangle(), 700, 700);
    }
}
