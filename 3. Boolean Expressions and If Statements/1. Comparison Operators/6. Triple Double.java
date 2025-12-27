/*In basketball, a triple double is when you end a game with statistics in three different categories that are at least 10.

For example, you get a triple double if you have scored 10 points, got 10 rebounds, and had 10 assists in a game.

Create a program that asks the user to enter the number of points, rebounds, and assists for a player. You should use three separate nextInt method calls.

Create three different boolean variables representing each of the categories. Set each variable to an expression using relational operators that will evaluate to true if the user had at least 10 in that category and false otherwise.

Then, it should print each of the variables’ values.

Here is an example output

How many points did you score? 
5
How many rebounds did you get? 
8
How many assists did you have? 
10
You got 10 or more points: false
You got 10 or more rebounds: false
You got 10 or more assists: true */

import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score?");
        boolean points = input.nextInt() >= 10;
        System.out.println("How many rebounds did you score?");
        boolean rebounds = input.nextInt() >= 10;
        System.out.println("How many assists did you score?");
        boolean assists = input.nextInt() >= 10;
        // Create three boolean variables that
        // check if the stats are 10 or more
        
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        System.out.println("You got 10 or more points: " + points);
        System.out.println("You got 10 or more rebounds: " + rebounds);
        System.out.println("You got 10 or more assists: " + assists);
    }
}