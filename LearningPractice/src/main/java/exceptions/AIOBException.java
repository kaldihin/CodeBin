package exceptions;

public class AIOBException {
    public void oberter() throws RuntimeException {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            AIOBException ai = new AIOBException();
            ai.oberter();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
