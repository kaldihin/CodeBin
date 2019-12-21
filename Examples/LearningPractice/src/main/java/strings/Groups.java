package strings;
import java.util.ArrayList;
import java.util.regex.*;

public class Groups {
    static public final String POEM = "Twas brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.";

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        Matcher m = Pattern.compile("([a-z]+)").matcher(POEM);

        while (m.find()) {
            if (!(ar.contains(m.group())))
            ar.add(m.group());
            }

        System.out.println(ar);
        }
    }
