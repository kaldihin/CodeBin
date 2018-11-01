package generics;
import typeinfo.pets.*;

class Generic1<T> {
    public T t;
    public void set(T t) {
        this.t = t;
    }
}

class Generic2<T> {
    private T type;
    public T get() {
        return type;
    }
}

public class ExperimentalGenericsTwo {
    public static void main(String[] args) {
        Generic1<Cat> g1 = new Generic1<>();
        g1.set(new Cat());
        System.out.println(g1.t.getClass().getSimpleName());
        Generic2<Integer> g2 = new Generic2<>();
        System.out.println(g2.get());
    }
}
