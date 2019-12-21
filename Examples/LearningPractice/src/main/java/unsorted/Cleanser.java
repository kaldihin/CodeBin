package unsorted;

public class Cleanser {

    public String s = "unsorted.Cleanser";

    public Cleanser() {

    }

    public void append(String a) {
        s += a;
    }

    public void dilute(String a) {
        append(a);
    }

    public void apply(String a) {
        append(a);
    }

    public void scrub(String a) {
        append(a);
    }

    public void changeS(String a) {
        s = a;
    }

    public String toString() {
        return s;
    }

}