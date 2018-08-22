package unsorted;

import java.util.Iterator;

public class Shapes {

    private static RandomShapeGenerator gen = new RandomShapeGenerator(10);

    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        Iterator<Shape> it = gen.iterator();

        while (it.hasNext())
            System.out.println(it.next().toString());

        //for(unsorted.Shape shp : s)
          //  shp.draw();

       // unsorted.Shape ns = new unsorted.Pentagon();

    }

}
