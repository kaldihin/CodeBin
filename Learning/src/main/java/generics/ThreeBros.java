package generics;

public class ThreeBros<T> {
    T a;
    T b;
    T c;
    public void setA(T a) {
        this.a = a;
    }
    public void setB(T b) {
        this.b = b;
    }
    public void setC(T c) {
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }

    public ThreeBros(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        ThreeBros t3 = new ThreeBros(1, 2, 3);
        System.out.println(t3.getA());
        System.out.println(t3.getB());
        System.out.println(t3.getC());
    }
}
