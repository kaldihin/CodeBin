package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

public class Human {
    int type = 0;
    public void returner() throws RuntimeException {
        try {
            switch (type) {
                case 0:
                    throw new Sneeze();
                case 1:
                    throw new Annoyance();
                default:
                    return;
            }
        } catch (Sneeze e) {
            throw new Sneeze();
        } catch (Annoyance e) {
            throw new Annoyance();
        }
    }
    public static void main(String[] args) {
        Human h = new Human();
        try {
            h.returner();
        } catch (Sneeze s) {
            System.out.println("Catched Sneeze");
        } catch (Annoyance a) {
            System.out.println("Catched Annoyance");
        }

        h.type++;

        try {
            h.returner();
        } catch (Annoyance a) {
            System.out.println("Catched Annoyance");
        }
    }
}
