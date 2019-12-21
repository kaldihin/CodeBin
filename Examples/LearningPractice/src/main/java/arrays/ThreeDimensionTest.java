package arrays;

import java.util.Arrays;

public class ThreeDimensionTest {
    public static double[][][] creator(int b, int e, int a) {
        double[][][] ad = new double[b][e][a];
        for (int i = 0; i < b; i++)
            for (int j = 0; j < e; j++)
                for (int k = 0; k < a; k++)
                ad[i][j][k] = k;
        return ad;
    }
    public static void viewer(double[][][] d) {
        System.out.println(Arrays.deepToString(d));
    }

    public static void main(String[] args) {
        viewer(creator(5,6, 7));
        System.out.println();
        viewer(creator(5,2, 9));
        Double[][] da = new Double[3][3];
        System.out.println(Arrays.deepToString(da));
    }
}
