package exceptions;

class SuperException extends RuntimeException {

}

public class TestException {
    public static void f() throws RuntimeException {
        g();
    }

    public static void g() throws RuntimeException {
        throw new SuperException();
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }
    }
}
