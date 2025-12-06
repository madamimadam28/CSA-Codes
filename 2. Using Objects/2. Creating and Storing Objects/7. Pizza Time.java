/*In the previous lesson we asked you to think about what instance variables a pizza should have. Now in this problem, we’re going to help you write the class.

Instance Variables
The class should have three instance variables

private String type
private String toppings
private int size
Add the instance variables, and then add the constructor as specified below.



Constructor
It must have a constructor with the method signature

Pizza(String theType, String theToppings, int theSize)


Main
In your tester program you should create at least three different Pizza objects and print them out.

For example, your program might print

12 inch Veggie pizza with Tomatoes, onions, olives
15 inch Cheese pizza with Cheese
20 inch Meat pizza with Pepperoni, sausage, bacon */

public class Pizza
{
    // Add the instance variables here
    private String type;
    private String toppings;
    private int size;
    
    // Put the constructor here
    public Pizza (String pType, String pToppings, int pSize)
    {
        type = pType;
        toppings = pToppings;
        size = pSize;
    }
    
    
    // You don't need to do anything with this method
    // Used to print the object
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}

public class PizzaTester 
{
    public static void main(String[] args)
    {
        // Test your Pizza class here.
        Pizza p1 = new Pizza("Veggie", "Tomatoes, onions, olives", 12);
        Pizza p2 = new Pizza("Cheese", "Cheese", 15);
        Pizza p3 = new Pizza("Meat", "Pepperoni, sausage, bacon", 12);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}