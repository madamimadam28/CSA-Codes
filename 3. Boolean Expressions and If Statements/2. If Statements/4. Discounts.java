/*Write a program that computes how much the user owes for parking in a particular parking garage.

The garage charges $4.25 per hour. However, the minimum amount they charge is $7. This means that if the total comes to something less than $7, the user is still charged $7.

In addition, if the user was parked for more than 3 hours, they earn a 25% discount.
For example, if they were parked for 4 hours, they would owe $17. But since they were parked for more than 3 hours, they get 25% off and only owe $12.75.

Follow the comments in main to ask the user how many hours they parked and compute their total.

Do not worry about formatting the total.

Here is some example output:
Example 1:

How many hours were you parked? 
5
You owe $15.9375
Example 2:

How many hours were you parked? 
1
You owe $7.0 */

import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask how many hours were you parked
        System.out.println("How many hours were you parked? ");
        double time = input.nextDouble();
        
        // Compute cost - $4.25
        double cost = time * 4.25;
        
        // If parked for more than 3 hours, apply 25% discount
        cost = time > 3 ? cost * 0.75 : cost;
        
        // If cost is under $7, set cost to $7
        cost = cost < 7 ? 7 : cost;
        
        // Display the final cost
        System.out.println("You owe $" + cost);
    }
}