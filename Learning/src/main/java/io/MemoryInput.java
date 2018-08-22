package io;
import java.io.*;

public class MemoryInput {
    public static void main(String[] args) throws Exception {
        StringReader in = new StringReader(BufferedInputFile.read("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\io\\MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char)c);
    }
}
