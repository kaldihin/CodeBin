package io;
import java.io.*;
import net.mindview.util.*;

public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").dirs);
        for (File file : Directory.local(".", "T.*"))
            System.out.println(file);
        System.out.println("------------------------");
        for (File file : Directory.walk(".", "T.*\\.java"))
            System.out.println(file);
        System.out.println("========================");
        for (File file : Directory.walk(".", ".*[Zz].*\\.class"))
            System.out.println(file);
        int sum = 0;
        for (File file : Directory.walk(".", "T.*\\.java")) {
            sum += file.length();
            System.out.println(file.length());
        }
        System.out.println(sum);
    }
}
