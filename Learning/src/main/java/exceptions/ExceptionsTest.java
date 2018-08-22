package exceptions;

class CallException extends Exception {
    CallException() {}

    CallException(String s) {
        super(s);
    }
}

public class ExceptionsTest {
    public static void main(String[] args) {
        int count = 1;

        try {
            if (count == 1)
                throw new CallException();
        } catch (CallException c) {
            System.out.println(c);
        } finally {
            System.out.println("Final catch");
        }

        count++;

        try {
            if (count == 2)
                throw new CallException("Its crazy");
        } catch (CallException cc) {
            System.out.println(cc);
        } finally {
            System.out.println("Final catch of cc");
        }
    }
}
