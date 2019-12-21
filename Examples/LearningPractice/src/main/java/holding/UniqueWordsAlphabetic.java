package holding;

import java.util.*;
import mine.*;

public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("C:\\Users\\9ty5\\Desktop\\Main\\Java\\Learning\\src\\holding\\SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}