package unsorted;

public class Closing {
    private int a = 8;

    private void show() {
        System.out.println("You are inside");
        System.out.println(a);
    }

    class InsideFucker {
        private int cc = 23;

        public void fuckInt() {
            a += 1;
        }

        public void fuckShow() {
            show();
        }
    }

    public void makeTrash() {
        InsideFucker i = new InsideFucker();
        i.fuckInt();
        i.fuckShow();
    }

    public static void main(String[] args) {
        Closing c = new Closing();
        c.makeTrash();
    }
}
