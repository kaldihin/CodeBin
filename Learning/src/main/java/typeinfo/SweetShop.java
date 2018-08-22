package typeinfo;

import java.lang.reflect.*;

class Candy {
    static {
        System.out.println("Loading class Candy");
    }
}

class Gum extends Candy {
    private int i = 0;
    static {
        System.out.println("Loading class Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading class Cookie");
    }
}

public class SweetShop {
    public static Class someThing(Class s) {
        System.out.println(s.toString());
        return someThing(s.getSuperclass());
    }
    public static void main(String[] args) {
        args = new String[]{"Candy"};
        System.out.println("In main method");
        if (args[0].contentEquals("Candy"))
        new Candy();
        if (args[0].matches("Cookie"))
            new Cookie();
        if (args[0].matches("Gum"))
            new Gum();
        System.out.println("After creating object Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After calling method Class.forname(\"Gum\")");
        if (args[0].equals("Candy"))
            new Candy();
        if (args[0].equals("Cookie"))
            new Cookie();
        if (args[0].equals("Gum"))
            new Gum();
        System.out.println("After creating object Cookie");

        Class cls = Gum.class;
        try {
            Field[] fields = cls.getDeclaredFields();
            for(int i = 0; i < fields.length; i++) {
                System.out.println("Field = " + fields[i].toString());
            }
        } catch(Exception e) {
            System.out.println(e.toString());
        }

        System.out.println(someThing(cls));
    }
}
