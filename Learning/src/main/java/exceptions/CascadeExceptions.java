package exceptions;

class A extends Exception {
    public void aMethod() throws A {
        throw new A();
    }
}

class B extends A {
    public void aMethod() throws B {
        throw new B();
    }
}

class C extends B {
    public void aMethod() throws C {
        throw new C();
    }
}

public class CascadeExceptions {
    public static void main(String[] args) {
        A c = new C();
        A a = new A();
        B b = new B();

        try {
            c.aMethod();
        } catch (C e) {
            System.out.println("Exception C");
        } catch (B e) {
            System.out.println("Exception B");
        } catch (A e) {
            System.out.println("Exception A");
        }

        try {
            a.aMethod();
        } catch (C e) {
            System.out.println("Exception C");
        } catch (B e) {
            System.out.println("Exception B");
        } catch (A e) {
            System.out.println("Exception A");
        }

        try {
            b.aMethod();
        } catch (C e) {
            System.out.println("Exception C");
        } catch (B e) {
            System.out.println("Exception B");
        } catch (A e) {
            System.out.println("Exception A");
        }
    }
}
