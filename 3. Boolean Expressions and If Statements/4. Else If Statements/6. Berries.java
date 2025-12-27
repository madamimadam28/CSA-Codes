/*Write a program that gets a customer’s berry order. The customer should enter the first character of the berry they want.

The following berries can be ordered:

‘E’ for Elderberry
‘G’ for Gooseberry
‘L’ for Lingonberry
After getting their order, print out what they ordered. For example, if they ordered ‘E’, you should print, “You ordered Elderberry”.

If they enter something that is not E, G, or L, print, “Berry not recognized”.

There is one tricky thing about this program – the Scanner object will only read String, not char. To convert the string into a character, call charAt on the String in which you store the user’s response.

Recall that charAt takes one parameter - the index in the String - and returns the char at that position. Since you want the first letter, you want to pass index 0.

Since we are comparing char values, we can use == instead of .equals, as char values are primitive variables (and not objects).

Here are some examples of the output:
Example 1:

Enter the initial of the berry: 
E
You ordered Elderberry
Example 2:

Enter the initial of the berry: 
R
Berry not recognized */

import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial of the berry:");
        String s = input.next();
        char berry = s.charAt(0);
        
        // Remember the Scanner object will take whole strings
        // Extract the first character using charAt
        // Remember that characters can be compared using == 
        if (berry == 'E') {
            System.out.println("You ordered Elderberry");
        }
        else if (berry == 'G') {
            System.out.println("You ordered Gooseberry");
        }
        else if (berry == 'L') {
            System.out.println("You ordered Lingonberry");
        }
        else {
            System.out.println("Berry not recognized");
        }
        
        // Use comments to list the different
        // branches you will need before you write the code
    }
}