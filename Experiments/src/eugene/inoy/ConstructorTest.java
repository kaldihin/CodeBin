package eugene.inoy;

import java.util.Random;

/**
 * Demonstrating constructing objects
 */

public class ConstructorTest {
    public static void main(String[] args) {
        // Fill array staff with three objects with type Employee

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        // Output data about all objects of type Employee

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",id="
            + e.getId() + ",salary=" + e.getSalary());
    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = ""; // Initiating field of an instance
    private double salary;

    // static block of initialization

    static {
        Random generator = new Random();
        // set random number 0-999 in field nextId
        nextId = generator.nextInt(10000);
    }

    // block of initialization the object

    {
        id = nextId;
        nextId++;
    }

    // Three overloaded constructors

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        // Call constructor Employee(String, double)
        this("Employee #" + nextId, s);
    }

    // Constructor without arguments

    public Employee() {
        // Field name initializes with an empty string "" - look down
        // Field salary doesn't set obviously, but initializes with zero
        // Field id initializes in the initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
