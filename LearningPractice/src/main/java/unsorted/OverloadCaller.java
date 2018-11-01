package unsorted;

public class OverloadCaller {

    public static void main(String[] args) {

        Overloaded o = new Overloaded();
        Overload o1 = new Overload();

        o.debil("DEBIL");
        o.debil(2);
        o.debil(2.1);
        o.debil(o1);
    }
}
