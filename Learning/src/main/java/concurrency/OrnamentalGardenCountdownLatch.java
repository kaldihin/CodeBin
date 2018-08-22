package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Count1 {
    private int count = 0;
    private Random rand = new Random(47);
    public synchronized int increment() {
        int temp = count;
        if (rand.nextBoolean())
            Thread.yield();
        return (count = ++temp);
    }
    public synchronized int value() {
        return count;
    }
}

class Entrance1 implements Runnable {
    private static Count1 count = new Count1();
    private static List<Entrance1> entrances = new ArrayList<>();
    private int number = 0;
    private final int id;
    private final CountDownLatch lat;
    public Entrance1(int id, CountDownLatch lat) {
        this.id = id;
        this.lat = lat;
        entrances.add(this);
    }

    @Override
    public void run() {
        try {
            while (lat.getCount() != 0) {
                doWorks();
                lat.countDown();
            }
        }
        catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }

    }

    public void doWorks() throws InterruptedException {
        ++number;
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(this + " Total: " + count.increment());
    }

    public synchronized int getValue() {
        return number;
    }

    @Override
    public String toString() {
        return "Entrance1 " + id + ": " + getValue();
    }
    public static int getTotalCount() {
        return count.value();
    }
    public static int sumEntrances() {
        int sum = 0;
        for (Entrance1 entrance : entrances)
            sum += entrance.getValue();
        return sum;
    }
}

public class OrnamentalGardenCountdownLatch {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        final int SIZE = 100;
        CountDownLatch lat = new CountDownLatch(SIZE);
        for (int i = 0; i < 5; i++)
            exec.execute(new Entrance1(i, lat));
        lat.await();
        exec.shutdownNow();
        System.out.println("Total: " + Entrance1.getTotalCount());
        System.out.println("Sum of Entrances: " + Entrance1.sumEntrances());
    }
}