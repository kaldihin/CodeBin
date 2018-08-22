package unsorted;

interface Playable {

    void play(Note n);
}

abstract class Instrument {

    String what() {
        return super.toString();
    }

    void adjust() {
        System.out.println("Adjusting unsorted.Instrument");
    }

}

class Moody extends Instrument implements Playable{

    public void play(Note n) {
        System.out.println("I'm unsorted.Moody " + n);
    }

}

class Wind extends Instrument implements Playable{

    @Override public void play(Note n) {
        System.out.println("unsorted.Instrument.play() " + n);
    }

    String what() {
        return super.toString();
    }

    void adjust() {
        System.out.println("Adjusting unsorted.Instrument");
    }

}

class Percussion extends Instrument implements Playable{

    public void play(Note n) {
        System.out.println("unsorted.Percussion.play() " + n);
    }

    String what() {
        return "unsorted.Percussion";
    }

    void adjust() {
        System.out.println("Adjusting unsorted.Percussion");
    }

}

enum Note {
    MIDDLE_C, MAJOR_C, FLAT_C;
}

class Stringed extends Instrument implements Playable{

    public void play(Note n) {
        System.out.println("unsorted.Stringed.play() " + n);
    }

    String what() {
        return "unsorted.Stringed";
    }

    void adjust() {
        System.out.println("Adjusting unsorted.Stringed");
    }

}

class Brass extends Wind{

    public void play(Note n) {
        System.out.println("unsorted.Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting unsorted.Brass");
    }

}

class Woodwind extends Wind {

    public void play(Note n) {
        System.out.println("unsorted.Woodwind.play()" + n);
    }

    String what() {
        return "unsorted.Woodwind";
    }

}

public class Music3 implements Playable{

    @Override
    public void play(Note n) {

    }

    public static void tune(Playable i) {
        i.play(Note.FLAT_C);
    }

    public static void tuneAll(Playable[] e) {

        for (Playable p : e) {
            tune(p);
        }

    }

    public static void main(String[] args) {

        RandomShapeGenerator2 gen2 = new RandomShapeGenerator2();
        Playable[] orchestra = new Playable[10];

        for (int i = 0; i < 10; i++) {
            orchestra[i] = gen2.next();
        }

             //new unsorted.Wind(), new unsorted.Percussion(),
        //new unsorted.Stringed(), new unsorted.Brass(), new unsorted.Woodwind(), new unsorted.Moody()};

        tuneAll(orchestra);

    }


}
