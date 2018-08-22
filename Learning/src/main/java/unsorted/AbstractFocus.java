package unsorted;

abstract class Focus {

    Focus() {
    }

    void tuuu() {
        System.out.println("tuuu");
    }

}

class FocusSon extends Focus {

    FocusSon() {
        print();
    }

    void print() {
        System.out.println("Constructed unsorted.FocusSon and called print()");
        fo(new Focus() {
        });
    }

    public static void fo(Focus focus) {
        System.out.println("In fo()");
    }
}

public class AbstractFocus {

    public static void main(String[] args) {

        FocusSon f = new FocusSon();
        f.tuuu();

    }

}
