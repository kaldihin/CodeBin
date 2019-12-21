package unsorted;

public class Cartoon extends Art {

    Cartoon() {
        super(5);
        System.out.println("unsorted.Cartoon constructor");
    }

    Cartoon(int i) {
        super(i);
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
        Cartoon r = new Cartoon(6);
    }
}
