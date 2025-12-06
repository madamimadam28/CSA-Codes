/*This class represents a cup of coffee. Right now, the only way to make a cup of coffee is to specify exactly how the coffee should be made.

Add an overloaded constructor that does not take any parameters. This will allow us to make a “default” cup of coffee, which is how most people would expect a normal cup of coffee to be made.

In the overloaded constructor, set brewStrength to 2, sugar to true, and milkType to “nonfat”. */

/*
* This class represents a cup of coffee
* 
*/
public class Coffee
{
    // Instance Variables
    private int brewStrength; // on a scale of 1 to 5, 5 being the darkest
    private boolean sugar;    // has sugar (true) or does not (false)
    
    // takes the values "none", "whole", "nonfat", "soy", or "almond"
    private String milkType; 
    
    // Add a constructor for a default coffee (no parameters)
    // to initialize the instance variables
    // to a default cup of coffee
    public Coffee()
    {
        brewStrength = 2;
        sugar = true;
        milkType = "nonfat";
    }
    
    // Specialized constructor
    public Coffee(int howStrong, boolean hasSugar, String milk)
    {
        brewStrength = howStrong;
        sugar = hasSugar;
        milkType = milk;
    }
    
    
    // String representation to print
    // Do not modify this function
    public String toString()
    {
        return "Coffee brewed to level " + brewStrength + " with " + milkType + " milk. Sugar? " + sugar;
    }
    
}

public class CoffeeTester
{
    public static void main(String[] args)
    {
        // Create Specialized Coffee
        Coffee latte = new Coffee(4, false, "soy");
        System.out.println(latte);
        
        // Create a default coffee
        // This should work after you create the default
        // constructor
        Coffee plain = new Coffee();
        System.out.println(plain);
        
    }
}