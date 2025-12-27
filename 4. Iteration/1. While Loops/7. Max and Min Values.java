/*In this exercise, you will need to write a program that asks the user to enter different positive numbers.

After each number is entered, print out which number is the maximum and which number is the minimum of the numbers they have entered so far.

Stop asking for numbers when the user enters 0.

Possible output:

Enter a number or 0 to quit: 
200
Results so far:
Largest number: 200
Smallest number: 200
Enter a number or 0 to quit: 
4
Results so far:
Largest number: 200
Smallest number: 4
Enter a number or 0 to quit: 
1
Results so far:
Largest number: 200
Smallest number: 1
Enter a number or 0 to quit: 
300
Results so far:
Largest number: 300
Smallest number: 1
Enter a number or 0 to quit: 
25
Results so far:
Largest number: 300
Smallest number: 1
Enter a number or 0 to quit: 
0 */

import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        Scanner input = new Scanner(System.in);
        int maxi = 0, mini = 1000000000;
        System.out.println("Enter a number or 0 to quit: ");
        int num = input.nextInt();
        while (num != 0) {
            maxi = Math.max(maxi, num);
            mini = Math.min(mini, num);
            System.out.println("Results so far:");
            System.out.println("Largest number: " + maxi);
            System.out.println("Smallest number: " + mini);
            System.out.println("Enter a number or 0 to quit: ");
            num = input.nextInt();
        }
    }
}