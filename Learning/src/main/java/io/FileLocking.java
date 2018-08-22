package io;
import java.nio.*;
import java.io.*;
import java.nio.channels.FileLock;
import java.util.concurrent.*;

public class FileLocking {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file.txt");
        FileLock fl = fos.getChannel().tryLock();
        if (fl != null) {
            System.out.println("Locked File");
            TimeUnit.MILLISECONDS.sleep(2000);
            fl.release();
            System.out.println("Released Lock");
            TimeUnit.MILLISECONDS.sleep(3000);
            fos.getChannel().tryLock();
            System.out.println("Locked File");
        }
        fos.close();
    }
}
