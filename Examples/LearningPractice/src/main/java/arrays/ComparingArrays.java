package arrays;
import java.util.*;

class Massiv1 {
    private int pole;
    int[] ar = new int[pole];
    Massiv1(int p) {
        pole = p;
        Arrays.fill(ar, pole);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
public class ComparingArrays {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1, 47);
        Arrays.fill(a2, 47);
        System.out.println(Arrays.equals(a1, a2));
        a2[3] = 11;
        System.out.println(Arrays.equals(a1, a2));
        String[] s1 = new String[4];
        Arrays.fill(s1, "Hi");
        String[] s2 = {new String("Hi"), new String("Hi"),
                new String("Hi"), new String("Hi")};
        System.out.println(Arrays.equals(s1, s2));
        Massiv1[] m1 = {new Massiv1(5), new Massiv1(4)};
        Massiv1[] m2 = {new Massiv1(5), new Massiv1(4)};
        System.out.println(Arrays.equals(m1, m2));
        int[][] ari = new int[4][4];
        for (int[] row : ari)
        Arrays.fill(row, 67);
        int[][] ari2 = new int[4][4];
        for (int[] row : ari2)
        Arrays.fill(row, 67);
        System.out.println(Arrays.deepEquals(ari, ari2));
    }
}
