/* In this problem, you’ll design and test a few classes that represent different pieces of clothing in a clothing store.

You’ll write the classes for TShirt, Jeans, Sweatshirt and Clothing.

The Clothing class should have two instance variables: one for the size of the clothing (a String), and another for the clothing’s color (also a string).

Clothing should have two accessor (getter methods) as well:

public String getSize()
public String getColor()
The Sweatshirt class should have a private instance variable (or field) to store whether or not it has a hood, and a corresponding getter method

public boolean hasHood()
The TShirt class should have a private field to store the fabric and a corresponding getter for that called

public String getFabric()
All Jeans should have the color blue.

The constructors should be of this format:

public Clothing(String size, String color)
public TShirt(String size, String color, String fabric)
public Sweatshirt(String size, String color, boolean hasHood)
public Jeans(String size)
Be sure and test your methods in the ClothingTester class by creating different objects and printing out the results. */

public class Clothing
{
    // Your code here
    private String size;
    private String color;
    
    public Clothing(String size, String color) {
        this.size = size;
        this.color = color;
    }
    
    public String getSize() {
        return size;
    }
    
    public String getColor() {
        return color;
    }
}

public class Jeans extends Clothing
{
    
    public Jeans(String size) {
        super(size, "blue");
    }
}

public class Sweatshirt extends Clothing
{

    private boolean hood;
    
    public Sweatshirt(String size, String color, boolean hasHood) {
        super(size, color);
        hood = hasHood;
    }
    
    public boolean hasHood() {
        return hood;
    }
}

public class TShirt extends Clothing
{
    private String fabric;
    
    public TShirt(String size, String color, String fabric) {
        super(size, color);
        this.fabric = fabric;
    }
    
    public String getFabric() {
        return fabric;
    }
}

public class ClothingTester
{
    public static void main(String[] args)
    {
        // Start here!
        Clothing c = new Clothing("medium", "red");
        Sweatshirt s = new Sweatshirt("large", "blue", false);
        TShirt t = new TShirt("medium", "green", "cotton");
        Jeans j = new Jeans("extra large");
        
        System.out.println("My Clothing is " + c.getSize() + " and the color " + c.getColor());
        System.out.println("My TShirt is " + t.getSize() + " and the color " + t.getColor() + " and is made out of " + t.getFabric());
        System.out.println("My Sweatshirt is " + s.getSize() + " and the color " + s.getColor() + " and it is " + s.hasHood() + " that it has a hood");
        System.out.println("My Jeans are " + j.getSize() + " and the color " + j.getColor());
    }
}