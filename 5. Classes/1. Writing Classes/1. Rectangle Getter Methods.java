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
    
    public int getArea()
    {
        return width * height;
    }
    
    // This is a getter method to get the height field.
    public int getHeight()
    {
        return height;
    }
    
    // This is a getter method to get the width field.
    public int getWidth()
    {
        return width;
    }
    
    /**
     * This is the toString method. It returns a String
     * representation of the object. See what happens
     * if you print out the object without a toString.
     */
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
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
         System.out.println(r1);
         
         // Access the height of r1
         System.out.println("r1 height: " + r1.getHeight());
         
         // Rectangle is the class and also the type of this object.
         Rectangle r2 = new Rectangle(5, 15);
         System.out.println(r2);
         
         // Access the width of r2
         System.out.println("r2 width: " + r2.getWidth());
    }
}