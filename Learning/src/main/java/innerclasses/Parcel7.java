package innerclasses;

interface Contents1 {
    int value();
}

public class Parcel7 {
    public Contents1 contents() {
        return new Contents1() {
            private int i = 11;

            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents1 c = p.contents();
    }
}
