package exceptions;

public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("C:\\Users\\9ty5\\Desktop\\Main\\Java\\Learning\\src\\exceptions\\Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ;
            } catch (Exception e) {
                System.out.println("Catched exception Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("Error till constructing InputFile");
        }
    }
}
