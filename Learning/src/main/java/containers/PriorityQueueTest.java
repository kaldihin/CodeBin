package containers;
import java.util.*;

class Randomer {
    private Random r = new Random();
    private Integer fi = r.nextInt(100);
    public Integer getter() {
        return fi;
    }
}
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> itp = new PriorityQueue<>();
        for (int i = 0; i < 20; i++)
            itp.add(new Randomer().getter());
        while (!itp.isEmpty())
            System.out.println(itp.poll());
    }
}
