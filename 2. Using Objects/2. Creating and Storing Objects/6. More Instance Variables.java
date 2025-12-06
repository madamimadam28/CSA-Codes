/*Now we are going to use more instance variables.
Here we have a class that represents a parakeet. Currently, the only instance variable (or field) is called name. You can make a new Parakeet object by passing the name to the constructor.

We want to add an instance variable, a String called color, that represents the parakeet’s color. Add the instance variable. Then include it as the second parameter to the constructor.

Test out your Parakeet class in ParakeetTester.java. Fill in the constructor to create a Parakeet object. If you name the bird “Ron” and make it “green”, then it should print

Ron is a green parakeet */

public class Parakeet 
{
    private String name;
    private String color;
    // Add an instance variable here for color.
    
    public Parakeet(String birdsName, String birdsColor)
    {
        name = birdsName;
        color = birdsColor;
    }
    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + color + " parakeet";
    }
}

public class ParakeetTester
{
    public static void main(String[] args)
    {
        Parakeet budgie = new Parakeet("Ron", "green");
        System.out.println(budgie);
    }
}