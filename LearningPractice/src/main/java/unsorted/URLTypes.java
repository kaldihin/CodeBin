package unsorted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTypes {


    public static void main(String[] args) {

        String nextLine;
        URLConnection urlConn = null;
        try {
            URL url = new URL("https://yandex.ru/yandsearch?clid=1923018&text=dfs&lr=11147");
            urlConn = url.openConnection();
        } catch (IOException e) {
            System.out.println("No");
            e.printStackTrace();
        }

        try (InputStreamReader inputStream = new InputStreamReader(urlConn.getInputStream(), "UTF-8")){
            BufferedReader buff = new BufferedReader(inputStream);

            while (true) {
                nextLine = buff.readLine();
                System.out.println(nextLine);
                if (nextLine == null) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Something wrong");
        }

    }


}
