/*A palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

In this program, ask the user to input some text and print out whether or not that text is a palindrome.

Create the Boolean method isPalindrome which determines if a String is a palindrome, which means it is the same forwards and backwards. It should return a boolean of whether or not it was a palindrome.

Create the method reverse which reverses a String and returns a new reversed String to be checked by isPalindrome.

Both methods should have the signature shown in the starter code.

Sample output:

Type in your text: 
madam
Your word is a palindrome!
OR

Type in your text: 
hello
Not a palindrome :( */

import java.util.Scanner;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        // Create user input and let user know whether their word is a palindrome or not!
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = input.nextLine();
        System.out.println(isPalindrome(text) ? "Your word is a palindrome!" : "Not a palindrome :(");
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        // Your code goes here!
        return text.equals(reverse(text));
    }
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        // Your code goes here!
        String reverse = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            String c = text.substring(i, i+1);
            reverse += c;
        }
        return reverse;
    }

}