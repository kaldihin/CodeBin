package io;

import java.io.*;

class Seri implements Serializable {
    Seri() {
        System.out.println("Constructor of Seri");
        SerTest s1 = new SerTest();
    }

    @Override
    public String toString() {
        return "I am Seri, and I'm in String";
    }
}

public class SerTest implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Seri ss = new Seri();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("seri.txt"));
        out.writeObject(ss);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("seri.txt"));
        Seri str = (Seri)in.readObject();
        System.out.println(str);
    }
}
