package generics;

public class LinkedStack<T> {
    private static class Node {
        Object item;
        Node next;
        Node() {
            item = null;
            next = null;
        }
        Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }
        boolean end() {
            return item == null && next == null;
        }
    }
    private Node top = new Node();
    public void push(T item) {
        top = new Node(item, top);
    }
    public Object pop() {
        Object result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" "))
            lss.push(s);
        Object s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }
}
