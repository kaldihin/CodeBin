package howto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static net.mindview.util.SwingConsole.run;

public class HTMLButton2 extends JFrame {
    private JButton b = new JButton("<html><b><font size=+2>"
    + "<center>Hello!<br><i>Press me now!");
    public HTMLButton2() {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(new JLabel("<html>" + "<i><font size =+4>Kapow!"));
                validate();
            }
        });
        setLayout(new FlowLayout());
        add(b);
    }

    public static void main(String[] args) {
        run(new HTMLButton2(), 200, 500);
    }
}
