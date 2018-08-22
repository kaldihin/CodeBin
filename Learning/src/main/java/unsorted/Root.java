package unsorted;

public class Root {

    private int aIn;

    Component1 c1 = new Component1(aIn);
    Component2 c2 = new Component2(aIn);
    Component3 c3 = new Component3(aIn);



    Root(int a) {
        this.aIn = a;
        System.out.println("unsorted.Root Initiated " + a);
    }

    void dispose() {
        System.out.println("Breaked in unsorted.Root");
    }
}
