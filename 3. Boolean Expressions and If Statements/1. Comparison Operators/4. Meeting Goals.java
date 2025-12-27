/*
Write a program that helps the user manage their goals.

Ask for two integers - the first is their goal amount and the second is the actual amount. The goal could be anything - eating 5 vegetables a day, spending 60 minutes outside, practing the flute for 45 minutes, etc.

Then create three boolean variables, as described below, to help the user determine whether they met their goal.

The first boolean should be true if the user went over their goal.

The second boolean should be true if the user was under their goal.

The third boolean should be true if the user met their goal exactly.

Then print the results (that is, the value of the booleans).

Here is an example:

Enter your goal: 
45
Enter your actual amount: 
35
Went over goal? false
Did not meet goal? true
Met goal exactly? false */

import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = input.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount: ");
        int amt = input.nextInt();
        // Compare numbers by creating three booleans
        boolean gr = amt > goal;
        boolean le = amt < goal;
        boolean eq = amt == goal;
        // Display results as instructed
        System.out.println("Went over goal? " + gr);
        System.out.println("Did not meet goal? " + le);
        System.out.println("Met goal exactly? " + eq);
    }
}