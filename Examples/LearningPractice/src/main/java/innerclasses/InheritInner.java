package innerclasses;

class WithInner {
    class Inner {
        Inner(int a, String s) {
            System.out.println("Inner constructor with " + a + " " + s);
        }
    }
}

class WithInner2 {
    class Inner2 extends WithInner.Inner {
        Inner2(WithInner wi2) {
            wi2.super(0, "1");
        }
    }
}

public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super(1, "2");
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        WithInner2 wi2 = new WithInner2();
        WithInner2.Inner2 ii2 = wi2.new Inner2(wi);
    }
}
