/* For this exercise, you are given 3 Object class objects and 3 Ball class objects. 
In theory, all three Objects are the same and all 3 Ball objects are the same, but based on the way they are created and the way that Java evaluates equality, 
not all three objects will be equal.

Your task is to start by printing out the 6 Object and Ball objects. 
Remember, the Object class has a toString and since a Ball object extends the Object class, we should see similarities between the Object and Ball class.

After printing them out, you should notice which objects are the same. 
Write two true and two false statements for each group, one using == and one using .equals. Will these be the same? */

public class Ball
{
   private double diameter;
   
   public Ball(double diameter){
       this.diameter = diameter;
   }
   
    public double getDiameter(){
       return diameter;
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