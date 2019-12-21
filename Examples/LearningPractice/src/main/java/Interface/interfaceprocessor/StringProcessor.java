package Interface.interfaceprocessor;

import java.util.*;

public abstract class StringProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);
    public static String s = "If she weights the same as a duck, she's made of wood";

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
        Apply.process(new Changer(), s);
    }
}

class Upcase extends StringProcessor {

    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends StringProcessor {

    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {

    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

class Changer extends StringProcessor {

    public String process(Object input) {

        char[] a = s.toCharArray();
        char a1, a2;

        System.out.println(a);

        for (int i = 2; i < a.length - 2; i += 4) {

            a1 = a[i];
            a2 = a[i+1];

            a[i] = a[i-2];
            a[i+1] = a[i-1];

            a[i-2] = a1;
            a[i-1] = a2;

        }

        System.out.println(a);

        return a.toString();
    }
}