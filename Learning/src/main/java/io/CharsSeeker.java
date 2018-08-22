package io;

import net.mindview.util.BinaryFile;
import net.mindview.util.Directory;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharsSeeker {
    static String file = "C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\io\\Deleter.java";
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        BufferedReader bf = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = bf.readLine()) != null)
            sb.append(s + "\n");
        bf.close();
        char alph = 'a';

        char[] ch = sb.toString().toCharArray();
        while (alph++ != 'z') {
            int sum = 0;
            for (char c : ch)
                if (c == alph)
                    sum++;
            map.put(alph, sum);
        }
        System.out.println(map.toString());
        BinaryFile ff = new BinaryFile();
        System.out.println(Arrays.toString(BinaryFile.read(file)));
    }
}
