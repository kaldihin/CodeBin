package exceptions;

class BasicException extends Exception {
    BasicException() throws BasicException {
        throw new BasicException();
    }
}

public class ExceptionConstructors {
    ExceptionConstructors() throws Exception {}
    public static void main(String[] args) {
        try {
            ExceptionConstructors ex = new ExceptionConstructors();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
