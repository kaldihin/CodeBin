package io;
import java.io.*;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in =
                    new DataInputStream(
                            new ByteArrayInputStream(
                                    BufferedInputFile.read(
                                            "C:\\Users\\Женёк" +
                                                    "\\Desktop\\Main\\Java\\Learning" +
                                                    "\\src\\io\\FormattedMemoryInput." +
                                                    "java").getBytes()));
            while (true)
                System.out.println((char)in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
