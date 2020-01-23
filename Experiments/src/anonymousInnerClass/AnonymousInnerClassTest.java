package anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * In this program is demonstrated using of anonymous inner classes
 */

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        // Run program until user will not click "OK" button
        JOptionPane.showMessageDialog(null,
                "Quit program");
        System.exit(0);
    }
}

/**
 * Clock, that show time over regular intervals
 */
class TalkingClock {

    /**
     * Runs clock
     * @param interval Interval between messages (in milliseconds)
     * @param beep True, if clock must make a sound signal
     */
    public void start(int interval, boolean beep) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("At the tone, the time is " +
                        new Date());
                if (beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }
}
