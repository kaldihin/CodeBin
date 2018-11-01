package holding;

import typeinfo.pets.*;
import java.util.*;

class PetSequence {
    protected Pet[] pets = new Pet[]{new Cat(), new Dog(), new Mouse(),
            new Manx(), new Mutt(), new Dog(), new Mutt(), new Cat()};
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVSIterator.display(nc.iterator());
        System.out.println();
        System.out.println();


        for (Pet s : nc.reversed())
            System.out.print(s + " ");
        System.out.println();
        System.out.println();

        for (Pet s : nc.randomized())
            System.out.print(s + " ");
        System.out.println();
        System.out.println();

        for (Pet s : nc)
            System.out.print(s + " ");
    }
}
