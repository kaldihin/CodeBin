package io;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Modified {
    public void processing(File file) {
        File[] files = file.listFiles();
        Date d = new Date(118, 6, 1);
        for (File s : files) {
            if (s.isDirectory()) {
                processing(s);
                continue;
            }
            else {
                Date dd = new Date(s.lastModified());
                if (d.before(dd))
                    System.out.println(s.getName());
            }
        }
    }
    public static void main(String[] args) {
        Modified m = new Modified();
        File f = new File("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src");
        m.processing(f);
    }
}