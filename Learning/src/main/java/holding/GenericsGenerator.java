package holding;

import java.util.*;

public class GenericsGenerator {
    String[] heroes = new String[]{"John Wayne", "Mad Max", "Wolverine", "DeadPool"};

    public void next(Collection<String> col) {
        for (String s : heroes)
            col.add(s);
        printer(col);
    }

    public void printer(Collection coll) {
        System.out.println(coll);
    }

    public static void main(String[] args) {
        GenericsGenerator gg = new GenericsGenerator();

        gg.next(new ArrayList<String>());
        System.out.println();
        gg.next(new LinkedList<>());
        gg.next(new HashSet<>());
        gg.next(new LinkedHashSet<>());
        gg.next(new TreeSet<>());


    }
}
