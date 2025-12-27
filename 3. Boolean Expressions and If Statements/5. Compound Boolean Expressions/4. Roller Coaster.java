/*Write a program that determines if the user can ride a rollercoaster.

To ride the rollercoaster, you must be at least 42 inches tall. You must also be at least 9 years old.

Ask the user how tall and how old they are. Use a nested if statement to determine if they can ride the rollercoaster.

If they can, print “Welcome aboard!”
If they cannot, print “Sorry, you are not eligible to ride” */

import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int a = input.nextInt();
        System.out.println((h >= 42 && a >= 9) ? "Welcome aboard!" : "Sorry, you are not eligible to ride");
    }
}