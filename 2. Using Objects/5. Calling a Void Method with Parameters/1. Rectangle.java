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
    
    public void printArea()
    {
        int area =  width * height;
        System.out.println(area);
    }
    
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    
    public void setWidth(int newWidth)
    {
        width = newWidth;
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
        Rectangle box = new Rectangle(10, 5);
        System.out.println(box);
        System.out.print("Area: ");
        box.printArea();
        
        // Change the width
        box.setWidth(15);
        System.out.println(box);
        System.out.print("Area: ");
        box.printArea();
        
        // Change the height
        box.setHeight(3);
        System.out.println(box);
        System.out.print("Area: ");
        box.printArea();
        
    }
}