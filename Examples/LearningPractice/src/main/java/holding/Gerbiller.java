package holding;

import java.util.*;

class Gerbil {
    private int gerbilNumber;

    Gerbil(int number) {
        gerbilNumber = number;
        System.out.println("Constructor of Gerbil initiated with number " + gerbilNumber);
    }

    public void hop() {
        System.out.println("gerbilNumber " + gerbilNumber);
    }
}

public class Gerbiller {
    public static void main(String[] args) {
        Map<String, Gerbil> ger = new HashMap<String, Gerbil>();


        ger.put("First", new Gerbil(1));
        ger.put("Second", new Gerbil(2));
        ger.put("Third", new Gerbil(3));
        ger.put("Fourth", new Gerbil(4));
        Iterator<String> geri = ger.keySet().iterator();

        while (geri.hasNext()) {
            System.out.println(geri.next());
        }

        geri = ger.keySet().iterator();

        while (geri.hasNext()) {
                ger.get(geri.next()).hop();
            }

        System.out.println(ger);
    }
}
