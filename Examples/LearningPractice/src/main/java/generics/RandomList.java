package generics;
import java.util.*;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);
    public void add(T item) {
        storage.add(item);
    }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        RandomList<Character> rc = new RandomList<>();
        RandomList<Integer> ri = new RandomList<>();
        for (String s : ("The quick brown fox jumped over "
                + "the lazy brown dog").split(" "))
            rs.add(s);
        String ss = "arthhdh";
        for (Character c : ss.toCharArray())
            rc.add(c);
        for (int i = 8; i < 13; i++)
            ri.add(i);
        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select() + " ");
            System.out.println(rc.select() + " ");
            System.out.println(ri.select() + " ");
        }
    }
}
