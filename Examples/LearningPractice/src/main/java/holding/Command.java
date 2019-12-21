package holding;

import java.util.*;

public class Command {

    Command() {

    }

    private String field;
    static Queue<Command> que = new LinkedList<>();
    static String[] ar = new String[]{"First", "Second", "Third", "Fourth", "Fifth"};

    Command(String str) {
        field = str;
        operation();
    }

    public static void main(String[] args) {
        EnterQ e = new EnterQ();
        e.enterCo(que, ar);
    }

    public void operation() {
        System.out.println(field);
    }

    @Override
    public String toString() {
        return field;
    }
}

class EnterQ {

    public void enterCo(Queue que, String[] a) {
        for (int i = 0; i < 5; i++)
            que.offer(new Command(a[i]));

        PrintQ pq = new PrintQ();
        pq.printer(que);
    }
}

class PrintQ extends Command{
    public void printer(Queue q) {
        while (q.peek() != null) {
            System.out.println(q.remove() + " ");
        }
    }
}
