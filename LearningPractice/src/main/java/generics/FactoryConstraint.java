package generics;

interface FactoryI<T> {
    T create(int n);
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create(6);
    }
}

class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create(int nnn) {
        return new Integer(0);
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create(int nn) {
            return new Widget();
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
