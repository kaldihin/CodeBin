package typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class InfoGetter {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName(args[0]);
            System.out.println(c.getSimpleName());

            Constructor[] constr = c.getConstructors();
            for (Constructor constructor : constr)
            System.out.println(constructor);

            System.out.println(c.getSuperclass());
            Method[] meth = c.getMethods();
            for (Method me : meth)
            System.out.println(me);

        } catch (ClassNotFoundException e) {
            System.out.println("class not found" + e);
        }
    }
}
