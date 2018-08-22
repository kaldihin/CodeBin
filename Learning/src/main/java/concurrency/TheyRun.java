package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TheyRun implements Runnable {
    @Override
    public synchronized void run() {
            try {
                this.wait();
                System.out.println("Notified");
            } catch (Exception e) {
                System.out.println("Exc");
            }
    }

    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        TheyRun tr1 = new TheyRun();
        Saver sa = new Saver(tr1);
        ex.execute(tr1);
        ex.execute(sa);
        ex.shutdown();
    }
}

class Saver implements Runnable {
    private final TheyRun obj;
    public Saver(TheyRun o) {
        obj = o;
    }
    @Override
    public void run() {
        synchronized (obj) {
            try {
                System.out.println("Going to sleep for 3 seconds");
                TimeUnit.SECONDS.sleep(3);
                obj.notifyAll();
            } catch (Exception e) {
                System.out.println("Exce");
            }
        }
    }
}