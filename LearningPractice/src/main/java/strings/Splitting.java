package strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a hearing!";
    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        //split(" ");
        //split("\\W+");
        //split("n\\W+");
        //split("the|you");
        Pattern p = Pattern.compile("[A]|[a]|[E]|[e]|[I]|[i]|[J]|[j]|[O]|[o]|[U]|[u]|[Y]|[y]");
        Matcher m = p.matcher(knights);
        while (m.find())
            m.appendReplacement(buffer, "_");
        m.appendTail(buffer);
        System.out.println(buffer);
    }
}

/*StringBuffer buffer = new StringBuffer();

    Pattern regexp = Pattern.compile("<[a-z]+>");
    Matcher m = regexp.matcher("<a><b-><1><c><d/>");
        while (m.find())
                m.appendReplacement(buffer, "text");
                m.appendTail(buffer);

                System.out.println(buffer);*/