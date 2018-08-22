package unsorted;

public class Stem extends Root {

    Stem(int a) {
        super(a);
        System.out.println("unsorted.Stem Initiated " + a);
    }

    void dispose() {
        System.out.println("Breaked in unsorted.Stem");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem s = new Stem(5);
        s.c1.splash();
        s.c2.splash();
        s.c3.splash();
        s.dispose();
    }
}
