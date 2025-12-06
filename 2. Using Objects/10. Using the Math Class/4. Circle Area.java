/* Here is a Circle class.

Implement getArea and getSphereVolume by using methods from the Math class. */

public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    // Implement getArea using
    // Math.PI and
    // Math.pow
    // Area = pi * r^2
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2.0);
    }
    
    // Implement getSphereVolume using
    // Math.PI and
    // Math.pow
    // Volume = 4/3 * pi * r^3
    public double getSphereVolume()
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3.0);
    }
    
    
    
}

public class CircleTester 
{
    public static void main(String[] args)
    {
        Circle cup = new Circle(5);
        System.out.println("Area of a circle with radius 5: " + cup.getArea() + " units squared");   
        System.out.print("If this circle were this circle a sphere, ");
        System.out.println("its volume would be: " + cup.getSphereVolume() + " units cubed");      

        Circle hat = new Circle(12);
        System.out.println("\nArea of a circle with radius 12: " + hat.getArea() + " units squared");      
        System.out.print("If this circle were a sphere, ");
        System.out.println("its volume would be: " + hat.getSphereVolume() + " units cubed");     

    }
}