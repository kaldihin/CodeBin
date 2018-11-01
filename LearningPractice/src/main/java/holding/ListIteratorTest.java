package holding;

import java.util.*;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }

        System.out.println(list1);

        ListIterator<Integer> iter1 = list1.listIterator(list1.size());

        while (iter1.hasPrevious()) {
            list2.add(iter1.previous());
        }

        System.out.println();
        System.out.println(list1);
        System.out.println(list2);

    }
}
