package lambda;

import java.util.Arrays;
import java.util.Date;
import javax.swing.*;

/**
 * In this program is demonstrated using the lambda-expressions
 */

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth",
        "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is "
        + new Date()));
        t.start();

        // Run the program until user will not choose the "OK" button
        JOptionPane.showMessageDialog(null, "Quit " +
                "program?");
        System.exit(0);
    }
}
