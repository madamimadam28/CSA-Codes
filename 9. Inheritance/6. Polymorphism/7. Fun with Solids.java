/* Given the Solid class, extend it with:

Pyramid
Cylinder
RectangularPrism
Sphere
Make sure to create the constructor and override the volume and surfaceArea methods.

Also extend RectangularPrism with Cube.

Note: The pyramid should be a rectangular pyramid.

HINT: You can look up formulas for how to compute the volume and surface area of a certain type of shape online. */

public class Solid
{
    private String myName;

    public Solid(String name)
    {
        myName = name;
    }

    public String getName()
    {
        return myName;
    }

    // This should be overriden in the subclass
    public double volume()
    {
        return 0;
    }
    
    // This should be overriden in the subclass
    public double surfaceArea()
    {
        return 0;
    }
}

import java.lang.Math;

public class Sphere extends Solid
{
    
    // Code goes here
    private double radius;
    
    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    public double volume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
    
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

public class RectangularPrism extends Solid
{
    
    // Code goes here
    private double length;
    private double width;
    private double height;
    
    public RectangularPrism(String name, double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double volume() {
        return length * width * height;
    }
    
    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
}

import java.lang.Math;

public class Pyramid extends Solid
{
    
    // Code goes here
    private double length;
    private double width;
    private double height;
    private double heightL;
    private double heightW;
    
    public Pyramid(String name, double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
        this.heightW = Math.pow(Math.pow(height, 2) + Math.pow(length / 2, 2), 0.5);
        this.heightL = Math.pow(Math.pow(height, 2) + Math.pow(width / 2, 2), 0.5);
    }
    
    public double volume() {
        return length * width * height / 3;
    }
    
    public double surfaceArea() {
        return length * width + length * heightL + width * heightW;
    }
}

import java.lang.Math;

public class Cylinder extends Solid
{
    
    // Code goes here
    private double radius;
    private double height;
    
    public Cylinder(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }
    
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double surfaceArea() {
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }
}

public class Cube extends RectangularPrism
{
    
    // Code goes here
    private double side;
    
    public Cube(String name, double side) {
        super(name, side, side, side);
    }
}

public class SolidTester
{
    public static void main(String[] args)
    {
        String name;
        double volume;
        double surfaceArea;

        // Pyramid constructor should take name, length, width, height
        // in that order
        Pyramid pyramid = new Pyramid("My pyramid", 1, 3, 5);
        name = pyramid.getName();
        volume = round(pyramid.volume(), 2);
        surfaceArea = round(pyramid.surfaceArea(), 2);
        System.out.println("Pyramid '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");

        // Sphere constructor should take name then radius
        Sphere sphere = new Sphere("My sphere", 4);
        name = sphere.getName();
        volume = round(sphere.volume(), 2);
        surfaceArea = round(sphere.surfaceArea(), 2);
        System.out.println("Sphere '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");
            
        // RectangularPrism constructor should take name, 
        // length, width, height in that order
        RectangularPrism rectangularPrism = new RectangularPrism("My rectangular prism",
            5, 8, 3);
        name = rectangularPrism.getName();
        volume = round(rectangularPrism.volume(), 2);
        surfaceArea = round(rectangularPrism.surfaceArea(), 2);
        System.out.println("RectangularPrism '" + name + "' has volume: " +
            volume + " and surface area: " + surfaceArea + ".");

        // Cylinder constructor should take name, radius, height
        // in that order
        Cylinder cylinder = new Cylinder("My cylinder", 4, 9);
        name = cylinder.getName();
        volume = round(cylinder.volume(), 2);
        surfaceArea = round(cylinder.surfaceArea(), 2);
        System.out.println("Cylinder '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");

        // Cube constructor should take name then side length
        Cube cube = new Cube("My cube", 4);
        name = cube.getName();
        volume = round(cube.volume(), 2);
        surfaceArea = round(cube.surfaceArea(), 2);
        System.out.println("Cube '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}