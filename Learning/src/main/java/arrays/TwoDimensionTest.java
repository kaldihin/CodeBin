package arrays;

import java.util.Arrays;

public class TwoDimensionTest {
    public static BerylliumSphere[][] creator(int b, int e) {
        BerylliumSphere[][] ad = new BerylliumSphere[b][e];
        for (int i = 0; i < b; i++)
            for (int j = 0; j < e; j++)
                ad[i][j] = new BerylliumSphere();
        return ad;
    }
    public static void viewer(BerylliumSphere[][] d) {
        System.out.println(Arrays.deepToString(d));
    }

    public static void main(String[] args) {
        viewer(creator(5,6));
        System.out.println();
        viewer(creator(5,2));
    }
}
