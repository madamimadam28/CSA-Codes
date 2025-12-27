/*The program in this starter code does NOT work as intended. Your job is to find out why and fix the issue.

The program asks the user for two positive integers and will determine if both numbers are odd, if both numbers are even, or if one number is odd and the other number is even. Test and run the program to see how it behaves BEFORE diving into resolving the issue.

Take notes as you work. You’ll need to answer the following questions in the free response that follows.
1. What was wrong with the program?
2. What expression was the programmer trying to use that gave the error?
3. How did you resolve the error?

HINT: The error can be resolved in the OddEven class. */

/*
What was wrong with the program?

the bothEven method


What expression was the programmer trying to use that gave the error? Relate your answer to De Morgan's Laws.

return !(n1 % 2 == 0) && !(n2 % 2 == 0);

Using De Morgans, this returns !(n1 % 2 == 0 || n2 % 2 == 0), which doesn't return all even numbers


How did you resolve the error?

return (n1 % 2 == 0) && (n2 % 2 == 0); */

public class OddEven
{
    // Determines if num1 and num2 are both ODD
    public static boolean bothOdd(int n1, int n2)
    {
        return !(n1 % 2 == 0 || n2 % 2 == 0);
    }
    
    // Determines if num1 and num2 are both EVEN 
    public static boolean bothEven(int n1, int n2)
    {
        return n1 % 2 == 0 && n2 % 2 == 0;
    }
    
}

import java.util.Scanner;

public class OddEvenTester
{
        public static void main(String[] args)
        {
            //Ask user to input 2 positive integers
            Scanner input  = new Scanner(System.in);
            System.out.println("Enter 2 positive integers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            //Call bothOdd method in OddEven class to determine if both 
            //numbers are odd
            if(OddEven.bothOdd(num1, num2))
            {
                System.out.println("Both numbers are ODD.");
            }
            
            //Call bothEven in the OddEven class to determine if both
            //numbers are even
            else if(OddEven.bothEven(num1, num2))
            {
                System.out.println("Both numbers are EVEN.");
            }
            
            //Print out that one must be odd and one must be even since
            //they are not both odd or both even
            else
            {
                System.out.println("One number is ODD and one number is EVEN.");
            }
            
        }
}