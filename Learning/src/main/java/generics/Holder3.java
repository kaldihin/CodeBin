package generics;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

public class Holder3<T> {
    private T a;
    public Holder3(T a) {
        this.a = a;
    }
    public void set(T a) {
        this.a = a;
    }
    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Pet> h3 = new Holder3<>(new Cat());
        Pet a = h3.get();
        System.out.println(a.getClass().getSimpleName());
        //h3.set("Not an Automobile");
        //h3.set(1);
    }
}
