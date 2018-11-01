package unsorted;

public class Square extends Shape {

    @Override public void draw() {
        System.out.println("unsorted.Square.draw()");
    }

    @Override public void erase() {
        System.out.println("unsorted.Square.erase()");
    }

    @Override public void newMethod() {
        System.out.println("New New Method");
    }

}
