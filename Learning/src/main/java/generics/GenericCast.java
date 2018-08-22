package generics;

import java.util.ArrayList;

class FixedSizeStack<T> {
    private int index = 0;
    private static ArrayList<Object> storage = new ArrayList<>();
//    public FixedSizeStack(int size) {
//        storage = new Object[size];
//    }
    public void push(T item) {
        storage.add(item);
        index++;
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        if (index != 0) {
            return (T)storage.get(--index);
        } else return null;
    }
}

public class GenericCast {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<>();
        for (String s : "A B C D E F G H I J K L".split(" "))
        strings.push(s);
        String s = "";
        while (s != null){
            s = strings.pop();
            if (s != null)
            System.out.print(s + " ");
        }
    }
}
