import java.util.ArrayList;

public class Shape
{
    private String name;
    
    public Shape(String name)
    {
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
}

public class Circle extends Ellipse
{
    private double radius;
    
    public Circle(double radius)
    {
        super("Circle", radius, radius);
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;   
    }
}

public class Ellipse extends Shape
{
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(String name, double semiMajorAxis, double semiMinorAxis)
    {
        super(name);
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }
    
    public Ellipse(double semiMajorAxis, double semiMinorAxis)
    {
        this("Ellipse", semiMajorAxis, semiMinorAxis);
    }
    
    public double getSemiMajorAxis()
    {
        return semiMajorAxis;   
    }
    
    public double semiMinorAxis()
    {
        return semiMinorAxis;   
    }
    
    public double getArea()
    {
        return Math.PI * semiMinorAxis * semiMajorAxis;
    }
}

public class Rectangle extends Shape
{
    private double width;
    private double height;
    
    public Rectangle(String name, double width, double height)
    {
        super(name);
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height)
    {
        this("Rectangle", width, height);
    }
    
    public double getArea()
    {
        return width * height;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}

public class Square extends Rectangle
{
    public Square(double sideLength)
    {
        super("Square", sideLength, sideLength);
    }
    
    public double getSideLength()
    {
        return super.getHeight();
    }
}
import java.util.ArrayList;

public class ShapesTester
{
    public static void main(String[] args)
    {
        Shape rectangle = new Rectangle(10, 20);
        
        Shape circle = new Circle(10);
        
        Shape ellipse = new Ellipse(5, 4);
        
        Shape square = new Square(6);
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(ellipse);
        shapes.add(square);
        
        for(int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).getName());
        }
        
    }
}