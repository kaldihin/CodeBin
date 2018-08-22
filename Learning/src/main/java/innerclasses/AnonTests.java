package innerclasses;

public class AnonTests {
    private Object oo;

    AnonTests(Object o) {
        System.out.print("AnonTests Constructor ");
        oo = o;
        System.out.println(oo);
    }

    public static void main(String[] args) {
        Anoner a = new Anoner();
        a.returner();
    }
}

class Anoner {
    public AnonTests returner() {
        return new AnonTests("Su") {
            {
                System.out.println("Anon");
            }
        };
    }


}
