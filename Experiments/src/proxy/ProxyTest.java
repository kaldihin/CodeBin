package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * In this program is demonstrated using of proxy-objects
 */

public class ProxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];

        // Fill the array elements with proxy-objects
        // of integer numbers in range from 1 to 1000
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            InvocationHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(null, new Class[] {Comparable.class}, handler);
            elements[i] = proxy;
        }

        // Form a random integer number
        Integer key = new Random().nextInt(elements.length) + 1;

        // Run search by criteria key
        int result = Arrays.binarySearch(elements, key);

        // Display matching element, if it's found
        if (result >= 0)
            System.out.println(elements[result]);
    }
}

/**
 * Call handler, displaying firstly the name of method and his
 * parameters, and then calling the source method
 */
class TraceHandler implements InvocationHandler {
    private Object target;

    /**
     * Constructs objects of type TraceHandler
     * @param t implicit parameter of calling method
     */
    public TraceHandler(Object t) {
        target = t;
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        // Display the implicit parameter
        System.out.print(target);
        // Display the name of method
        System.out.print("." + m.getName() + "(");

        // Display explicit parameters
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1)
                    System.out.print(", ");
            }
        }
        System.out.println(")");

        // Call concrete method
        return m.invoke(target, args);
    }
}
