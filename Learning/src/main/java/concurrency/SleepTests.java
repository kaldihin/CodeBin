package concurrency;
import java.util.Random;
import java.util.concurrent.*;

public class SleepTests implements Runnable {
    private static int first = 0;
    private final int id = first++;
    @Override
    public void run() {
        int time = 1;
        Random rand = new Random();
        time = rand.nextInt(10) * 1000;
        System.out.println("I am the " + id + " and I am going to sleep till " + time/1000 + " seconds.");
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (Exception e) {
            System.out.println("Exception happened " + e);
        }
        System.out.println("I am " + id + " and I woke up. ))\n");
    }

    public static void main(String[] args) {
        Integer len = Integer.parseInt(args[0]);
        ExecutorService ex = Executors.newSingleThreadExecutor();
        for (int i = 0; i < len; i++)
        ex.execute(new SleepTests());
        ex.shutdown();
    }
}
