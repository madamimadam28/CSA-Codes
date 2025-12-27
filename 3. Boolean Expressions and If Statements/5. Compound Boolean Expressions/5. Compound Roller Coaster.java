/*Modify your previous exercise to determine if the user can ride a rollercoaster.

To ride the rollercoaster, you must be at least 42 inches tall. You must also be at least 9 years old.

Ask the user how tall and how old they are. Use ONE if-else to determine if the user can ride the rollercoaster. Note how much cleaner this is and how much less repetition this method has.

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