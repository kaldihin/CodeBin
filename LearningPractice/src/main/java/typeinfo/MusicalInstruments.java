package typeinfo;

class Instrument {
    public void prepareInstrument() {
        System.out.println("Instrument prepared");
    }
}

class Wind extends Instrument {
     public void clearSpitValve() {
         System.out.println("SpitValve clear");
     }
}

class Beat extends Instrument {
    public void makeNoise() {
        System.out.println("Ba dum tsss!");
    }
}

public class MusicalInstruments {

    public static void main(String[] args) {
        Instrument synthez = new Instrument();
        Beat drum = new Beat();
        Wind saxo = new Wind();
        synthez.prepareInstrument();
        drum.prepareInstrument();
        saxo.prepareInstrument();
        drum.makeNoise();
        saxo.clearSpitValve();
    }

}
