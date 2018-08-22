package strings;

import mine.TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.*;

public class ClassNameFinder {
    public static void main(String[] args) {
        args = new String[]{"C:\\\\Users\\\\Женёк\\\\Desktop\\\\Main\\\\Java\\\\Learning\\\\src\\\\strings\\\\JGrep.java", "class.*\\w"};
        Pattern p = Pattern.compile(args[1]);
        ArrayList<String> ar = new ArrayList<>();
        try {
            File f = new File(args[0]);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String liner = br.readLine();
            while (liner != null) {
                Matcher m = p.matcher(liner);
                while (m.find()) {
                    if (!ar.contains(m.group()))
                    ar.add(m.group());
                }
                liner = br.readLine();
            }
            Iterator it = ar.iterator();
            int i = 0;
            while (it.hasNext()) {
                String ss = ar.get(i);
                String sss = ss.replaceAll("class ", "");
                ar.set(i, sss);
                it.next();
                i++;
            }
            System.out.print(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}