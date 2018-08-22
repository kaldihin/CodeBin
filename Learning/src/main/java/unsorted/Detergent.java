package unsorted;

public class Detergent {

    private String name;
    private Cleanser c = new Cleanser();

    public Detergent(String name) {
        this.name = name;
        System.out.print(this.name);
    }

    public void append(String v) {
        c.append(v);
        try {
        Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("nice");}
        System.out.print(v);
    }

    public void dilute(String v) {
        c.dilute(v);
        try {
            Thread.sleep(1300);
        }
        catch (InterruptedException e) {
            System.out.println("nice");}
        System.out.print(v);
    }

    public void apply(String v) {
        c.append(v);
        try {
            Thread.sleep(1200);
        }
        catch (InterruptedException e) {
            System.out.println("nice");}
        System.out.print(v);
    }

    public void scrub(String v) {
        c.append(v);
        try {
            Thread.sleep(800);
        }
        catch (InterruptedException e) {
            System.out.println("nice");}
        System.out.println(v);
    }

    public static void main(String[] args) {
        Detergent d = new Detergent("USG Ishimura");

        d.append(" Shuttles OK ");
        d.dilute(" Engines OK ");
        d.apply(" People on Board ");
        d.scrub(" Computers OK ");

        System.out.println("\nHave a good trip!");
    }

}