package unsorted;

import java.util.*;

interface Rodent {

    static long counter = 0;

    void gnaw();

    void squeak();

    void running();

    void dest();

}

class Mouse implements Rodent {

    private static long counter = 0;
    private final long id = counter++;

    public Mouse() {
        System.out.println("Создаём " + this);
    }

    @Override public void gnaw() {
        System.out.println("Mouses chr chr");
    }

    public void squeak() {
        System.out.println("Mouses pii pii");
    }

    public void running() {
        System.out.println("Mouses trrrrr");
    }

    public void dest() {
        System.out.println("Destructed " + this);
    }

    @Override
    public String toString() {
        return "unsorted.Mouse";
    }
}

class Hamster implements Rodent {

    Hamster() {
        System.out.println("unsorted.Hamster Constructed");
    }

    public void gnaw() {
        System.out.println("unsorted.Hamster chr chr");
    }

    public void squeak() {
        System.out.println("unsorted.Hamster pii pii");
    }

    public void running() {
        System.out.println("unsorted.Hamster trrrrr");
    }

    public void dest() {
        System.out.println("Destructed from unsorted.Hamster");
    }

    @Override
    public String toString() {
        return "unsorted.Hamster";
    }
}

class Suslik implements Rodent {

    Suslik() {
        System.out.println("unsorted.Suslik Constructed");
    }

    public void gnaw() {
        System.out.println("unsorted.Suslik chr chr");
    }

    public void squeak() {
        System.out.println("unsorted.Suslik pii pii");
    }

    public void running() {
        System.out.println("unsorted.Suslik trrrrr");
    }

    public void dest() {
        System.out.println("Destructed from unsorted.Suslik");
    }

    @Override
    public String toString() {
        return "unsorted.Suslik";
    }
}

public class TheRodents {

    public static void main(String[] args) {

        RandomShapeGenerator3 gen3 = new RandomShapeGenerator3();
        Collection<Rodent> rod = new ArrayList<>();
        Iterator<Rodent> itera = rod.iterator();

        for (int i = 0; i < 10; i++) {
            rod.add(gen3.next());
        }

        for (Rodent r : rod) {
            r.gnaw();
            r.squeak();
            r.running();
        }

        for (Rodent r : rod) {
            r.dest();
        }

        //for (unsorted.Rodent r : rod)
          //  System.out.println(r.getClass());


        while (itera.hasNext()) {
            System.out.println(rod);
            itera.next();
        }
    }
}


