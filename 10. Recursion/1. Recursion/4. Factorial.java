/* For this problem, you are going to write a recursive function to calculate the factorial of a number. 
Remember, factorial is the product of an integer and all the integers below it. This function should be similar to the summing example we looked at earlier.

Note: Make sure you enter small numbers to test. Factorial will overflow the int value very quickly! */

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        
        System.out.println(calcFactorial(number));
    }
    
    public static int calcFactorial(int x)
    {
        // Write a base case
        if (x == 0) {
            return 1;
        }
        
        // Call the simplified solution
        return x * calcFactorial(x - 1);
    }
}