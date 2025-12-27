/*Write a program that helps a novice microwave chef decide how long to microwave frozen pizza rolls.

Use the Math class to generate a random integer between 90 and 240 to represent the number of seconds the pizza rolls will be microwaved.

Print out the number of seconds generated.

If the number is less than or equal to 120, print
Rolls will be the right temperature!

If the number is greater than 120, print
Rolls will be boiling hot!


If you’ve forgotten how to use random numbers, refer back to the slides:

Random Number Slides



Here are a few output examples
Example 1:

Microwaving for 94 seconds
Rolls will be the right temperature!
Example 2:

Microwaving for 166 seconds.
Rolls will be boiling hot! */

public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
       int seconds = (int)(Math.random() * 150 + 90);
       // Print the number of seconds
       System.out.println("Microwaving for " + seconds + " seconds");
       // Use two if statements to print the temperature
       System.out.println(seconds > 120 ? "Rolls will be boiling hot!" : "Rolls will be the right temperature!");
    }
}