package unsorted;

import java.nio.*;
import java.util.*;

public class AdaptedRandomChars extends RandomChars
implements Readable {

    private int count;

    public AdaptedRandomChars(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1;
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars(8));

        while (s.hasNext())
            System.out.println(s.next() + " ");
    }

}
