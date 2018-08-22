package exceptions;

class Exciter {
    public void exciter() throws NullPointerExceptionsCatcher {
        throw new NullPointerExceptionsCatcher();
    }
}

public class NullPointerExceptionsCatcher extends Exception {
    private String str;

    NullPointerExceptionsCatcher() {
    }

    NullPointerExceptionsCatcher(String s) {
        str = s;
    }

    public void showMethod() {
        System.out.println(str);
    }

    public static void u() {
        System.out.println("u()");
    }

    public static void main(String[] args) {

        int[] ar = new int[4];

        boolean id = false;
        int i = 10;
        while (!id) {
            try {
                i--;
                id = true;
                ar[i] = 5;
            } catch (Exception e) {
                System.out.println(e);
                id = false;
            }

        }

        try {
            NullPointerExceptionsCatcher nc = new NullPointerExceptionsCatcher("Some text");
            nc.showMethod();
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            NullPointerExceptionsCatcher nc = null;
            nc.u();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        Exciter ex = new Exciter();
        try {
            ex.exciter();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
