package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 * In this program is showed how to use inner classes
 */

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        // Run the program until user will not press the "OK" button
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * Hours, outputing time over regular intervals
 */
class TalkingClock {
    private int interval;
    private boolean beep;

    /**
     * Constructs "Talking watches"
     * @param interval Interval between messages (in milliseconds)
     * @param beep True, if the watches must do a sound signal
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Running watches
     */
    public void start() {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("At the tone, the time is " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
