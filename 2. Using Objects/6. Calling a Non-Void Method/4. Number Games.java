/* This class has a few methods for manipulating a number.

The object has been created for you. Follow the comments in the starter code to all the methods indicated and print out the return value of each method call.

Your output should look like this

25.0
50.0
2500.0
2500.0
2500.0 */

public class NumberGames
{
    
    // Keep track of the number
    private double num;
    
    // Constructor
    public NumberGames(double startingNumber)
    {
        num = startingNumber;
    }
    
    // Returns the number
    public double getNumber()
    {
        return num;
    }
    
    // Doubles the number
    // Returns the doubled number
    public double doubleNumber()
    {
        num *= 2;
        return num;
    }
    
    // Squares the number
    // Returns the squared number
    public double squareNumber()
    {
        num *= num;
        return num;
    }
    
    
}

public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);
        
        // Square the number
        // Print it out
        System.out.println(game.squareNumber());
        
        // Double the number
        // Print it out
        System.out.println(game.doubleNumber());
        
        // Square the number again
        // Print it out
        System.out.println(game.squareNumber());
        
        // Get the number and store the value
        // Print out your stored value 
        System.out.println(game.getNumber());
        
        // Get the number again then store and print
        // the value
        System.out.println(game.getNumber());
    }
}