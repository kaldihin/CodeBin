package unsorted;

import java.util.Random;

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Moneta implements Game {
    private Moneta() {}

    Random rand = new Random(23);
    private int moves = 0;
    private static final int MOVES = 5;
    static final String orel = "Orel";
    static final String reshka = "Reshka";
    String result;

    public boolean move() {

        if ((rand.nextInt(20) % 2) == 0)
            result = orel;
        else result = reshka;


        System.out.println("unsorted.Moneta moves on " + result);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Moneta();
        }
    };
}

class Kubik implements Game {
    private Kubik() {}

    Random rand = new Random(23);
    private int moves = 0;
    private static final int MOVES = 19;

    public boolean move() {

        System.out.println("unsorted.Kubik moves on " + (rand.nextInt(231) % 12 + 1));
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Kubik();
        }
    };
}

public class Games {

    public static void playGame(GameFactory factory) {

        Game s = factory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {

        playGame(Moneta.factory);
        playGame(Kubik.factory);
    }

}
