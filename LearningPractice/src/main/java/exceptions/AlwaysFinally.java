package exceptions;

class FourException extends Exception {

}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering the first block try");
        try {
            System.out.println("Entering the second block try");
            try {
                throw new FourException();
            } finally {
                System.out.println("Finally in the second block try");
            }
        } catch (FourException e) {
            System.out.println("Catched FourException in the first block try");
        } finally {
            System.out.println("finally in the first block try");
        }
    }
}
