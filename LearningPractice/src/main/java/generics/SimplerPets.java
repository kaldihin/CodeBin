package generics;
import net.mindview.util.New;
import typeinfo.pets.*;
import java.util.*;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        Set<String> set = New.<String>set();
        set.add("ui");
        set.add("thdtjtrj65u6jrjrt6jrt6j");
        System.out.println(set);
    }
}
