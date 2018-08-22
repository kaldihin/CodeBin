package arrays;
import java.util.*;

public class PythonMigrating {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < 6; i++)
            list.add(i);
        System.out.println(list);
        System.out.println(list.get(4));
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        System.out.println(list.subList(2,4));
        Pypy py = new Pypy();
        System.out.println(py.reverser(list));
    }
}

class Pypy {
    public List<Integer> reverser(List<Integer> l) {
        List<Integer> ll = new LinkedList<>();
        ListIterator it = l.listIterator(l.size());
        while (it.hasPrevious()) {
            ll.add((Integer)it.previous());
        }
        return ll;
    }
}
