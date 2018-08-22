package strings;

import java.util.*;

public class TypesParser {
    private static int i = 1;
    private static long l = 2;
    private static float f = 3;
    private static double d = 5;
    private static String str = " ";

    private void parserInt() {
        Scanner sc = new Scanner(str);
        while (sc.hasNext()) {
            if (sc.hasNextInt())
                i = sc.nextInt();
            else sc.next();
        }
    }

    private void parserDouble() {
        Scanner sc = new Scanner(str);
        while (sc.hasNext()) {
            if (sc.hasNextDouble())
                d = sc.nextDouble();
            else sc.next();
        }
    }

    private void parserFloat() {
        Scanner sc = new Scanner(str);
        while (sc.hasNext()) {
            if (sc.hasNextFloat())
                f = sc.nextFloat();
            else sc.next();
        }
    }

    private void parserLong() {
        Scanner sc = new Scanner(str);
        while (sc.hasNext()) {
            if (sc.hasNextLong())
                l = sc.nextLong();
            else sc.next();
        }
    }

    TypesParser(String s) {
        str = s;
            parserInt();
            parserDouble();
            parserFloat();
            parserLong();
        }


    public static void main(String[] args) {

        new TypesParser("Sir 22 Robin of Camelot 35184372088832 34,8754643754");
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(str);
    }
}
