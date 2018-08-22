package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile2 {
    static String file = "rtest.dat";
    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        System.out.println(rf.readDouble());
        System.out.println(rf.readBoolean());
        System.out.println(rf.readByte());
        System.out.println(rf.readChar());
        System.out.println(rf.readLong());
        System.out.println(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        rf.writeDouble(1.414);
        rf.writeBoolean(true);
        rf.writeByte(5);
        rf.writeChars("u");
        rf.writeLong(347754838);
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(5 * 8);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }
}
