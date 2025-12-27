/*In this article , the American Heart Association recommends that adult men get no more than 36 grams of added sugar and adult women get no more than 25 grams of added sugar per day.

In this program, ask the user to enter the number of grams of added sugar they have eaten that day. Using 30 grams as the cut off point, use a boolean statement to state if the user can eat more sugar.

Here is what your output should look like:

How many grams of sugar have you eaten today? 
28
You can eat more sugar: true */

import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Ask the user for the grams of sugar
        Scanner input = new Scanner(System.in);
        System.out.println("How many grams of sugar have you eaten today? ");
        int grams = input.nextInt();
        // Use a boolean expression to print if they can eat more sugar
        System.out.println("You can eat more sugar: " + (grams < 30));
    }
}