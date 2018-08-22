package holding;

import typeinfo.pets.Pet;

import java.util.*;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.println(p);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>(8);
        //LinkedList<Pet> petsLL = new LinkedList<Pets>();
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        //display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
