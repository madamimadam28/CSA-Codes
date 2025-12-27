/*This program reads input from the user to determine if the user can ride the rollercoasters and swim in the pools at the amusement park.

The program computes 2 boolean expressions in order to determine what the user is allowed to do:

boolean cannotRide = !(oldEnough && tallEnough);
and

boolean cannotSwim = !(canSwim || hasLifeJacket);
Convert these two lines into their equivalent De Morgan style boolean expressions. Negate the AND in the first statement and negate the OR in the second statement using De Morgan’s Laws.

Your resulting boolean expression for cannotRide should include both oldEnough and tallEnough. Your resulting boolean expression for cannotSwim should include both canSwim and hasLifeJacket.

The resulting program should still be able to successfully determine if the user can ride the rides and swim in the pool. */

import java.util.Scanner;

public class AmusementPark
{
    
    static int AGE_LIMIT = 12;
    static int HEIGHT_LIMIT = 48;
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age: "); 
        int age = input.nextInt();
        
        System.out.println("Enter your height in inches: ");
        int height = input.nextInt();
        
        boolean oldEnough = age >= AGE_LIMIT;
        boolean tallEnough = height >= HEIGHT_LIMIT;
        
        // CHANGE THIS LINE
        // Convert this boolean expression into its De Morgan equivalent
        boolean cannotRide = !oldEnough || !tallEnough;
        
        if(cannotRide)
        {
            System.out.println("You may not ride the rollercoasters.");
        }
        else
        {
            System.out.println("You may ride the rollercoasters!");
        }
        
        System.out.println("Can you swim? Enter true or false.");
        boolean canSwim = input.nextBoolean();
        
        System.out.println("Do you have a life jacket? Enter true or false.");
        boolean hasLifeJacket = input.nextBoolean();
        
        // CHANGE THIS LINE
        // Convert this boolean expression into its De Morgan equivalent
        boolean cannotSwim = !canSwim && !hasLifeJacket;
        
        if(cannotSwim)
        {
            System.out.println("You may not swim in the pool.");
        }
        else
        {
            System.out.println("You may swim in the pool!");
        }
    }
}