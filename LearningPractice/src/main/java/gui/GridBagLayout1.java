package gui;
import javax.swing.*;
import java.awt.*;
import static net.mindview.util.SwingConsole.*;

public class GridBagLayout1 extends JFrame {

    public GridBagLayout1() {
        setLayout(new GridBagLayout());
        for (int i = 0; i < 9; i++)
        add(new JButton("Button " + i));
    }

    public static void main(String[] args) {
        run(new GridBagLayout1(), 400, 400);
    }
}
