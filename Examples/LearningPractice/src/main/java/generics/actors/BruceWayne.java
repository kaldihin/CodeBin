package generics.actors;

public class BruceWayne extends GoodGuys {
    BruceWayne() {
        System.out.println("Where is the Detonator?!");
        typical();
    }

    @Override
    public String toString() {
        return BruceWayne.class.getSimpleName();
    }
}
