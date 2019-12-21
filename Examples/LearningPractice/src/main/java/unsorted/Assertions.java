package unsorted;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Assertions {
    public static void main(String[] args) {
        methodAssert(4);
//        Scanner in = new Scanner(System.in);
//        int k = in.nextInt();
//        int n = in.nextInt();
        BigInteger bi = BigInteger.valueOf(66535888);
        BigInteger bi2 = BigInteger.valueOf(66535888);
//        for (int i = 1; i <= k; i++)
//            bi = bi.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        System.out.println(bi.multiply(bi2).multiply(bi).multiply(bi2).multiply(bi).multiply(bi).multiply(bi));
        LocalDate ld = LocalDate.now();
        System.out.println(ld.plusDays(6));
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        gc.add(Calendar.DAY_OF_WEEK, 3);
        System.out.println();
        ArrayList<Integer> ar = new ArrayList<>(6);
        System.out.println(ar);
        ar.ensureCapacity(5);
        System.out.println(ar);
        Thread ss = new Thread() {
            @Override
            public void run() {

            }
            public void intrah() {
                System.out.println("suk");
            }
        };
//        Logger.getGlobal().info("fhf");
//        Logger.getGlobal().setLevel(Level.OFF);
//        Logger.getGlobal().setLevel(Level.WARNING);
        Logger logger = Logger.getLogger("He");
//        logger.warning("Fuck");
        logger.log(Level.FINE, "Fuuuck");
// metka:
//        if (n > 5)
//            System.out.println("more");
//        else {
//            n -= 10;
//            break metka;
//        }
    }
    static void methodAssert(int a) {
//        assert (a > 0);
//        String s = "ytu";
//        s = s.intern();

//        Scanner in = new Scanner(System.in);
//        s = in.nextLine();
//        int nn = in.nextInt();
//        s = s.concat("tr");
//        byte[] ch = s.getBytes();
//        for (byte b : ch)
//            if (b == 'a')
//                System.out.println("Yes it has it");
//        File t = new File("rt.txt");
//        FileWriter fw = new FileWriter(t);
//        fw.write(s);
//        fw.close();
//        System.out.println("Yes" + s);
    }
}
