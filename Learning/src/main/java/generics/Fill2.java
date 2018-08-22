package generics;
import generics.coffee.*;
import java.util.*;
import net.mindview.util.*;
import typeinfo.pets.*;
import static net.mindview.util.Print.*;

interface Addable<T> {
    void add(T t);
}

public class Fill2 {
    public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++)
            try {
            addable.add(classToken.newInstance());
            } catch (Exception e) {
            throw new RuntimeException(e);
            }
    }
    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
        for (int i = 0; i < size; i++)
            addable.add(generator.next());
    }
}

class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }
    public void add(T item) {
        c.add(item);
    }
}

class Adapter {
    public static <T> Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<>(c);
    }
}

class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
    @Override
    public void add(T item) {
        super.add(item);
    }
}

class Fill2Test {
    public static void main(String[] args) {
        List<Pet> carrier = new ArrayList<>();
        Fill2.fill(new AddableCollectionAdapter<Pet>(carrier), Pet.class, 3);
        Fill2.fill(Adapter.collectionAdapter(carrier), Dog.class, 2);
        for (Pet c : carrier)
            System.out.println(c.getClass().getSimpleName());
        System.out.println("-------------------------");
        AddableSimpleQueue<Pet> coffeeQueue = new AddableSimpleQueue<>();
        Fill2.fill(coffeeQueue, Rodent.class, 4);
        Fill2.fill(coffeeQueue, Mouse.class, 1);
        for (Pet c : coffeeQueue)
            System.out.println(c.getClass().getSimpleName());
    }
}