package generics;

interface Kukla {}

interface Osel {}

class Kozel implements Kukla, Osel {
    public <T extends Kukla> void kuklovod() {
        System.out.println("kuklovod()" + super.getClass().getSimpleName());
    }
    public <T extends Osel> void oslopas() {
        System.out.println("oslopas()" + super.getClass().getSimpleName());
    }
}

public class TwoIntsOneClass {
    public static void main(String[] args) {
        Kozel kz = new Kozel();
        kz.kuklovod();
        kz.oslopas();
    }
}
