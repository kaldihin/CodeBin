package generics;

interface HeIsInt {
    void firstMethodik();
    void secondMethodik();
}

class Nagliy implements HeIsInt {
    @Override
    public void firstMethodik() {
        System.out.println("firstMethodik() in Nagliy");
    }

    @Override
    public void secondMethodik() {
        System.out.println("secondMethodik() in Nagliy");
    }

    public void thirdMethodik() {
        System.out.println("thirdMethodik() in Nagliy");
    }
}

class Vtoroy {
    public <T extends HeIsInt> Object general(T x) {
        x.firstMethodik();
        x.secondMethodik();

        return (Object) "Success";
    }
}

public class TwoInterfacesOneClass {
    public static void main(String[] args) {
        Vtoroy vt = new Vtoroy();
        System.out.println(vt.general(new Nagliy()));
    }
}
