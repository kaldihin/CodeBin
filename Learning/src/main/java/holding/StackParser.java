package holding;

import mine.*;

import java.util.LinkedList;
import java.util.List;

public class StackParser {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char ch[] = s.toCharArray();
        int size = ch.length;

        for (int i = 0; i < size; i++) {
            if (ch[i] == '+') {
                String buf = String.valueOf(ch[i+1]);
                st.push(buf);
            }

            //while (!st.empty())
            //System.out.print(st.pop());

            if (ch[i] == '-') {
                System.out.print(st.pop());
            }
        }

        //if () {
        //    s.split("-")System.out.print(st.pop() + " ");
        //}
    }
}
