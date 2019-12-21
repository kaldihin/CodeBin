package unsorted;

class Glyph {

    void draw() {
        System.out.println("unsorted.Glyph.draw()");
    }

    Glyph() {
        System.out.println("unsorted.Glyph перед вызовом draw()");
        draw();
        System.out.println("unsorted.Glyph() после вызова draw()");
    }
}

class RoundGlyph extends Glyph {

    private int radius = 1;

    RoundGlyph() {

    }

    RoundGlyph(int r) {
        radius = r;
        System.out.println("unsorted.RoundGlyph.unsorted.RoundGlyph(), radius = "
                + radius);
        draw();

    }

    void draw() {
        System.out.println("unsorted.RoundGlyph.draw(), radius = "
                + radius);
    }
}

class RectangularGlyph extends RoundGlyph {

    private int sradius = 4;

    RectangularGlyph(int r) {
        sradius = r;
        draw();
    }

    void draw() {
        System.out.println("unsorted.RectangularGlyph.draw(), radius = "
                + sradius);
    }

}

public class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(7);
    }
}
