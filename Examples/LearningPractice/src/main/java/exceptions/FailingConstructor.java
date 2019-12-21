package exceptions;

class Disposer {
    public void dispose() {
        System.out.println("dispose()");
    }
}

public class FailingConstructor {
    private Disposer d;
    FailingConstructor() throws Exception {
        d = new Disposer();
        try {
            throw new Exception();
        } catch (Exception e) {} finally {
            Disposer dd = new Disposer();
            dd.dispose();
            dispose();
        }

    }

    public void dispose() {
        System.out.println("dispose in FailingConstructor");
    }

    public void cu() {
        System.out.println("cu");
    }

    public static void main(String[] args) {
        try {
            FailingConstructor f = new FailingConstructor();
            f.cu();
            f.dispose();
        } catch (Exception e) {}
    }
}
