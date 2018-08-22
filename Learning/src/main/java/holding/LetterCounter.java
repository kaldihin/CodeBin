package holding;

import mine.TextFile;

import java.util.*;

public class LetterCounter {
    public static void main(String[] args) {
        Set<String> letters = new TreeSet<String>(new TextFile("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\holding\\Gerbiller.java", "\\W+"));
        Iterator<String> iter = letters.iterator();
        letters.toString().toLowerCase();
        int counterA = 0, counterE = 0, counterI = 0, counterO = 0, counterU = 0, counterY = 0; //A E I O U Y

        while (iter.hasNext()) {
            String str = iter.next().toLowerCase();
            char[] arr = str.toCharArray();
            int tempCounterA = 0, tempCounterE = 0, tempCounterI = 0, tempCounterO = 0, tempCounterU = 0, tempCounterY = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == 'a')
                    tempCounterA++;
                if (arr[i] == 'e')
                    tempCounterE++;
                if (arr[i] == 'i')
                    tempCounterI++;
                if (arr[i] == 'o')
                    tempCounterO++;
                if (arr[i] == 'u')
                    tempCounterU++;
                if (arr[i] == 'y')
                    tempCounterY++;

            }

            counterA += tempCounterA;
            counterE += tempCounterE;
            counterI += tempCounterI;
            counterO += tempCounterO;
            counterU += tempCounterU;
            counterY += tempCounterY;

            System.out.println("Word " + str + " consists " + tempCounterA + " a  " + tempCounterE + " e  " + tempCounterI + " i  " + tempCounterO + " o  " + tempCounterU + " u  " +
                    tempCounterY + " y  ");
        }

        System.out.println("Totally vowels: " + counterA + " a  " + counterE + " e  " + counterI + " i  " + counterO + " o  " + counterU + " u  " +
                counterY + " y  ");

        Set<String> letterss = new LinkedHashSet<String>(letters);

        letterss.add("Totally vowels: " + counterA + " a  " + counterE + " e  " + counterI + " i  " + counterO + " o  " + counterU + " u  " +
                counterY + " y  ");

        System.out.println(letterss);

    }
}
