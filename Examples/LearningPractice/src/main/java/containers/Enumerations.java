package containers;
import java.util.*;
import net.mindview.util.*;

public class Enumerations {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Countries.names(10));
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement() + ", ");
        e = Collections.enumeration(new ArrayList<>());
    }
}
