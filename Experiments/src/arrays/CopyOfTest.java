package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * In this program is shown how to use reflection for
 * manipulation with arrays
 */

public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a,10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        Scanner in = new Scanner(System.in);
        int a1,b1;

        while (in.hasNext()) {
            a1 = in.nextInt();
            b1 = in.nextInt();
            compp(a1, b1);
        }

//        System.out.println("The following call will generate an exception");
//
//        b = (String[]) badCopyOf(b, 10);
    }

    /**
     * In this method is undertaken an attempt to grow an array
     * by assignment a new array and copying into it all former
     * elements
     * Stackable array
     * @param newLength New length of an array
     * @return Returned stackable array, contained all elements
     * of array a, but he applies to Object[] type,
     * not the type of a
     */
    public static Object[] badCopyOf(Object[] a, int newLength) {
        // Useless
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * This method builds up an array, emitting a new array
     * the same type and copying into it all former elements
     * Stackable array. Can be an array of objects
     * or an array of primitive types
     * @return Returned stackable array, contained all
     * elements of array a
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray())
            return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }

    public static void compp(int a, int b) {

        if (Integer.compare(a,b) < 0)
            System.out.println("a < b");
        else if (Integer.compare(a, b) == 0)
            System.out.println("a = b");
        else System.out.println("a > b");
    }
}
