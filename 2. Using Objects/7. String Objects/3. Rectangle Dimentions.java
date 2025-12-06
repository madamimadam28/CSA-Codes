public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    
    // Prints the dimensions of the rectangle
    public String printDims()
    {
        String rect = "Rectangle with width: " + width;
        rect += " and height: " + height;
        
        return rect;
    }
}

public class RectangleTester
{
    public static void main(String[] args)
    {
        /*
         * Rectangle is the name of the class. Every Rectangle
         * has a width and a height. But the specific instances
         * have their own dimensions.
         */
         Rectangle r1 = new Rectangle(10, 2);
         System.out.println(r1.printDims());
         
         // Rectangle is the class and also the type of this object.
         Rectangle r2 = new Rectangle(5, 15);
         System.out.println(r2.printDims());
    }
}