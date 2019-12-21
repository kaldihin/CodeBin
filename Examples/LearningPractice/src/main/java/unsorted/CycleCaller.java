package unsorted;

public class CycleCaller {

    public static void createCycle(CycleFactory factory) {

        Cycle cc = factory.getName();

    }

    public static void main(String[] args) {

        createCycle(new UniCycleFactory());
        createCycle(new BiCycleFactory());
        createCycle(new TriCycleFactory());

    }

    int wheels(int i) {

        return i;

    }

}

interface Cycle {

    void ride(String n, int w);
    Cycle getName();

}

interface CycleFactory {

    void ride(String n, int w);

    Cycle getName();

}

class UniCycleFactory implements CycleFactory {

    @Override
    public void ride(String n, int w) {

    }

    @Override
    public Cycle getName() {
        System.out.println("unsorted.Unicycle");
        return new Unicycle();
    }

}

class BiCycleFactory implements CycleFactory {

    @Override
    public void ride(String n, int w) {

    }

    @Override
    public Cycle getName() {
        System.out.println("unsorted.Bicycle");
        return new Bicycle();
    }

}

class TriCycleFactory implements CycleFactory {

    @Override
    public void ride(String n, int w) {

    }

    @Override
    public Cycle getName() {
        System.out.println("unsorted.Tricycle");
        return new Tricycle();
    }

}

class Unicycle implements Cycle {

    private int numberOfWheels = 1;
    private String name = "unsorted.Unicycle";

    @Override
    public void ride(String name, int numberOfWheels) {
        System.out.println(name + " has " + numberOfWheels + " wheel");
    }

    @Override
    public Cycle getName() {
        return null;
    }

    Unicycle() {
        //System.out.println("unsorted.Unicycle Constructor");
        ride(name,numberOfWheels);
        balance();
    }

    void balance() {
        System.out.println("Balance in unsorted.Unicycle");
    }

}

class Bicycle implements Cycle {

    private int numberOfWheels = 2;

    public Cycle getName() {

        return null;
    }

    public void ride(String s, int i) {

    }

    Bicycle() {
        //System.out.println("unsorted.Bicycle Constructor");
        ride("unsorted.Bicycle", numberOfWheels);
    }

    void balance() {
        System.out.println("Balance in unsorted.Bicycle");
    }

}

class Tricycle implements Cycle {

    private int numberOfWheels = 3;

    public Cycle getName() {

        return null;
    }

    public void ride(String s, int i) {

    }

    Tricycle() {
        //System.out.println("unsorted.Tricycle Constructor");
        ride("unsorted.Tricycle", numberOfWheels);
    }

    void balance() {
        System.out.println("Balance in unsorted.Tricycle");
    }

}
