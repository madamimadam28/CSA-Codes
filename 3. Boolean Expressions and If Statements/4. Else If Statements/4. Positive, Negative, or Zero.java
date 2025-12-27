/*Write a program that asks the user for a number.

Use an if-else if- else to determine if the number is positive, negative, or zero. A number is considered positive if it is greater than to 0. A number is negative if it is less than 0.

Once you determine a number is not positive and not negative, that leaves one case left – the number must equal zero!

If it is positive, print “The number is positive!”
If it is negative, print “The number is negative!”
If it is zero, print “The number is neither positive nor negative!” */

import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num > 0 ? "he number is positive!" : num < 0 ? "The number is negative!" : "The number is neither positive nor negative!");
    }
}