/* In this second exercise, we are going to look at the impact of overriding the equals and toString methods.

Start by copying over your TestEquals class from the previous exercise. You will not need to make any changes to this code.

Instead, you are going to add the following methods to your Ball class:

public String toString()
public boolean equals(Ball other) */

public class Ball
{
   private double diameter;
   
   public Ball(double diameter){
       this.diameter = diameter;
   }
   
    public double getDiameter(){
       return diameter;
   }
   
   // Write an equals method here that returns true if
   // the diameters are the same.
   public boolean equals(Ball other) {
       return this.diameter == other.diameter;
   }
   
   // Write a toString statement here, in this format:
   // Diameter: 2.75
   public String toString() {
       return "Diameter: " + diameter;
   }
   
}

public class TestEquals
{
    public static void main(String[] args)
    {
        System.out.println("** Object **");
        Object first = new Object();
        Object second = first;
        Object third = new Object();
        
        // Print out all three objects
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        // Print a true statement using 2 objects and ==
        System.out.println(first == second);
        
        // Print a false statement using 2 objects and ==
        System.out.println(first == third);
        
        // Print a true statement using 2 objects and .equals()
        System.out.println(first.equals(second));
        
        // Print a false statement using 2 objects and .equals()
        System.out.println(first.equals(third));
        
        System.out.println("** Ball **");
        
        
        Ball golfball = new Ball(1.5);
        Ball minigolf = golfball;
        Ball largeGolf = new Ball(1.5);
        
        // Print out all three objects
        System.out.println(golfball);
        System.out.println(minigolf);
        System.out.println(largeGolf);
        
         // Print a true statement using 2 objects and ==
        System.out.println(golfball == minigolf);
        
        // Print a false statement using 2 objects and ==
        System.out.println(golfball == largeGolf);
        
        // Print a true statement using 2 objects and .equals()
        System.out.println(golfball.equals(minigolf));
        
        // Print a false statement using 2 objects and .equals()
        System.out.println(golfball.equals(largeGolf));

    }
}