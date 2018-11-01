package howto;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HttpConnection {
    public static void main(String[] args) throws Exception {
        URLConnection connection = new URL("http://google.com").openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
