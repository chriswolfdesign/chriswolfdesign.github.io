/**
 * Circle.java
 *
 * A class to represent a circle.
 *
 * @author Chris Wolf
 * @version 1.0.0 (January 19, 2019)
 *
 * crwolf3@catamount.wcu.edu
 */

public class Circle implements Shape {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    /**
     * Attempts to return the perimeter of our a circle
     * WAIT!!!! Circle's don't have a perimeter, but we know what the user meant
     * so we will just call getCircumference() instead
     *
     * @return {double} -- the perimeter (uh, circumference) of the circle
     */
    public double getPerimeter() {
        return getCircumference();
    }

    /**
     * Returns the circumference of the circle
     *
     * @return {double} -- circumference of the circle
     */
    public double getCircumference() {
        return rad * 2 * Math.PI;
    }

    /**
     * Returns the area of the circle (Yay, this one makes sense!)
     *
     * @return {double} -- the area of the circle
     */
    public double getArea() {
        return rad * rad * Math.PI;
    }
}
