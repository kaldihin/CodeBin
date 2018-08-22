package strings;

import java.util.*;

public class Receipt {
    private double total = 0;
    private static final String VA = "%-20s %5s %10s\n";
    private static final String VA2 = "%-20.20s %5d %10.2f\n";
    private static final String VA3 = "%-20s %5s %10.2f\n";
    private Formatter f = new Formatter(System.out);
    public void printTitle() {
        f.format(VA, "Item", "Qty", "Price");
        f.format(VA, "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format(VA2, name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format(VA3, "Tax", "", total*0.06);
        f.format(VA, "", "", "-----");
        f.format(VA3, "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
