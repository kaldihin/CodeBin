package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mindview.util.*;

import static net.mindview.util.SwingConsole.run;

class CallableTask extends Task implements Callable<String> {
    public String call() {
        run();
        return "Return value of " + this;
    }
}

public class InterruptableLongRunningCallable extends JFrame {
    private JButton b1 = new JButton("Start Long Running Task"),
    b2 = new JButton("End Long Running Task"),
    b3 = new JButton("Get results");
    private TaskManager<String, CallableTask> manager = new TaskManager<>();
    public InterruptableLongRunningCallable() {
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CallableTask task = new CallableTask();
                manager.add(task);
                System.out.println(task + " added to the queue");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (TaskItem<String, CallableTask> tt : manager)
                    tt.task.id();
                for (String result : manager.getResults())
                    System.out.println(result);
            }
        });
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
    }

    public static void main(String[] args) {
        run(new InterruptableLongRunningCallable(), 200, 150);
    }
}
