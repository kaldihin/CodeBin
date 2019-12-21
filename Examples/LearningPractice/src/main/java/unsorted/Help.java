package unsorted;

public class Help {
    public static void main(String[] args) {
        String s = "32435652685884624";
        String ss = s.replaceAll("2", "4");
        String sss = ss.replaceAll("4", "7");
        System.out.println(s);
        System.out.println(ss);
        System.out.println(sss);
    }
}
