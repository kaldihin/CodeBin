package holding;

import java.util.*;

public class SortsTests {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        map.put("3", "Three");
        map.put("2", "Two");
        map.put("1", "One");
        map.put("5", "Five");
        map.put("4", "Four");
        System.out.println(map);

        list1.addAll(map.keySet());
        System.out.println(list1);
        list2.addAll(map.values());
        System.out.println(list2);

        Collections.sort(list1);
        System.out.println(list1);

        Map<String, String> map2 = new HashMap<>(map);
        System.out.println(map2);

    }



}
