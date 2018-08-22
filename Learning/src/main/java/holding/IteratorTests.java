package holding;

import java.util.*;

public class IteratorTests {
    public void it(Collection<Object> col) {
        Iterator iter = col.iterator();

        while (iter.hasNext())
            System.out.println(iter.next());
    }

    public static void main(String[] args) {
        IteratorTests itt = new IteratorTests();
        Collection<Object> arr = new ArrayList<Object>();
        Collection<Object> ll = new LinkedList<Object>();
        Collection<Object> lhs = new LinkedHashSet<>();
        Collection<Object> hs = new HashSet<>();
        Collection<Object> ts = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            arr.add("arr");
            ll.add("ll");
            lhs.add("lhs");
            hs.add("hs");
            ts.add("ts");
        }

        itt.it(arr);
        itt.it(ll);
        itt.it(lhs);
        itt.it(hs);
        itt.it(ts);
    }
}
