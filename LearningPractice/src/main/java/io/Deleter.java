package io;

import java.io.File;
import java.text.*;
import java.util.Date;
import java.util.List;

public class Deleter {
    public static void main(String[] args) {
        File f = new File(".\\src");
        File[] listik = f.listFiles();
//        Date d = new Date(2018-01-01);
        for (File s : listik) {
//            DateFormat TIMESTAMP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            DateFormat TIMESTAMP2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date(2018, 5, 7, 3, 5, 0);
            long ll = date.getDate();
//            System.out.println(ll);
            Date dt = new Date(s.lastModified());
            long lll = dt.getDate();
//            System.out.println(lll);
//            // Выводим Дату по шаблону
//            System.out.println(date);
//            System.out.println(dt);
            if (ll < lll) {
                Date dd = new Date(lll);
                System.out.println(dd);
            }

//            long g = s.lastModified();
//            System.out.println();
//            System.out.println(String.format("%02d:%02d:%02d", g / 3600, g / 60 % 60, g % 60));
        }
    }
}
