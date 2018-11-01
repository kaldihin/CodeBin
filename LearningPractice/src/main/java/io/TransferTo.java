package io;
import java.nio.*;
import java.io.*;
import java.nio.channels.FileChannel;

public class TransferTo {
    static String file1 = "C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\456.txt";
    static String file2 = "C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\data2.txt";
    public static void main(String[] args) throws Exception {
//        if (args.length != 2) {
//            System.out.println("arguments: sourcefile destfile");
//            System.exit(1);
//        }

        FileChannel in = new FileInputStream(file1).getChannel(),
                out = new FileOutputStream(file2).getChannel();
        in.transferTo(0, in.size(), out);
        out.transferFrom(in, 0, in.size());
    }
}
