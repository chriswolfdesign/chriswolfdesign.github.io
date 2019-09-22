/**
 * Rectangle.java
 *
 * A class to represent a rectangle.
 *
 * @author Chris Wolf
 * @version 1.0.0 (January 19, 2019)
 *
 * crwolf3@catamount.wcu.edu
 */

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the perimeter of the rectangle
     *
     * @return {double} -- the perimeter of our rectangle
     */
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }

    /**
     * Returns the area of the rectangle
     *
     * @return {double} -- the area of our rectangle
     */
    public double getArea() {
        return width * height;
    }
}
