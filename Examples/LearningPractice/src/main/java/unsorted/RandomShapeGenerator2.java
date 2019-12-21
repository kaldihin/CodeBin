package unsorted;

import java.util.Random;

public class RandomShapeGenerator2 {

    private Random rand = new Random(47);
    public Playable next() {
        switch (rand.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Stringed();
            case 2: return new Percussion();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Moody();
        }
    }
}
