package innerclasses;

import java.util.ArrayList;
import java.util.Iterator;

class OverFlowException extends Exception {

}

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence<T> {
    public ArrayList<T> items = new ArrayList<>();

    public Sequence() {
    }

    /*private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size()) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }*/

    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        try {
            for (int i = 0; i < 10; i++) {
                //Object x = (Integer) i;
                Integer ii = i;
                String s = ii.toString();
                sequence.items.add(s);
                if (sequence.items.size() >= 20)
                    throw new OverFlowException();
            }
        } catch (OverFlowException e) {
            e.printStackTrace(System.out);
        }

        Iterator<Object> iter = sequence.items.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next().getClass().getSimpleName() + " ");
        }
    }
}
