import java.io.DataInput;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class God {

    public static void main(String[] args) throws IOException {

        metka:
        {
            for (int i = 0; i < 10; i += 2)
            {
                System.out.println(i);
                if (i == 5)
                    break metka;
            }
            System.out.println("Metka has been entered");
            BigInteger big = BigInteger.valueOf(10);
            BigInteger big2 = BigInteger.valueOf(100000000);

            int[] a = {45,67,23,6,3,31};
            int[] arr = {2,66,77,3,4,6,2,5,4};
            for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
            for (int r : a)
                System.out.println(r + " ");

            System.out.println();

            a = Arrays.copyOf(arr, 4);
            for (int r : a)
                System.out.println(r + " ");

            Date date = new Date();
            long datedata = date.getTime();
            System.out.println(" " + datedata/365);

            LocalDate local = LocalDate.now();
            System.out.println(local.getMonth());


        }

//        String dir = System.getProperty("user.dir");
//        Scanner in = new Scanner(Paths.get("myfile.txt", "UTF-8"));
//        System.out.println(dir);
        System.out.println("I bless You");
    }
}
