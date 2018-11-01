package typeinfo;
import net.mindview.util.Null;
import net.mindview.util.TypeCounter;
import typeinfo.factory.*;
import java.util.*;

class Part {
    static List<Part> lp = new LinkedList<>();
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Part> partFactories = new ArrayList<>();
    static {
        try {
            partFactories.add(FuelFilter.class.newInstance());
            partFactories.add(AirFilter.class.newInstance());
            partFactories.add(CabinAirFilter.class.newInstance());
            partFactories.add(OilFilter.class.newInstance());
            partFactories.add(FanBelt.class.newInstance());
            partFactories.add(PowerSteeringBelt.class.newInstance());
            partFactories.add(GeneratorBelt.class.newInstance());
            partFactories.add(SukFilter.class.newInstance());
        } catch (Exception e) {
            System.out.println("Exe");
        }
        lp.addAll(partFactories);
    }
    private static Random rand = new Random(3);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n);
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {

}

class AirFilter extends Filter {

}

class CabinAirFilter extends Filter {

}

class OilFilter extends Filter {

}

class SukFilter extends Filter implements Null {}

class Belt extends Part {}

class FanBelt extends Belt {

}

class GeneratorBelt extends Belt {

}

class PowerSteeringBelt extends Belt {

}

public class RegisteredFactories {
    public static void main(String[] args) {
        TypeCounter type = new TypeCounter(Part.class);
        for (int i = 0; i < 10; i++)
            type.count(Part.createRandom());
        System.out.println(type);
        System.out.println(Part.lp);
    }
}
