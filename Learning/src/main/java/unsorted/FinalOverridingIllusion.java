package unsorted;

class WithFinals {

    public void f() {
        System.out.println("unsorted.WithFinals.f()");
    }

    public void g() {
        System.out.println("unsorted.WithFinals.g()");
    }

}

class OverridingPrivate extends WithFinals {

    public void f() {
        System.out.println("unsorted.OverridingPrivate.f()");
    }

    public void g() {
        System.out.println("unsorted.OverridingPrivate.g()");
    }

}

public class FinalOverridingIllusion {

    public static void main(String[] args) {

        OverridingPrivate op = new OverridingPrivate();
        op.f();
        op.g();

        WithFinals wf = op;

    }

}
