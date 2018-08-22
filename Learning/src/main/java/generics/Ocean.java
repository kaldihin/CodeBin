package generics;
import java.util.*;
import net.mindview.util.*;

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish() {}

    @Override
    public String toString() {
        return "LittleFish " + id;
    }
    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;
    private BigFish() {}

    @Override
    public String toString() {
        return "BigFish " + id;
    }
    public static Generator<BigFish> generator = new Generator<BigFish>() {
        @Override
        public BigFish next() {
            return new BigFish();
        }
    };
}

public class Ocean {
    public static void eat(BigFish t, LittleFish c) {
    System.out.println(t + " eats " + c);
}
    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<LittleFish> line = new LinkedList<>();
        Generators.fill(line, LittleFish.generator(), 15);
        List<BigFish> eaters = new ArrayList<>();
        Generators.fill(eaters, BigFish.generator, 4);
        for (LittleFish c : line)
            eat(eaters.get(rand.nextInt(eaters.size())), c);
    }
}