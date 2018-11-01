package arrays;

import java.util.Arrays;

public class ThreeDimensionTestBeryllium {
    public static BerylliumSphere[][][] creator(int b, int e, int a) {
        BerylliumSphere[][][] ad = new BerylliumSphere[b][e][a];
        for (int i = 0; i < b; i++)
            for (int j = 0; j < e; j++)
                for (int k = 0; k < a; k++)
                ad[i][j][k] = new BerylliumSphere();
        return ad;
    }
    public static void viewer(BerylliumSphere[][][] d) {
        System.out.println(Arrays.deepToString(d));
    }

    public static void main(String[] args) {
        viewer(creator(5,6, 8));
        BerylliumSphere[][][] ab = creator(5,6, 8);
        BerylliumSphere[][][] ba = new BerylliumSphere[10][10][10];
        System.arraycopy(ab, 0, ba, 0, ab.length);
        System.out.println("ab = " + Arrays.deepToString(ab));
        System.out.println("ba = " + Arrays.deepToString(ba));
        System.out.println();
        viewer(creator(5,2, 3));
    }
}
