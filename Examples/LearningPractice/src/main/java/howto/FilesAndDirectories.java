package howto;

import java.io.*;

public class FilesAndDirectories {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\9ty5\\Desktop\\Main\\Java\\Learning\\src\\main\\java\\howto\\temp.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
//        fileWriter.flush(); // Writing the bufferized stream into file
//        fileWriter.close();

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str4");
        bufferedWriter.newLine();
        bufferedWriter.write("str5");
        bufferedWriter.flush();
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file);
//        char[] chars = new char[20];
//        fileReader.read(chars);
//        System.out.println(chars);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }

    }
}
