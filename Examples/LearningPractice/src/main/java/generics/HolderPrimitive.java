package generics;

public class HolderPrimitive {
    public static void main(String[] args) {
        Holder<?> ih = new Holder(5);
        System.out.println(ih.get().getClass().getSimpleName());
        Holder<?> dh = new Holder<>(5.78);
        System.out.println(dh.get().getClass().getSimpleName());
        Holder<Character> ch = new Holder<>('j');
        System.out.println(ch.get().getClass().getSimpleName());
        char c = ch.get();
        System.out.println(c);
    }
}
