package stackTrace;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * In this program is demonstrated tracing stack of calls
 * at the recursive method
 */

public class StackTraceTest {
    /**
     * Computes factorial of adjusted number
     * @param n Positive integer number
     * @return n! = 1 * 2 * ... * n
     */
    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement f : frames)
            System.out.println(f);
        int r;
        if (n <= 1)
            r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Logger myLogger = Logger.getLogger(StackTraceTest.class.getName());

        System.out.print("Enter n: ");
        int n = in.nextInt();
        if (n > 10)
            myLogger.log(Level.WARNING, "He is entering something incredible");
        else
        factorial(n);
        myLogger.config("config message");
        myLogger.fine("fine message");
        myLogger.finer("finer message");
        myLogger.finest("finest message");
        myLogger.info("info message");
        myLogger.severe("severe message");
        myLogger.warning("warning message");
    }
}
