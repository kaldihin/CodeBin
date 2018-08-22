package gui;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.SwingConsole.*;

public class Progress extends JFrame {
    private JProgressBar pb = new JProgressBar(0, 100);
//    private ProgressMonitor pm = new ProgressMonitor(
//            this, "Monitoring Progress",
//            "Test", 0, 100);
    private JPanel p = new JPanel();
    javax.swing.Timer timer;
    static int delay = 150;
//    private JSlider sb = new JSlider(JSlider.HORIZONTAL, 0, 100, 60);
    private JButton start = new JButton("Start!");
    public Progress() {
        setLayout(new FlowLayout());
        add(start);
        pb.setStringPainted(true);
        add(pb);
        ActionListener updateProBar = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                int val = pb.getValue();
//
                if (val >= 100) {
                    //  timer.stop();
                    start.setText("End");
                    return;
                }
                pb.setValue(++val);
            }
        };

        timer = new Timer(delay, updateProBar);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timer.isRunning()) {
                    timer.stop();
                    start.setText("Start");
                } else if (start.getText() != "End") {
                    timer.start();
                    start.setText("Stop");
                }
            }
        });
//        Timer t = new Timer(start.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                for (int i = pb.getMinimum(); i <= pb.getMaximum(); i++) {
//                    pb.setValue(i);
//                }
//            }
//        }), 100);


//        sb.setValue(0);
//        sb.setPaintTicks(true);
//        sb.setMajorTickSpacing(20);
//        sb.setMajorTickSpacing(5);
//        sb.setBorder(new TitledBorder("Slide me"));
//        pb.setModel(sb.getModel());
//        add(sb);
//        sb.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
//                pm.setProgress(sb.getValue());
//            }
//        });
    }

    public static void main(String[] args) {
        run(new Progress(), 300, 200);
    }
}
