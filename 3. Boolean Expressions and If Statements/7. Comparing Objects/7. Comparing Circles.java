/*This program is incorrectly comparing Circles using ==.

Modify the CircleTester class to correctly compare Circle objects using .equals

You’ll need to implement the following methods in the Circle class so that the CircleTester can correctly compare and print Circles:

public String toString()
public boolean equals(Circle other)
equals should only return true if both Circles have the exact same attributes (color, radius, x, and y). toString should return a String of the form [color] circle with a radius of [radius] at position ([x], [y]).

For example:

Circle circle = new Circle(10, "blue", 50, 40);
System.out.println(circle);
Should print out

blue circle with a radius of 10 at position (50, 40) */

public class Circle
{
    private int radius;
    private String color;
    private int x;
    private int y;
    
    public Circle(int theRadius, String theColor, int xPosition, int yPosition)
    {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Implement a toString method and an equals method here!
    public String toString()
    {
        // Change this!
        return color + " circle with a radius of " + radius + " at position (" + x + ", " + y + ")";
    }
    
    public boolean equals(Circle other)
    {
        // Change this!
        return radius == other.getRadius() &&
               x == other.getX() &&
               y == other.getY() &&
               color.equals(other.getColor());
    }
}

public class CircleTester 
{
    public static void main(String[] args)
    {
        Circle one = new Circle(10, "blue", 50, 35);
        Circle two = new Circle(10, "blue", 50, 35);
        Circle three = new Circle(20, "red", 0, 0);
        Circle four = three;
        
        // Modify this program to correctly compare objects
        // We should not be comparing objects using ==
        
        if(one.equals(two))
        {
            System.out.println("Circles one and two are equal!");
            System.out.println(one);
            System.out.println(two);
        }
        
        if(three.equals(four))
        {
            System.out.println("Circles three and four are equal!");
            System.out.println(three);
            System.out.println(four);
        }
    }
}