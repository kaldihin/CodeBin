package generics;
import java.util.*;
import net.mindview.util.*;

class Box {
    private final int id;
    private String description;
    private double price;
    public Box(int IDnumber, String descr, double price) {
        id = IDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: $" + price;
    }
    public void priceChange(double change) {
        price += change;
    }
    public static Generator<Box> generator = new Generator<Box>() {
        private Random rand = new Random(47);                   //Product = Box
        @Override
        public Box next() {
            return new Box(rand.nextInt(1000), "Cars",
                    Math.round(rand.nextDouble() * 5000.0) + 0.99);
        }
    };
}

class Level extends ArrayList<Box> {            //Shelf = Level
    public Level(int nBox) {
        Generators.fill(this, Box.generator, nBox);
    }
}

class Row extends ArrayList<Level> {             //Aisle = Row
    public Row(int nShelves, int nBox) {
        for (int i = 0; i < nShelves; i++);
        add(new Level(nBox));
    }
}

class CheckoutLevel {}          //CheckoutStand = CheckoutLevel
class ControlRoom {}            //Office = ControlRoom

public class ContainerShip extends ArrayList<Row> {
    private ArrayList<CheckoutLevel> checkouts = new ArrayList<>();
    private ControlRoom office = new ControlRoom();
    public ContainerShip(int nAisles, int nShelves, int nBox) {
        for (int i = 0; i < nAisles; i++)
            add(new Row(nShelves, nBox));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Row a : this)
            for (Level s : a)
                for (Box p : s) {
                    result.append(p);
                    result.append("\n");
                }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ContainerShip(14, 5, 10));
    }
}