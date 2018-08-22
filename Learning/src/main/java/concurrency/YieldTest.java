package concurrency;

public class YieldTest implements Runnable {
    public YieldTest() {
        System.out.println("I am running in Constructor");
    }
    @Override
    public void run() {
        System.out.println("I am running");
        Thread.yield();
        screamer();
    }
    public void screamer() {
        System.out.println("AAAAAAA");
    }
}

class Thripper {
    public static void main(String[] args) {
        YieldTest y = new YieldTest();
        y.run();
        y.run();
        y.run();
        System.out.println("End of work");
    }
}
