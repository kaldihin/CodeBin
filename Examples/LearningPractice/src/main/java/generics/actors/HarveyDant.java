package generics.actors;

public class HarveyDant extends BadGuys {
    HarveyDant() {
        System.out.println("The Justice will win");
        typical();
    }
    @Override
    public String toString() {
        return HarveyDant.class.getSimpleName();
    }
}
