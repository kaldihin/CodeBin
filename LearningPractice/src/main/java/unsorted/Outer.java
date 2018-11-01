package unsorted;

public class Outer {

    private String sec;

    Outer() {
        sec = "Init";
        Inner in = new Inner("1");
        in.toString();
    }

    class Inner {

        String field;


        Inner(String s) {

            field = s;

            System.out.println("Inner constructor with: " + field);
        }

        public String toString() {
            return sec;
        }
    }

    public Inner innerget(String s) {
        return new Inner(s);
    }

    public static void main(String[] args) {

        Outer o = new Outer();
        Outer.Inner ii = o.innerget("rrr");
        ii.toString();
        o.innerget("Hey");
        o.toString();


    }
    Outer.Inner i = new Inner("yt");
}
