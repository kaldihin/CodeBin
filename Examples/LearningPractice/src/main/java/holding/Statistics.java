package holding;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Statistics st = new Statistics();
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        LinkedList<Integer> li = new LinkedList<Integer>();
        Iterator<Integer> liit = li.iterator();
        Map<Integer, Integer> li2 = new HashMap<>();
        Integer fif = 500;
        int n = 10000;

        for (int i = 0; i < n; i++) {
            int r = rand.nextInt(20);
            li.add(r);
            if ((st.count(li, r)) <= 500) {
            Integer freq = m.get(r);
                m.put(r, freq == null ? 1 : freq + 1);
            }
            else {
                n++;
            }
        }

            System.out.println(m);



    }

    public static int count(Collection l, int ro) {
        int counter = 0;
        Iterator<Integer> liit = l.iterator();
        liit = l.iterator();

        while (liit.hasNext()) {

            if (ro == liit.next()) {
                counter++;
            }

        }
        return counter;
    }
}
