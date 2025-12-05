/*Write a program that:

Asks the user for two integers called int1 and int2
Divides the two ints
Prints the result
The trick here is that we want the division of the two ints to result in a double! Casting values to doubles will be necessary to solve this exercise.

 */

import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.print("First Int: ");
        int int1 = input.nextInt();

        input.nextLine();
        System.out.print("Second Int: ");
        int int2 = input.nextInt();
        
        double ans = (double) int1 / int2;
        System.out.print(ans);
    }
}