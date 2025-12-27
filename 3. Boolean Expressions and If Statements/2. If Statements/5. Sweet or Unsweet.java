/*Write a program that asks the user what they want to drink. Then ask how many teaspoons of sugar they want.

Print out the order again to confirm it. You should print out the drink name. If they wanted more than 0 teaspoons of sugar, you should also print “with sugar”.

Remember to use print and println to help you.

Example output
Example without sugar:

What do you want to drink? 
green tea
How many teaspoons of sugar do you want? 
0

Confirming your order. You wanted: 
green tea
Example with sugar:

What do you want to drink? 
coffee
How many teaspoons of sugar do you want? 
4

Confirming your order. You wanted: 
coffee with sugar */

import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
        System.out.println("What do you want to drink? ");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want? ");
        int sugar = input.nextInt();
        System.out.println('\n' + "Confirming your order. You wanted: " );
        System.out.println(drink + (sugar > 0 ? " with sugar" : ""));
        
    }
}