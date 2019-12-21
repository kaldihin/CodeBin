package io;
import java.io.*;

public class Echo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\5";
        BufferedReader stdin =
                new BufferedReader(new FileReader(path));
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0)
            System.out.println(s.toUpperCase());
    }
}
