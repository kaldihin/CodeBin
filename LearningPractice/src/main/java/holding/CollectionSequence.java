package holding;

import typeinfo.pets.*;
import java.util.*;

public class CollectionSequence {

    public static void main(String[] args) {
        ArrayList<Pet> arp = new ArrayList<Pet>();


            arp.add(new Cat());
            arp.add(new Dog());
            arp.add(new Manx());
            arp.add(new Rat());
            arp.add(new Mutt());
            arp.add(new Dog());
            arp.add(new Mouse());
        Iterator<Pet> part = arp.iterator();
        InterfaceVSIterator.display(arp);
        InterfaceVSIterator.display(part);
    }
}
