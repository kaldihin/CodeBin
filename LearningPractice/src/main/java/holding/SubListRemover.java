package holding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SubList {
    private static int j = 0;

    SubList() {
        System.out.print(j + " ");
        j++;
    }
}

public class SubListRemover {
    public static void main(String[] args) {
        List<SubList> listik = new ArrayList<SubList>();
        SubList[] listikm = new SubList[8];

        for (int i = 0; i < 8; i++)
            listikm[i] = new SubList();

        for (int i = 0; i < 8; i++)
            listik.add(listikm[i]);

        System.out.println();

        for (SubList l : listik)
            System.out.println(l.getClass());

        List part = new ArrayList<SubList>();
        part = listik.subList(5, 7);
        listik.removeAll(part);
        System.out.println();

        for (SubList l : listik)
            System.out.println(l.getClass());


    }
}
