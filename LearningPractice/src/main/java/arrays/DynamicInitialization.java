package arrays;

import java.util.Arrays;

public class DynamicInitialization {
    public static BerylliumSphere[] berylliumSphereMaker(int n) {
        BerylliumSphere[] b = new BerylliumSphere[n];
        for (int i = 0; i < n; i++)
        b[i] = new BerylliumSphere();
        return b;
    }
    public static void getter(BerylliumSphere[] b) {
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        BerylliumSphere[] a;
        BerylliumSphere[] a1 = new BerylliumSphere[5];
        getter(a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()});
        getter(a1);
        System.out.println(Arrays.toString(berylliumSphereMaker(5)));
    }
}
