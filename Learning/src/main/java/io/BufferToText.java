package io;
import java.nio.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        FileChannel fc = new FileOutputStream("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        fc = new FileInputStream("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        buff.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buff));
        fc = new FileOutputStream("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
        fc.close();
        fc = new FileInputStream("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\data.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        fc = new FileOutputStream("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\data.txt").getChannel();
        buff = ByteBuffer.allocate(24);
        buff.asCharBuffer().put("Some text");
        fc.write(buff);
        fc.close();
        fc = new FileInputStream("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\data.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
    }
}
