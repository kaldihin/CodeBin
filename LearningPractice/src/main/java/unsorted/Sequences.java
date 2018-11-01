package unsorted;

interface Selector {

    boolean end();

    Object current();

    void next();

    Sequences getSequences();
}

public class Sequences {

    private Object[] items;
    private int next = 0;

    public Sequences(int size) {

        items = new Object[size];
    }

    public void add(Object x) {

        if (next < items.length)
            items[next++] = x;
    }

    public void show() {
        System.out.println("This is a crazy show");
    }

    private class SequencesSelector implements Selector {

        private int i = 0;

        public boolean end() {

            return i == items.length;
        }

        public Object current() {

            return items[i];
        }

        public void next() {

            if (i < items.length)
                i++;
        }

        public Sequences getSequences() {
            return Sequences.this;
        }
    }

    private class RSequencesSelector implements Selector {

        private int i = items.length;

        public boolean end() {

            return i == 0;
        }

        public Object current() {

            return items[i - 1];
        }

        public void next() {

            if (i > 0)
                i--;
        }

        public Sequences getSequences() {
            return Sequences.this;
        }
    }

    class Insider {
        Insider() {
            System.out.println("Insider initiated");
        }

        public void make() {
            System.out.println("Make!");
        }
    }

    public Selector selector() {

        return new SequencesSelector();
    }

    public Selector reverseSelector() {
        return new RSequencesSelector();
    }

    public static void main(String[] args) {

        Sequences s = new Sequences(10);

        for (int i = 0; i < 10; i++)
            s.add(Integer.toString(i));

        Selector selector = s.selector();

        Sequences ss = selector.getSequences();
        ss.show();

        Selector reverseSelector = s.reverseSelector();

        Sequences.Insider i = s.new Insider();
        i.make();

        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }

        System.out.println();

        while (!selector.end()) {

            System.out.print(selector.current() + " ");
            selector.next();
        }

    }
}
