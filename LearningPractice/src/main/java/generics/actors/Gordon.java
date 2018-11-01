package generics.actors;

public class Gordon extends GoodGuys {
    Gordon() {
        System.out.println("Many of Us think that they are brave");
        typical();
    }
    @Override
    public String toString() {
        return Gordon.class.getSimpleName();
    }
}
