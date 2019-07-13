package io;
import java.io.*;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Alien implements Serializable {

    public static void main(String[] args) {
        try {
            fileCreator();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void fileCreator() throws IOException {

        final String fileSeparator = System.getProperty("file.separator");
        String absolutePath = "C:" + fileSeparator + "filik" + fileSeparator + "file.txt";
        String path = "C:" + fileSeparator + "filik";

        final String newPath = "C:" + fileSeparator + "pop" + fileSeparator + "huilo";

        File newFile = new File(newPath);
        if (!newFile.exists()) {
            if (newFile.mkdirs()) {
                System.out.println("Folders created");
            } else {
                System.out.println("Not created");
            }
        }

        File file2 = new File(path);
        if (!file2.exists()) {
            if (file2.mkdir()) {
                System.out.println("Folder created");
            }
        }

        File file = new File(absolutePath);


        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File " + absolutePath + " already exists");
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        writer.write("Fuckhhhh\n");
        writer.write("Gttytuteurt");

        writer.flush();
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        Scanner scanner = new Scanner(reader);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        reader.close();


        file = new File("filik.txt");
        if (file.createNewFile()) {
            System.out.println("File has been created in the root folder");
        } else {
            System.out.println("File already exists in the root folder");
        }



//        String relativePath = "tmp" + fileSeparator + "filik.txt";
//        file = new File(relativePath);
//        if (file.createNewFile()) {
//            System.out.println(relativePath + "File created as a relativePath");
//        } else {
//            System.out.println("RelativePath already exist the file");
//        }

        FileInputStream fileInputStream = new FileInputStream(file);
        while (fileInputStream.read() != -1) {
            System.out.println(fileInputStream.read());
        }

        File myFile = new File("C:\\Users\\9ty5\\Desktop\\Practice\\LearningPractice\\src\\main\\java\\io\\myFile.txt");

        File myFile2 = new File("C:\\Users\\9ty5\\Desktop\\Practice\\LearningPractice\\src\\main\\java\\io\\myFile2.txt");

        if (myFile2.createNewFile()) {
            System.out.println("File2 created");
        }

        if (myFile.createNewFile()) {
            System.out.println("File created");
        }

        FileInputStream myFileInputStream = new FileInputStream(myFile);





        FileWriter fileWriter1 = new FileWriter(myFile);
        fileWriter1.write("The string");
        fileWriter1.flush();
        fileWriter1.close();

        FileReader fileReader1 = new FileReader(myFile);
        fileWriter1 = new FileWriter(myFile2);
        while (fileReader1.ready())
        fileWriter1.write(fileReader1.read());
        fileWriter1.flush();
        fileReader1.close();
        fileWriter1.close();

        ZipOutputStream zipOutputStream1 = new ZipOutputStream(new FileOutputStream(new File("archive.zip")));

        ZipEntry zen = new ZipEntry(myFile2.getName());


        zipOutputStream1.putNextEntry(zen);
        zipOutputStream1.flush();
        zipOutputStream1.closeEntry();
        zipOutputStream1.close();

    }

}
