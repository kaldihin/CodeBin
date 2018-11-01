package strings;

import java.util.Random;

public class Hu {
    public static void main(String[] args) {
        int n = 4, m = 5;
        double[][] d = new double[m][n];
        Random random;

        for (int j = 0; j < m; j++)
        for (int i = 0; i < n; i++) {
            random = new Random();
            d[j][i] = random.nextDouble();
            //while (d[j][i] > 0.2)
               // d[j][i] -= 0.088346;
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++)
                System.out.format("%.5f ", d[j][i]);
            System.out.println();
        }
    }
}
