package strings;
import java.util.regex.*;
import java.util.*;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.print(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
        System.out.print(Arrays.toString(input.split("!!")));
        System.out.print(Arrays.toString(input.split("!!", 3)));

    }
}
