package holding;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        Map<Integer, String> lhmp = new LinkedHashMap<>();

        lhmp.put(1, "One");
        lhmp.put(5, "Five");
        lhmp.put(3, "Three");
        lhmp.put(2, "Two");
        lhmp.put(4, "Four");

        System.out.println(lhmp);

        Map<Integer, String> hmp = new HashMap<>(lhmp);

        System.out.println(hmp);

        Set<Integer> lset = new LinkedHashSet<>();

        lset.add(1);
        lset.add(5);
        lset.add(3);

        System.out.println(lset);

        Set<Integer> set = new HashSet<>(lset);

        System.out.println(set);


    }
}
