package exceptions;

class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String s) {
        super(s);
    }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("Creating exception in f()");
        throw new OneException(" from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Catched in the inside block try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from the inside block try");
            }
        } catch (TwoException e) {
            System.out.println("Catched in the outside block try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
