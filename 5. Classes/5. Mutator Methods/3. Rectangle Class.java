/* Write your own accessor and mutator method for the Rectangle class instance variables.

You should create the following methods:

getHeight
setHeight
getWidth
setWidth
getArea
getPerimeter
toString- The output of a rectangle with width 10 and height 4 method should be:
Rectangle width: 10, Rectangle height: 4 */

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
    

    // Put your methods here
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setWidth(int theWidth) {
        width = theWidth;
    }
    
    public void setHeight(int theHeight) {
        height = theHeight;
    }
    
    public int getArea() {
        return width * height;
    }
    
    public int getPerimeter() {
        return 2 * (width + height);
    }

    
    /**
     * This is the toString method. It returns a String
     * representation of the object. 
     */
    public String toString()
    {
        return "Rectangle width: " + width + ", Rectangle height: " + height;
    }
}

public class RectangleTester
{
    public static void main(String[] args)
    {
        // Make some objects and print out their
        // areas and perimeters
    }
}