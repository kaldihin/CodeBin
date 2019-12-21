package unsorted;

import java.util.*;

public class RandomChars {

    private static Random rand = new Random(47);

    public char next() {

        char cc = (char) (rand.nextInt(100));

        return cc;
    }
}
