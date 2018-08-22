package unsorted;

public class Frog extends Amphibian {

    Frog() {
        System.out.println("unsorted.Frog constructor");
    }

    @Override void bork() {
        System.out.println("New Boooork!!!");
    }

    public static void main(String[] args) {

        Frog f = new Frog();


        try {
            f.crack();
            f.bork();
            Amphibian a = f;
            a.crack();
            a.bork();
        } finally {
            System.out.println("Finally");
        }


    }

}
