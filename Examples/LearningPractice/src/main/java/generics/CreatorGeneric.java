package generics;

abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate() {
        element = create();
    }
    abstract T create();
}

class X {}

class Creator extends GenericWithCreate<X> {
    X create() {
        try {
            return X.class.newInstance();
        } catch (Exception e) {
            return null;
        }

    }
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}

public class CreatorGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}
