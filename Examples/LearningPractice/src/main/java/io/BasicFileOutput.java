package io;
import java.io.*;

public class BasicFileOutput {
    static String file = "C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\io\\BasicFileOutput.java";

    public static void main(String[] args) throws IOException {

        long ti = System.currentTimeMillis();
        System.out.println("ti " + ti);
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\io\\BasicFileOutput.java")));
        long ti1 = System.currentTimeMillis();
        System.out.println("ti1 " + ti1);
        FileReader inu = new FileReader("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\io\\BasicFileOutput.java");

        long ti2 = System.currentTimeMillis();
        System.out.println("ti2 " + ti2);
        long titi = ti1 - ti, titi1 = ti2-ti1;

        System.out.println("buffered: " + (titi) + " without: " + (titi1));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
//        LineNumberReader l = new LineNumberReader(new FileReader(file));
        while ((s = in.readLine()) != null)
//            out.println(lineCount++ + ": " + s);
        out.close();
//        System.out.println(BufferedInputFile.read(file));
    }
}
