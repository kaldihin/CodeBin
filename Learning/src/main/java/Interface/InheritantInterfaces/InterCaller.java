package Interface.InheritantInterfaces;

interface First {

    void first();

    int firstNum();

    int JAN = 18;
}

interface Second {

    void second();

    int secondNum();
}

interface Third {

    void third();

    int thirdNum();
}

interface General extends First, Second, Third {

    void generalMethod();
}

abstract class Abby {

    void abby() {
        System.out.println("abby!");
    }
}

public class InterCaller extends Abby implements General {

    @Override
    public void generalMethod() {
        System.out.println("general!");
    }

    @Override
    public void third() {
        System.out.println("third!");
    }

    @Override
    public int thirdNum() {
        return 3;
    }

    @Override
    public void second() {
        System.out.println("second!");
    }

    @Override
    public int secondNum() {
        return 2;
    }

    @Override
    public void first() {
        System.out.println("first!");
    }

    @Override
    public int firstNum() {
        return 1;
    }

    static void a(First a) {
        a.first();
        System.out.println(a.firstNum());
    }

    static void b(Second b) {
        b.second();
        System.out.println(b.secondNum());
    }

    static void c(Third c) {
        c.third();
        System.out.println(c.thirdNum());
    }

    static void d(General d) {
        d.generalMethod();
    }

    public static void main(String[] args) {
        InterCaller i = new InterCaller();

        System.out.println(JAN);

        a(i);
        b(i);
        c(i);
        d(i);
        i.abby();
    }
}
