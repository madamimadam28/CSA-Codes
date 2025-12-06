/**
 * 
 * The GrilledCheese class describes a grilled cheese sandwich.
 * 
 * Every grilled cheese needs a type of bread, a type of cheese,
 * what temperature to cook the grilled cheese (should it be burned!?),
 */ 

public class GrilledCheese
{
    
    // Attributes of all Grilled Cheese objects
    private String bread;
    private double cookTemperature; // in Fahrenheit
    private String cheese;
    
    // Default Constructor
    // Makes a default grilled cheese
    public GrilledCheese()
    {
        bread = "white";
        cheese = "cheddar";
        cookTemperature = 250;
    }
    
    // Specialty Grilled Cheese
    // Note the order of the formal parameters does not
    // have to match the order of the class attributes
    public GrilledCheese(String breadType, String cheeseType, double temp)
    {
        bread = breadType;
        cheese = cheeseType;
        cookTemperature = temp;
    }
    
    // Specialty Grilled Cheese
    // Only customizes the cooking method
    // Still have to initialize all of the attributes!
    public GrilledCheese(double temp)
    {
        bread = "white";
        cheese = "cheddar";
        cookTemperature = temp;
    }
    
    // Specialty Grilled Cheese
    // Only customizes the ingredients
    // Still have to initialize all of the attributes!
    public GrilledCheese(String breadType, String cheeseType)
    {
        bread = breadType;
        cheese = cheeseType;
        cookTemperature = 250;
    }
    
    
    // Allows us to print the objects
    public String toString()
    {
        String res = "Grilled Cheese on " + bread + " bread with " + cheese;
        res += " cooked at " + cookTemperature + " degrees F";
        return res;
    }
    
}

public class GrilledCheeseTester
{
    public static void main(String[] args)
    {
        // Create a default Grilled Cheese
        GrilledCheese plain = new GrilledCheese();
        System.out.println(plain);
        
        
        // Customized ingredient GrilledCheese
        // Grilled Cheese on wheat with brie cheese
        GrilledCheese fancy = new GrilledCheese("wheat", "brie");
        System.out.println(fancy);
        
        // Custom cooked GrilledCheese
        // GrilledCheese on white bread with cheddar (by default)
        // Cooked at 400 degrees F (!!!)
        GrilledCheese burned = new GrilledCheese(400);
        System.out.println(burned);
        
        
        // Completely custom GrilledCheese
        // GrilledCheese on rye bread with cottage cheese cooked at 90.5 degrees F
        GrilledCheese specialOrder = new GrilledCheese("rye", "cottage cheese", 90.5);
        System.out.println(specialOrder);
        
        
        // What happens if you print the objects again?
        // Did any of their instance variable values change because of the other
        // objects?
        System.out.println(fancy);
    }
}