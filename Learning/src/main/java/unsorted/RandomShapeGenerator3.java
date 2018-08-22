package unsorted;

import java.util.Random;

public class RandomShapeGenerator3 {

    private Random rand = new Random(47);
    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
            case 2: return new Suslik();
        }
    }
}
