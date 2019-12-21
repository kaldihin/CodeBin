package strings;

import mine.TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.*;

public class CommentsFinder {
    public static void main(String[] args) {
        args = new String[]{"C:\\\\Users\\\\Женёк\\\\Desktop\\\\Main\\\\Java\\\\Learning\\\\src\\\\strings\\\\JGrep.java", "(//.+\\w*)|(/\\*.*\\w*\\*/)"};
        Pattern p = Pattern.compile(args[1]);
        try {
            File f = new File(args[0]);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String liner = br.readLine();
            while (liner != null) {
                Matcher m = p.matcher(liner);
                while (m.find())
                    System.out.print(m.group() + " ");
                liner = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}