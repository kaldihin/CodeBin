package strings;
import mine.TextFile;

import java.io.File;
import java.util.regex.*;
//Good comment
public class JGrep {
    public static void main(String[] args) throws Exception {
        int aa = Pattern.CASE_INSENSITIVE; /* Fuck it! */
        Integer aaa = aa;// Bad Comment
        args = new String[]{"C:\\\\Users\\\\9ty5\\\\Desktop\\\\Main\\\\Java\\\\Learning\\\\src\\\\strings", "\\b[Ssct]\\w+", aaa.toString()};
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex"); //class Pid
            System.exit(0);
        } //class Pid
        int index = 0; final int A = Integer.parseInt(args[2]);// b = Integer.parseInt(args[3]);
        Pattern p = Pattern.compile(args[1], A);
        Matcher m = p.matcher("");
        File[] files = new File(args[0]).listFiles();
        for (File ff : files) { //Cycle
            for (String line : new TextFile(ff.toString())) {
                m.reset(line);
                while (m.find())
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
    }}
}
