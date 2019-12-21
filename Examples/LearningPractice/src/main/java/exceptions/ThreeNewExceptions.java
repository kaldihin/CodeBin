package exceptions;

class Exception1 extends Exception {
    Exception1() {
        System.out.println("Exception1");
    }
}

class Exception2 extends Exception {
    Exception2() {
        System.out.println("Exception2");
    }
}

class Exception3 extends Exception {
    Exception3() {
        System.out.println("Exception3");
    }
}

public class ThreeNewExceptions {
    private static int i = 0;
    public void exceptionExciter() throws Exception {
        ++i;
        switch (i) {
            case 1: throw new Exception1();
            case 2: throw new Exception2();
            case 3: throw new Exception3();
            default: break;
        }

    }

    public static void main(String[] args) {
        ThreeNewExceptions t = new ThreeNewExceptions();
        try {
            throw new NullPointerException();
            //t.exceptionExciter();
        }  catch (Exception e1) {
            System.out.println(e1);
        } finally {
            System.out.println("Finally");
        }

        try {
            t.exceptionExciter();
        } catch (Exception e1) {
            System.out.println(e1);
        }

        try {
            t.exceptionExciter();
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }
}
