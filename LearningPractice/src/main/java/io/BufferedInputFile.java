package io;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
//        List<String> list = read(args[0]);
//        ListIterator lit = list.listIterator(list.size());
//        while (lit.hasPrevious())
//            System.out.println(lit.previous());
    }
}
