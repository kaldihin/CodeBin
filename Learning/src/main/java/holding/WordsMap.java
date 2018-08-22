package holding;

import mine.TextFile;

import java.util.*;

public class WordsMap {
    public static void main(String[] args) {
        Map<String, Integer> words = new LinkedHashMap<String, Integer>();

        LinkedList<String> listik = new LinkedList<>(new TextFile("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\holding\\SetOperations.java", "\\W+"));
        Iterator<String> itt = listik.iterator();
        Integer counter = 0;
        System.out.println(listik);

        itt = listik.iterator();
        counter = 0;

        while (itt.hasNext()) {
            words.put(itt.next(), counter);
            counter++;
        }

        System.out.println(words);
    }
}
