/**
 * ShapeDriver.java
 *
 * Creates a list of shapes and then prints out their perimeter and area
 *
 * @author Chris Wolf
 * @version 1.0.0 (January 19, 2019)
 *
 * crwolf3@catamount.wcu.edu
 */

import java.util.ArrayList;

public class ShapeDriver {
    public static void main(String[] args) {
        // Create our list
        ArrayList<Shape> shapes = new ArrayList<>();

       // add a rectangle, square, and circle
       shapes.add(new Rectangle(4,5));
       shapes.add(new Square(5));
       shapes.add(new Circle(5));

       // Print out the perimeter and area of the shape
       for(Shape shape : shapes) {
           // TODO: Print the area of the shape as well
           System.out.println("Perimeter: " + shape.getPerimeter());
           System.out.println();
       }
    }
}
