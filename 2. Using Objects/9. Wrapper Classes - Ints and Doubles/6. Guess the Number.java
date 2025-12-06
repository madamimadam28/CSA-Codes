/* The Extremes class represents the range of Integer values.

Fill in the Extremes methods. In the constructor, set min and max to the minimum and maximum value of Integer. Use Integer.MIN_VALUE and Integer.MAX_VALUE. Also fill in the minQuotient and maxQuotient methods to return the quotient of the min/max value of Integer and the user’s guess.

Recall from math, the result of a division is the quotient (c in the formula below).

a / b = c
This means that

a = b * c
This will help you figure out what to print in main!

Main
In main, use the comments as a guide to ask the user to guess the maximum and minimum values. Compute the quotient of the values and the guess, then print out what the user would have to multiply their number by to get the actual min/max value.

Be aware that if you choose a number too big or too small, it will cause an error since the number cannot be stored.

The results in main should look something like this:

What do you think the maximum integer value is? 
999999
You'd need to multiply your number by 2147 to reach the max value!
What do you think the minimum integer value is? 
-5647382
You'd need to multiply your number by 380 to reach the min value! */

public class Extremes
{
    private Integer min;
    private Integer max;
    
    // Constructor
    public Extremes()
    {
        //Set min and max values 
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the quotient
    // max / number
    public Integer maxQuotient(Integer number)
    {
        return max / number;
    }

    // Returns the quotient
    // min / number
    public Integer minQuotient(Integer number)
    {
        return min / number;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}

import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Create an Extremes object
        Extremes ext = new Extremes();
        // Ask the user to guess the maximum value of an Integer
        System.out.println("What do you think the maximum integer value is? ");
        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        int maxi = input.nextInt();
        System.out.println("You'd need to multiply your number by " + ext.maxQuotient(maxi) + " to reach the max value!");
        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum integer value is? ");
        // Compute and display what they'd need to multiply by
        // to reach the minimum number
        int mini = input.nextInt();
        System.out.println("You'd need to multiply your number by " + ext.maxQuotient(mini) + " to reach the min value!");
    }
}