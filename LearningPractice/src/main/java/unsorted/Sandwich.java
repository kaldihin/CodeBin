package unsorted;

interface Fastfood {

    void getIngredient();

}

class Meal {

    Meal() {
        System.out.println("unsorted.Meal Constructed");
    }

}

class Bread extends Meal{

    Bread() {
        System.out.println("unsorted.Bread Constructed");
    }

}

class Cheese extends Bread{

    Cheese() {
        System.out.println("unsorted.Cheese Constructed");
    }

}

class Lettuce extends Cheese{

    Lettuce() {
        System.out.println("unsorted.Lettuce Constructed");
    }

}

class Lunch extends Lettuce implements Fastfood{

    Lunch() {
        System.out.println("unsorted.Lunch Constructed");
        getIngredient();
    }

    @Override
    public void getIngredient() {
        System.out.println("getIngredient() Initiated");
    }
}

class PortableLunch extends Lunch implements Fastfood{

    PortableLunch() {
        System.out.println("unsorted.PortableLunch Constructed");
        getIngredient();
    }

}

class Pickle extends PortableLunch implements Fastfood{

    Pickle() {
        System.out.println("unsorted.Pickle Constructed");
        getIngredient();
    }

}

public class Sandwich implements Fastfood{

    public Sandwich() {
        System.out.println("unsorted.Sandwich Constructed");
    }

    public static void main(String[] args) {
        Pickle p = new Pickle();
    }

    @Override
    public void getIngredient() {

    }
}
