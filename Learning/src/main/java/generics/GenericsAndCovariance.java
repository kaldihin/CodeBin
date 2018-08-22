package generics;
import java.util.*;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
        List<? extends Number> nlist = new ArrayList<Integer>();
        List<? extends Integer> ilist = new ArrayList<>();
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Object());
        List<Integer> li = new ArrayList<Integer>();
//        List<Number> ln = li; // illegal
        li.add(new Integer(3));
        System.out.println(li);
        flist.add(null);
        Fruit f = flist.get(0);
    }
}
