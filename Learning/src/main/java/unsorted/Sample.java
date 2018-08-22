package unsorted;

import java.applet.Applet;
import java.awt.*;


//<applet code = "Sample" width = 300 height = 50>
//</applet>

public class Sample extends Applet {
    String msg;

    public void init() {
        setBackground(Color.CYAN);
        setForeground(Color.RED);
        msg = "Inside init( ) --";
    }
    public void start() {
        msg += " Inside start() --";
    }
    public void stop() {

    }
    public void destroy() {

    }
    public void paint(Graphics g) {
        msg += " Inside paint().";
        g.drawString(msg, 10, 30);
    }
}
