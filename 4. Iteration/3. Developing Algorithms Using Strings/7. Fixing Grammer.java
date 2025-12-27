/*Write a program that takes a String containing a text using the method signature

String useProperGrammar(String text)
Your method should replace the word ‘2’ with ‘to’ and return the updated text.

For example,

useProperGrammar("can you go 2 the store?")
should return

"can you go to the store?"
This method should also print out the number of grammatical errors that were fixed.

For example, for useProperGrammar("back 2 back 2 back"), the method would also print:

Fixed 2 grammatical errors:
In the main method, ask the user to input a String, and print the results of useProperGrammar using the user input. */

import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        System.out.println(useProperGrammar(sentence));
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        int cnt = 0;
        for(int i = 0; i < theText.length(); i++)
        {
            if(theText.substring(i, i+1).equals("2"))
            {
                String first = theText.substring(0, i);
                String last = theText.substring(i + 1);
                theText = first + "to" + last;
                cnt++;
            }
        }
        String fix = "Fixed " + cnt + " grammatical errors:";
        return theText + '\n' + fix;
    }
}