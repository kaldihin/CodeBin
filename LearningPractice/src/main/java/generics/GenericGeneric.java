package generics;

abstract class Absy<T extends Absy<T>> {
    private T elem;
    public abstract <T> void absy(T t);
    public abstract T absyGet();
    public void absyLooker() {
        System.out.println(absyGet().getClass().getSimpleName());
    }
}
public class GenericGeneric<T> extends Absy {
    @Override
    public void absy(Object o) {}

    @Override
    public Absy absyGet() {
        return null;
    }

    @Override
    public void absyLooker() {
        super.absyLooker();
    }

    public static void main(String[] args) {
        GenericGeneric gg = new GenericGeneric();
        gg.absy("RTEye");
        try {
            gg.absyLooker();
        } catch (NullPointerException e) {
            System.out.println("Its a " + e.getClass().getSimpleName());
        }

    }
}
