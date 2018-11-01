package unsorted;

class Big {

    void first() {
        System.out.println("First method of class unsorted.Big");
        second();
    }

    void second() {
        System.out.println("Second method of class unsorted.Big");
    }

}

class Bigger extends Big{

    void second() {
        System.out.println("Second method of class unsorted.Bigger");
        super.second();
    }

}

public class Basic {

    public static void main(String[] args) {

        Bigger b = new Bigger();
        b.first();

    }
}
