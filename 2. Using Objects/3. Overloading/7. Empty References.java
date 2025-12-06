/* This code is supposed to print out three lines of code as follows:

Rectangle with width: 3 and height: 6
Rectangle with width: 7 and height: 2
Rectangle with width: 2 and height: 10
Unfortunately, it doesn’t work. Fix the code so that the output matches the intended output. */

public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    
    // Constructor
    // Copies the values of rectWidth and rectHeight
    // into width and height, respectively
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    // Constructor
    // Allows user to construct a square
    // Copies the value of sidelength
    // into both width and height
    public Rectangle(int sidelength)
    {
        width = sidelength;
        height = sidelength;
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
        // Fix this code so there are no more
        // null pointer exceptions
        Rectangle brick = new Rectangle(3, 6);
        Rectangle fencePost = new Rectangle(7, 2); 
        
        System.out.println(brick);
        System.out.println(fencePost);
        
        // Change the fencePost dimensions
        fencePost = new Rectangle(2, 10);
        System.out.println(fencePost);
        
    }
}