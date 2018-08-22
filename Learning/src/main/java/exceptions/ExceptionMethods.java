package exceptions;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My exception");
        } catch (Exception e) {
            System.out.println("Catched");
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedNessage():" + e.getLocalizedMessage());
            System.out.println("toString():" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
