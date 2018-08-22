package holding;

import java.util.*;

public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "One Two Three Four Five".split(" "));

        for (String s : cs)
            System.out.print("'" + s + "' ");
    }
}
