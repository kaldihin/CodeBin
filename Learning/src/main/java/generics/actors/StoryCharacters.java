package generics.actors;

import net.mindview.util.Generator;

import java.util.Random;

public class StoryCharacters extends Actor implements Generator<Actor> {
    private Class[] types = {BruceWayne.class, Gordon.class,
            HarveyDant.class, Joker.class};
            private static Random random = new Random(45);
    public StoryCharacters() {}
    int size = 0;
    public StoryCharacters(int sz) {
        size = sz;
    }

    @Override
    public Actor next() {
        try {
            return (Actor) types[random.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        StoryCharacters st = new StoryCharacters();
        for(int i = 0; i < 5; i++) {
            System.out.println(st.next());
            System.out.println();
        }
    }
}
