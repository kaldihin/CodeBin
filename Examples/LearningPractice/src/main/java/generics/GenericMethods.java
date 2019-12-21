package generics;

public class GenericMethods {
    public <T,U> void f(T x, U u, double v) {
        System.out.println(x.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(v);
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 45, 89.0);
//        gm.f(1);
//        gm.f(1.0);
//        gm.f(1.0F);
//        gm.f('c');
//        gm.f(gm);
    }
}
