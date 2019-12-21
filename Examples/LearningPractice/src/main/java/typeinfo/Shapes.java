package typeinfo;

import java.util.*;

abstract class Shape {
    String squared = "Not squared";
    Shape() {
        if (this instanceof Square||this instanceof Rhomboid)
            squared = "Squared";
    }
    void draw() {
        System.out.println(this + ".draw()");
    }
    void rotate(Shape sha) {
        if (sha instanceof Circle) {
            System.out.println("Does rotate");
        } else System.out.println("Does not rotate");
    }

    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle " + squared;
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square " + squared;
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle " + squared;
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid " + squared;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape sh = new Rhomboid();
        if (sh instanceof Rhomboid) {
        Rhomboid r = (Rhomboid)sh;
        System.out.println(r.toString());}
        List<Shape> shapeList = Arrays.asList( new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : shapeList) {
            shape.draw();
            shape.rotate(shape);
            System.out.println(shape.squared);
        }
    }
}