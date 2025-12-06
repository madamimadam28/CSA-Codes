/* This class represents a piñata. If you aren’t familiar with piñatas, according to Wikipedia, a piñata is a shape or animal made out of paper mache and is filled with candy or toys. People take turns trying to break open the piñata while wearing a blindfold!

The class only has a constructor without parameters. Your job is to add three more constructors so the user can design their own pinatas:

A constructor that allows users to customize all the instance variables.
A constructor that allows users to customize the color and the shape.
A constructor that allows users to customize the candy.
You can see the descriptions in the Pinata class. You can also see how the constructors should be able to be used in PinataTester.java.

Note: The additional constructors will take values as formal parameters. You do not need to prompt the user for these values.

After you make the constructors, you should be able to run your program without changing code in PinataTester.java.

In the constructors, use the default values given in the default constructors to fill in any values that were not passed as parameters.
 */

public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String chooseCandy, String chooseColor, String chooseShape)
    {
        candy = chooseCandy;
        color = chooseColor;
        shape = chooseShape;
    }
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String chooseColor, String chooseShape)
    {
        candy = "hard candy";
        color = chooseColor;
        shape = chooseShape;
    }
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String chooseCandy)
    {
        candy = chooseCandy;
        color = "rainbow";
        shape = "donkey";
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}

public class PinataTester
{
    public static void main(String[] args)
    {
        // Make Pinatas!
        Pinata ella = new Pinata();
        Pinata pete = new Pinata("chocolate", "blue", "star");
        Pinata sweetie = new Pinata("sour straws");
        
        // Print the pinatas
        System.out.println(ella);
        System.out.println(pete);
        System.out.println(sweetie);
        
        
    }
}