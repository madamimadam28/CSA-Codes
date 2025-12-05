/*You and a friend are going out for the night. You have decided to treat your friend, so you’re paying for the whole night. However, since you have a fixed amount of money to spend on fun things, you need to track how much the outing will cost so you can update your budget.

Write a program to help yourself estimate what the total cost of the night will be. Your program will estimate the cost by taking the cost of the activities for one person and estimating how much it will cost for two people.

Here’s what you know about your activities:

Dinner - you know you typically get cheap dinners, so you expect that your friend’s dinner will be twice as expensive as yours
Laser Tag - since laser tag is charged per person, you and your friend will cost the same
Ice cream - you like the triple scoop, but your friend likes a single scoop. Your friend’s ice cream will cost 1/3 as much as yours. */

import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Start here!
        System.out.println("How much does dinner usually cost? ");
        double dinnerCost = input.nextDouble();

        System.out.println("How much is laser tag for one person? ");
        double laserCost = input.nextDouble();

        System.out.println("How much does a triple scoop cost? ");
        double iceCost = input.nextDouble();

        dinnerCost *= 3.0;
        laserCost *= 2.0;
        iceCost *= 4.0 / 3.0;
        
        System.out.println("Dinner : $" + dinnerCost);
        System.out.println("Laser Tag : $" + laserCost);
        System.out.println("Ice cream : $" + iceCost);
        System.out.println("Grand Total : $" + (dinnerCost + laserCost + iceCost));
    }
}