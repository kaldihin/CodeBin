package howto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws Exception {
        ClassSerializableChild cs = new ClassSerializableChild();
        cs.life = 70;
        cs.staticField = 45;
        AnotherClassSerializable anotherClassSerializable2 = new AnotherClassSerializable();
        anotherClassSerializable2.level = 5;
        cs.anotherClassSerializable = anotherClassSerializable2;
        cs.childLevel = 85;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cs);
        objectOutputStream.close();

        cs.staticField = 35;

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ClassSerializableChild newCS = (ClassSerializableChild) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newCS.life);
        System.out.println(newCS.staticField);
        System.out.println(newCS.anotherClassSerializable.level);
        System.out.println(newCS.childLevel);
    }
}
