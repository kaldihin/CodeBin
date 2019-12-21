package holding;

import mine.TextFile;

import java.util.*;

public class WordsCounter {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>(new TextFile("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\holding\\UniqueWords.java", "\\W+"));

        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);
        Iterator<String> itstr = words.iterator();

        Set<Case> sc = new LinkedHashSet<>();
        //Map<String, Integer> wc = new LinkedHashMap<String, Integer>();

        while (itstr.hasNext()) {

            sc.add(new Case(itstr.next()));

        }

        System.out.println(sc);

        //Map<String, Integer> mapik = new TreeMap<>(wc);

        //System.out.println(mapik);

    }

}

class Case {
    private String word;
    private int counter = 0;

    public Case(String s) {
        word = s;
        char[] arr = word.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'a')
                counter++;
            if (arr[i] == 'e')
                counter++;
            if (arr[i] == 'i')
                counter++;
            if (arr[i] == 'o')
                counter++;
            if (arr[i] == 'u')
                counter++;
            if (arr[i] == 'y')
                counter++;

        }

    }

    @Override
    public String toString() {
        return word + " " + counter + " ";
    }
}
