package holding;

import java.util.*;

public class LinkedListPutter {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> iter = list.listIterator();

        for (int i = 0; i < 6; i++)
            list.add(i);

        int i = 5;
        while (i != 0) {
            list.add((list.size()/2), i);
            i--;
        }

        System.out.println(list);

    }
}
