/*This program makes use of the Rectangle class from the previous example. It contains two files: Rectangle.java and RectangleTester.java.

You should add code to RectangleTester.java to create a rectangle with a width of 5 and height of 12 and then print out the object. */

public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    
    // Constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}

public class RectangleTester 
{
    public static void main(String[] args)
    {
        // Create a rectangle with width 5 and height 12
        Rectangle rectangle = new Rectangle(5, 12);
        // Then print it out
        System.out.println(rectangle);
    }
}