package io;
import java.io.*;

public class FileOutputShortcut {
    static String file = "C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\io\\FileOutputShortcut.java";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\io\\FileOutputShortcut.java")));
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
