/* In this exercise, you are going to complete the Rectangle class. You need to complete the class so that you can print and compare two rectangles. 
Two rectangles will be considered equal if they have the same widths and the same heights.

To compare rectangles, you must define a method named equals that takes another Rectangle object as a parameter and returns true 
if both rectangles have the same width and height, and false otherwise.

Once complete, use the RectangleTester class to test your results. 
In the tester class, you are given 3 rectangles that you should print and compare. Sample results are provided below.

Sample output
A rectangle with a width of 5 and a height of 4
A rectangle with a width of 5 and a height of 4
A rectangle with a width of 10 and a height of 4
true
false */

public class Rectangle{

    private int width;
    private int height;
     
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public boolean equals(Rectangle other) {
        return this.width == other.width && this.height == other.height;
    }
    
    public String toString() {
        return "A rectangle with a width of " + width + " and a height of " + height;
    }
}

public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(5, 4);
        Rectangle rect3 = new Rectangle(10, 4);
        
        // Print all three rectangles
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        
        // Print one true statement comparing rectangles
        System.out.println(rect1.equals(rect2));
        
        // Print one false statment comparing rectangles
        System.out.println(rect1.equals(rect3));
    }
}