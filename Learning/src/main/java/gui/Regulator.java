package gui;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import static net.mindview.util.SwingConsole.*;

public class Regulator extends JFrame {
    private JSlider red = new JSlider(0, 255, 0);
    private JSlider green = new JSlider(0, 255, 0);
    private JSlider blue = new JSlider(0, 255, 0);
    private JPanel sliders = new JPanel();
    private JPanel areas = new JPanel();
    private JPanel window = new JPanel();
    private JTextArea r = new JTextArea("red", 1, 5);
    private JTextArea g = new JTextArea("green", 1, 5);
    private JTextArea b = new JTextArea("blue", 1, 5);
    private int redColor = 0;
    private int greenColor = 0;
    private int blueColor = 0;

    public Regulator() {
        setLayout(new BorderLayout());
        add(red, BorderLayout.NORTH);
        add(green, BorderLayout.WEST);
        add(blue, BorderLayout.SOUTH);
        add(window, BorderLayout.CENTER);
        r.setEditable(false);
        g.setEditable(false);
        b.setEditable(false);
        sliders.add(r);
        sliders.add(g);
        sliders.add(b);
        add(sliders, BorderLayout.EAST);

        red.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                redColor = red.getValue();
                window.setBackground(new Color(redColor, greenColor, blueColor));
                String rs = Integer.toString(redColor);
                r.setText(rs);
            }
        });
        green.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                greenColor = green.getValue();
                window.setBackground(new Color(redColor, greenColor, blueColor));
                String gs = Integer.toString(greenColor);
                g.setText(gs);
            }
        });
        blue.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                blueColor = blue.getValue();
                window.setBackground(new Color(redColor, greenColor, blueColor));
                String bs = Integer.toString(blueColor);
                b.setText(bs);
            }
        });
    }
    public static void main(String[] args) {
        run(new Regulator(), 600, 400);
    }
}
