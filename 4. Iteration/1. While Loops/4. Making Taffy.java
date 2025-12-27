/* When you make taffy (a pliable candy), you must heat the candy mixture to 270 degrees Fahrenheit.

Write a program that will help a cook make taffy. The cook should be able to enter the temperature reading from their thermometer into the program. The program should continue to let the cook enter temperatures until the temperature is at least 270 degrees.

When the mixture reaches or exceeds 270 degrees, the program should stop asking for the temperature and print Your taffy is ready for the next step!.

Here is a sample run of what it should look like:

Starting Taffy Timer...
Enter the temperature: 40

The mixture isn't ready yet.
Enter the temperature: 100

The mixture isn't ready yet.
Enter the temperature: 200

The mixture isn't ready yet.
Enter the temperature: 300
Your taffy is ready for the next step!
Make sure that your output matches this sample run! */

import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
       Scanner input = new Scanner(System.in);
       // Your code starts here
       System.out.println("Starting Taffy Timer...");
       
       int temp = 0;
       while (true) {
           System.out.print("Enter the temperature: ");
           temp = input.nextInt();
           
           if (temp < 270) {
               System.out.println("\nThe mixture isn't ready yet.");
           }
           else {
               System.out.println("Your taffy is ready for the next step!");
               return;
           }
       }
    }
}