package strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTesting {
    public static void main(String[] args) {
        String sss = "Arline ate eight apples and one orange while Anita hadn't any";
        Pattern p = Pattern.compile("((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");//[A-Z].+[.]
        Matcher m = p.matcher(sss);
        boolean b = m.matches();//
        System.out.println(m.find());
        System.out.println(b);//[a-z]+[.]+

        PatternTesting pt = new PatternTesting();
        pt.method();
    }

    private void method() {
        String s = "Java now has regular expressions";
        String[] sm = new String[]{"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+",
        "s{4}", "s{1}", "s{0,3}" };
        for (String ssm: sm) {
            System.out.println(ssm);
            Pattern p = Pattern.compile(ssm);
            Matcher m = p.matcher(s);
            boolean b = m.matches();
            System.out.println(m.find());
        }
    }
}
