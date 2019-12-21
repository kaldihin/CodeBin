package typeinfo.pets;

class Gerbil extends Pet {
    private int gerbilNumber;

    Gerbil() {
        System.out.println("Gerbil");
    }

    Gerbil(int number) {
        gerbilNumber = number;
        System.out.println("Constructor of Gerbil initiated with number " + gerbilNumber);
    }

    public void hop() {
        System.out.println("gerbilNumber " + gerbilNumber);
    }
}
