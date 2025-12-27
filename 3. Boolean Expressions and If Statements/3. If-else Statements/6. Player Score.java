/*Write a program that asks for the name and number of points scored by two basketball players.

Print out the player’s scores in alphabetical order according to the player’s names. Use the String method compareTo that was covered in lesson 2.8. You can also refer to the DOCS if you’ve forgotten how to use it, or to the JavaDocs here: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

Then print which player scored more points.

Here is some example output:

Enter player one's name: 
Tracy
Enter player two's name: 
Karel
Enter Tracy's score
13
Enter Karel's score
20
Karel scored 20 points
Tracy scored 13 points
Karel wins! */

import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        System.out.println("Enter player one's name:");
        String p1 = input.nextLine();
        System.out.println("Enter player two's name:");
        String p2 = input.nextLine();
        System.out.println("Enter " + p1 + "\'s score:");
        int s1 = input.nextInt();
        System.out.println("Enter " + p2 + "\'s score:");
        int s2 = input.nextInt();
        boolean winner = s1 > s2;
        if (p1.compareTo(p2) <= 0) {
            System.out.println(p1 + " scored " + s1 + " points");
            System.out.println(p2 + " scored " + s2 + " points");
        } else {
            System.out.println(p2 + " scored " + s2 + " points");
            System.out.println(p1 + " scored " + s1 + " points");
        }
        System.out.println((winner ? p1 : p2) + " wins!");
    }
}