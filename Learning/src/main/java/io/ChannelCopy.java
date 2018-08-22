package io;
import java.nio.*;
import java.io.*;
import java.nio.channels.FileChannel;

public class ChannelCopy {
    private static final int BSIZE = 1024;
    static String file = "C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\data2.txt";
    public static void main(String[] args) throws Exception {
//        if (args.length != 2) {
//            System.out.println("arguments: sourcefile destfile");
//            System.exit(1);
//        }
        FileChannel in = new FileInputStream(args[0]).getChannel(),
        out = new FileOutputStream(file).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while (in.read(buffer) != -1) {
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }
        in.close();
        out.close();
    }
}
