package innerclasses;

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("In the Ex initializator");
            }

            @Override
            public void f() {
                System.out.println("Anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}