/* For this exercise, you are going to write a recursive function that counts down by twos to a Blastoff!

Your recursive function will not actually print. It will return a String that can be printed from the main function. Each recursive call will add on to that string.

In your main function, prompt the user for a starting value, then print the results.

Sample Outputs
Enter starting number: 
7
7 5 3 1 Blastoff!
Enter starting number: 
10
10 8 6 4 2 Blastoff! */

import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
       // Start here
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(countdown(num));
       
    }
    
    public static String countdown(int number)
    {
       
       // Base case - return Blastoff!
       if (number <= 0) {
           return "Blastoff!";
       }
       
       // Recursive call
       return Integer.toString(number) + " " + countdown(number - 2);
    }
}