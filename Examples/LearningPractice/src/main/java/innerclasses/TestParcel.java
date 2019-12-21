package innerclasses;

class Parcel4 {
    private class PContents implements Contents1 {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents1 contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents1 c = p.contents();
        System.out.println(c.value());
        Destination d = p.destination("Some text");
        System.out.println(d.readLabel());
    }
}
