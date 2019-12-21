package unsorted;

interface Insiders {
    void showSomething();
}

public class InsidersTest implements Insiders {

    static InsidersTest getInsidersTest() {
        return new InsidersTest() {
            {
                System.out.println("Anon unsorted.InsidersTest");
            }
            @Override
            public void showSomething() {
                super.showSomething();
            }
        };
    }

    @Override
    public void showSomething() {
        System.out.println("showSomething");

        getter();

        Futlyar f = new Futlyar();
        f.showSomething();
    }

    public Insiders getter() {
        return new Insiders() {
            @Override
            public void showSomething() {

            }

            {
                System.out.println("SuperInsider()");
            }
        };

    }

    private class Futlyar implements Insiders{
        @Override
        public void showSomething() {
            System.out.println("showSomething in Futlyar");
        }
    }

    public Insiders getInterface() {
        return new Futlyar();
    }

    public static void main(String[] args) {
        InsidersTest i = new InsidersTest();
        InsidersTest i1 = getInsidersTest();
        i1.showSomething();
        i.showSomething();
    }
}
