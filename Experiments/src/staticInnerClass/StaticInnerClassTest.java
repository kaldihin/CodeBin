package staticInnerClass;

/**
 * In this program is demonstrated using of a static inner class
 */

public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}

class ArrayAlg {

    /**
     * Pair of numbers with floating point
     */
    public static class Pair {
        private double first;
        private double second;

        /**
         * Makes up a pair of two numbers with a floating point
         * @param f first number
         * @param s second number
         */
        public Pair(double f, double s) {
            first = f;
            second = s;
        }

        /**
         * Returns the first number from a pair
         * @return Return first number
         */
        public double getFirst() {
            return first;
        }

        /**
         * Returns the second number from a pair
         * @return Return of a second number
         */
        public double getSecond() {
            return second;
        }
    }

    /**
     * Defines the minimal and maximum numbers in an array
     * @param values Array of numbers with a floating point
     * @return Pair, first element of which is the minimal number,
     * and the second element - is an maximum number
     */
    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}
