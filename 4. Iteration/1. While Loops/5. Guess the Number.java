/* Write a program that has a user guess the height of Mt. Everest (in meters).

Mt. Everest is 8848 meters tall. The height has been stored in a variable called everestHeight. You’ll be able to access this variable from both main and guessTheHeight.

Allow the user to continually guess the height until they guess the height correctly.

Complete the method guessTheHeight that uses a while loop to ask the user for their
guess and compares it with everestHeight.

An example run of the program may look like this:

Do you know how tall Mt. Everest is?
See if you can guess the height in meters.
Guess the height: 
89
That's not it!
Guess the height: 
1000
That's not it!
Guess the height: 
7000
That's not it!
Guess the height: 
8848
Right! Mt. Everest is 8848 meters tall! */

import java.util.Scanner;
public class GuessTheNumber
{ 
    // This is the height of Mt. Everest.
    static int everestHeight = 8848;
    
    public static void main(String[] args)
    {
        
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");
        
        // This calls the static method guessTheHeight. Notice that the method is outside 
        // of the main method. 
        guessTheHeight();
        
    }
    
    public static void guessTheHeight() 
    {  
        // Your code goes here!
        // Allow the user to keep guessing until they guess the correct height
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Guess the height: ");
            int h = input.nextInt();
            
            if (h != 8848) {
                System.out.println("That's not it!");
            }
            else {
                System.out.println("Right! Mt. Everest is 8848 meters tall!");
                return;
            }
        }
    }
}