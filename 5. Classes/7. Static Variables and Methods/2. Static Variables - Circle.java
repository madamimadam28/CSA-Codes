public class Circle
{
    private static final double PI = 3.14159265359;
    
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    public double getArea()
    {
        return PI * radius * radius;
    }
    
}

public class CircleTester
{
    public static void main(String[] args)
    {
        Circle c = new Circle(5);
        System.out.println("Area of a circle with radius 5: " + c.getArea());   

        Circle c2 = new Circle(12);
        System.out.println("Area of a circle with radius 12: " + c2.getArea());   

    }
}