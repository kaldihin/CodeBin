package generics.actors;

public class Joker extends BadGuys {
    Joker() {
        System.out.println("Ha Ha Ha Ha");
        typical();
    }
    @Override
    public String toString() {
        return Joker.class.getSimpleName();
    }
}
