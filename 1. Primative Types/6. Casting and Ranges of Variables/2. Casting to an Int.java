/* Write a program that:

Asks the user for a double variable called myDouble with a decimal value
Prints the double value to the screen.
Casts the double value to an int and store it as an int variable
Prints the int value to the screen
Adds 0.5 to the double variable.
Prints the new double value to the screen.
Casts the new double value to an int and store it in the int variable
Prints the new int value to the screen */

import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double: ");
        double myDouble = input.nextDouble();

        System.out.println(myDouble);

        int myInt = (int)myDouble;
        System.out.println(myInt);

        myDouble += 0.5;
        System.out.println(myDouble);
        
        myInt = (int)myDouble;
        System.out.println(myInt);
    }
}