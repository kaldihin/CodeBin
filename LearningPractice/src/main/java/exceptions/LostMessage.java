package exceptions;

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "Very Important Exception!";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "Secondary important exception";
    }
}

class ThirdException extends Exception {
    @Override
    public String toString() {
        return "Third";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void third() throws ThirdException {
        throw new ThirdException();
    }

    public static void main(String[] args) {
        LostMessage lm = new LostMessage();
        try {
            try {
                try {
                    try {
                        lm.f();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } finally {
                    try {
                        lm.dispose();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            } finally {
                try {
                    lm.third();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
