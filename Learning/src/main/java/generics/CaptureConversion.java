package generics;
import java.util.*;

public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }
    static void f2(Holder<?> holder) {
        f1(holder);
    }
    static void f3(Holder<List<?>> arguk) {
        System.out.println(arguk);
    }
    static void f4(List<Holder<?>> arguk1) {
        System.out.println(arguk1);
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        f1(raw);
        f2(raw);
        Holder rawBasic = new Holder();
        rawBasic.set(new Object());
        f2(rawBasic);
        Holder<?> wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
        Holder<List<?>> wildcarded2 = new Holder<List<?>>();
        f3(wildcarded2);
        List<Holder<?>> wildcarded3 = new LinkedList<Holder<?>>();
        f4(wildcarded3);
    }
}
