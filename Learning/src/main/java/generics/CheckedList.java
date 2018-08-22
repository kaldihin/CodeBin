package generics;
import generics.coffee.Cappuccino;
import generics.coffee.Coffee;
import generics.coffee.Latte;
import generics.coffee.Mocha;
import typeinfo.pets.*;
import java.util.*;

public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyCofs) {
        probablyCofs.add(new Mocha());
    }

    public static void main(String[] args) {
        List<Coffee> cof1 = new ArrayList<>();
        oldStyleMethod(cof1);
        List<Coffee> cof2 = Collections.checkedList(new ArrayList<Coffee>(), Coffee.class);
        try {
            oldStyleMethod(cof2);
        } catch (Exception e) {
            System.out.println(e);
        }
        List<Coffee> pets = Collections.checkedList(new ArrayList<Coffee>(), Coffee.class);
        pets.add(new Cappuccino());
        pets.add(new Latte());
    }
}
