package holding;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

import java.util.*;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.print(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.print(dog);
        System.out.print(petMap.containsKey("My Dog"));
        System.out.print(petMap.containsValue(dog));
    }
}
