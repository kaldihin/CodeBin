package unsorted;

import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape> {
    int amount;

    RandomShapeGenerator(int a) {
        amount = a;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            @Override
            public boolean hasNext() {
                --amount;
                return amount != 0;
            }

            @Override
            public Shape next() {
                return nextShape();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    private Random rand = new Random(47);

    public Shape nextShape() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
