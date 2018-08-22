package io;
import java.nio.*;

public class IntBufferDemo {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        DoubleBuffer db = bb.asDoubleBuffer();
        IntBuffer ib = bb.asIntBuffer();
        ib.put(new int[]{11, 42, 47, 99, 143, 811, 1016});
        db.put(new double[]{11, 47, 99, 811, 1016});
        System.out.println(ib.get(3));
        System.out.println(db.get(4));
        ib.put(3, 1811);
        db.put(1, 56);
        ib.flip();
        while (ib.hasRemaining()) {
            int i = ib.get();
            System.out.println(i);
        }
        db.flip();
        while (db.hasRemaining()) {
            double d = db.get();
            System.out.println(d);
        }
    }
}
