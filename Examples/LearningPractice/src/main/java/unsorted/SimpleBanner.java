package unsorted;

import java.applet.Applet;
import java.awt.*;


//<applet code = "SimpleBanner" width = 300 height = 50>
//</applet>

public class SimpleBanner extends Applet implements Runnable {
    String msg = " A Simple Moving Banner.";
    Thread t = null;
    int state;
    volatile boolean stopFlag;

    public void init() {
        setBackground(Color.CYAN);
        setForeground(Color.RED);
    }
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    @Override
    public void run() {
        stopFlag = true;
        t = null;
    }

    public void stop() {

    }
    public void destroy() {

    }
    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
        showStatus("This is shown in the status window.");
    }
}
