package concurrency;
import java.util.concurrent.*;
import java.util.*;

class Toast {
    public enum Status {
        DRY, BUTTERED, JAMMED, PEANUTTED, JELLY
    }
    private Status status = Status.DRY;
    private final int id;
    public Toast(int idn) {
        id = idn;
    }
    public void butter() {
        status = Status.BUTTERED;
    }
    public void jam() {
        status = Status.JAMMED;
    }
    public void peanut() {
        status = Status.PEANUTTED;
    }
    public void jelly() {
        status = Status.JELLY;
    }
    public Status getStatus() {
        return status;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Toast " + id + ": " + status;
    }
}

class ToastQueue extends LinkedBlockingQueue<Toast> {}

class Toaster implements Runnable {
    private ToastQueue toastQueue;
    private int count = 0;
    private Random rand = new Random(47);
    public Toaster(ToastQueue tq) {
        toastQueue = tq;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(100 + rand.nextInt(500));
                Toast t = new Toast(count++);
                System.out.println(t);
                toastQueue.put(t);
            }
        } catch (InterruptedException e) {
            System.out.println("Toaster interrupted");
        }
        System.out.println("Toaster off");
    }
}

class Butterer implements Runnable {
    private ToastQueue dryQueue, butteredQueue;
    public Butterer(ToastQueue dry, ToastQueue buttered) {
        dryQueue = dry;
        butteredQueue = buttered;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = dryQueue.take();
                t.butter();
                System.out.println(t);
                butteredQueue.put(t);
            }
        } catch (InterruptedException e) {
            System.out.println("Butterer interrupted");
        }
        System.out.println("Butterer off");
    }
}

class Jammer implements Runnable {
    private ToastQueue butteredQueue, finishedQueue;
    public Jammer(ToastQueue buttered, ToastQueue finished) {
        butteredQueue = buttered;
        finishedQueue = finished;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = butteredQueue.take();
                t.jam();
                System.out.println(t);
                finishedQueue.put(t);
            }
        } catch (InterruptedException e) {
            System.out.println("Jammer interrupted");
        }
        System.out.println("Jammer off");
    }
}

class Peanutter implements Runnable {
    private ToastQueue dryQueueP, finishedQueueP;
    public Peanutter(ToastQueue dry, ToastQueue finished) {
        dryQueueP = dry;
        finishedQueueP = finished;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = dryQueueP.take();
                t.peanut();
                System.out.println(t);
                finishedQueueP.put(t);
            }
        } catch (InterruptedException e) {
            System.out.println("Peanutter interrupted");
        }
        System.out.println("Peanutter off");
    }
}

class Jellier implements Runnable {
    private ToastQueue dryQueueJ, finishedQueueJ;
    public Jellier(ToastQueue dry, ToastQueue finished) {
        dryQueueJ = dry;
        finishedQueueJ = finished;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = dryQueueJ.take();
                t.jelly();
                System.out.println(t);
                finishedQueueJ.put(t);
            }
        } catch (InterruptedException e) {
            System.out.println("Jellier interrupted");
        }
        System.out.println("Jellier off");
    }
}

class Eater implements Runnable {
    private ToastQueue finishedQueue;
    private int counter = 0;
    public Eater(ToastQueue finished) {
        finishedQueue = finished;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = finishedQueue.take();
                if (t.getId() != counter++ || t.getStatus() != Toast.Status.JAMMED) {
                    System.out.println(">>>> Error: " + t);
                    System.exit(1);
                } else System.out.println("Chomp! " + t);
            }
        } catch (InterruptedException e) {
            System.out.println("Eater interrupted");
        }
        System.out.println("Eater off");
    }
}

public class ToastOMatic {
    public static void main(String[] args) throws Exception {
        ToastQueue dryQueue = new ToastQueue(),
                butteredQueue = new ToastQueue(),
                finishedQueue = new ToastQueue();
        ToastQueue dryQueueP = new ToastQueue(),
                finishedQueueP = new ToastQueue();
        ToastQueue dryQueueJ = new ToastQueue(),
                finishedQueueJ = new ToastQueue();
        List<Toast> every = new ArrayList<>();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Toaster(dryQueue));
        exec.execute(new Butterer(dryQueue, butteredQueue));
        exec.execute(new Jammer(butteredQueue, finishedQueue));
        exec.execute(new Eater(finishedQueue));
        exec.execute(new Toaster(dryQueueP));
        exec.execute(new Peanutter(dryQueueP, finishedQueueP));
        exec.execute(new Toaster(dryQueueJ));
        exec.execute(new Jellier(dryQueueJ, finishedQueueJ));
        TimeUnit.SECONDS.sleep(5);
        System.out.println(every);
        exec.shutdownNow();
    }
}
