package exceptions;

class FirstException extends Exception {

    public String getMessage() {
        return "Detailed message: " + " " + super.getMessage();
    }
}

class SecondException extends Exception {

    public String getMessage() {
        return "Detailed message: " + " " + super.getMessage();
    }
}

public class TwoExceptions {

    public void first() throws FirstException {
        throw new FirstException();
    }

    public void second() throws SecondException {
        throw new SecondException();
    }

    public static void main(String[] args) {

        TwoExceptions te = new TwoExceptions();

        try {
            te.first();
        } catch (FirstException f) {
            f.printStackTrace(System.out);
        }

        try {
            te.second();
        } catch (SecondException s) {
            s.printStackTrace(System.out);
        }
    }
}
