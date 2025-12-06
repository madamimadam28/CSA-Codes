public class Rectangle
{
    private int width;
    private int length;
    
    public Rectangle(int theWidth, int theLength)
    {
        width = theWidth;
        length = theLength;
    }

    public int area()
    {
        return width * length;
    }
    
    public static void rectEquations()
    {
	    System.out.println("The formula for area is: L * W");
	    System.out.println("The formula for perimeter is: 2(L + W)");
    }

    
    public String toString()
    {
        return "Rectangle: " + width + " x " + length;
    }

}

public class RectangleTester
{
    public static void main(String[] args)
    {
        // Can call static methods
        // WITHOUT creating an object
        Rectangle.rectEquations();
        
        // Cannot call non-static methods without
        // an object
        
        // WRONG
        //int area = Rectangle.area();
        
        // RIGHT
        Rectangle room = new Rectangle(10, 13);
        int area = room.area();
        System.out.println(area);
    }
}