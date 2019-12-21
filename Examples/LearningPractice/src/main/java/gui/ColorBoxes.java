package gui;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;
import java.util.*;
import static net.mindview.util.SwingConsole.*;

class CBox extends JPanel implements Runnable {
    private int pause;
    private static Random rand = new Random();
    private Color color = new Color(0);
//    private Color color2 = new Color(255);
    private int x = 0, y = 0;
    private int[] xStar = {70, 90, 136, 103, 111, 70, 29, 36, 5, 48};
    private int[] yStar = {5, 41, 48, 80, 126, 105, 126, 80, 48, 41};
    private static final int POINTS = 10;
    public void paintComponent(Graphics g) {
        Dimension s = getSize();
        g.setColor(color);
        g.fillPolygon(xStar, yStar, POINTS);
//        g.setColor(color2);
//        g.fillRect(0, 0, s.width, s.height);

    }
    public CBox(int pause) {
        this.pause = pause;
        for (int i = 0; i < 10; i++) {
            xStar[i] = xStar[i] / 4;
            yStar[i] = yStar[i] / 4;
        }
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                color = new Color(rand.nextInt(0xFFFFFF));
//                color2 = new Color(rand.nextInt(0xFFFFFF));
                repaint();
                TimeUnit.MILLISECONDS.sleep(pause);
            }
        } catch (InterruptedException ex) {

        }
    }
}

public class ColorBoxes extends JFrame {
    private int grid = 12;
    private int pause = 50;
    private static ExecutorService exec =
            Executors.newCachedThreadPool();
    public ColorBoxes() {
        setLayout(new GridLayout(grid, grid));
        for (int i = 0; i < grid * grid; i++) {
            CBox cb = new CBox(pause);
            add(cb);
            exec.execute(cb);
        }
    }

    public static void main(String[] args) {
        ColorBoxes boxes = new ColorBoxes();
        if (args.length > 0)
            boxes.grid = new Integer(args[0]);
        if (args.length > 1)
            boxes.pause = new Integer(args[1]);
        run(boxes, 500, 400);
    }
}
