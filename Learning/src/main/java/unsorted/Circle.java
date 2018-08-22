package unsorted;

public class Circle extends Shape {

    @Override public void draw() {
        System.out.println("unsorted.Circle.draw()");
    }

    @Override public void erase() {
        System.out.println("unsorted.Circle.erase()");
    }

    @Override public void newMethod() {
        System.out.println("New New Method");
    }

}
