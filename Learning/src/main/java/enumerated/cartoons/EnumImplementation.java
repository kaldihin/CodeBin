package enumerated.cartoons;
import java.util.*;

enum CartoonCharacter {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private static Random rand = new Random(47);

    public static CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}

public class EnumImplementation {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(CartoonCharacter.next());
    }
}
