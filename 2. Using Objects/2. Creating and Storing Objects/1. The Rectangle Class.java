public class Rectangle
{
    // Attributes
     // Be sure to check out the other file in the sidebar in the code editor!
    private int width;
    private int height;
    
    // Constructor
    // Remember the values of rectWidth and rectHeight
    // are passed by value, so their values are copied
    // to width and height
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
        // Create a new rectangle with a width of 10 and a height of 3
        // Be sure to check out the other file in the sidebar in the code editor!
        Rectangle room = new Rectangle(10, 3);
        
        // Print out information about the rectangle
        System.out.println("Rectangle Room");
        System.out.println(room);
        
        // Create a different rectangle with a width of 40 and a height of 60
        Rectangle backyard = new Rectangle(40, 60);
        
        // Print out information about the rectangle
        // Notice this rectangle has different values for
        // the instance variables.
        System.out.println("Rectangle Backyard");
        System.out.println(backyard);
        
    }
}