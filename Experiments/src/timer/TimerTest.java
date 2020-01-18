package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        // Build a timer, calling the event receiver every 10 seconds

        Timer t = new Timer(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
