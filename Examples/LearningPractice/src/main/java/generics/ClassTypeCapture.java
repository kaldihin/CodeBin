package generics;
import java.util.*;

class Building {}

class House extends Building {}

public class ClassTypeCapture<T> {
    Class<T> kind;
    static Map<String,Class<?>> mapchik;
    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }
    public void addType(String typename, Class<?> kind) {
        mapchik.put(typename, kind);
    }
    public Object createNew(String typename) {
        return mapchik.get(typename);
    }


    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
        ctt2.addType("String", StringBuilder.class);
        System.out.println(ctt2.createNew("String").getClass().getSimpleName());
    }
}
