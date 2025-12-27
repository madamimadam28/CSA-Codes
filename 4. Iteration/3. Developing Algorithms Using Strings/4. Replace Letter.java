/*A programmer has written a method called replaceLetter that counts the amount of times a letter is present in a word. Your job is to modify this existing method to fulfill a new purpose.

Rather than count the instances of a letter in a String, write a program that replaces all except the first instance of one letter with another. You should directly modify replaceLetter to get this program to work. In the starter code, replaceLetter only has two parameter values. Your new version should have a third parameter to indicate which String value is replacing the existing letter. Add that third parameter to the end of the parameter list in the method header.

For example,

replaceLetter("hello", "l", "y")
returns

"helyo"
Sample output:

Enter a word: 
puppy
Enter the letter to be replaced: 
p
Enter the new letter: 
d

Result: puddy */

import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
        System.out.println("Enter the letter to be replaced: ");
        String replace = input.nextLine();
        System.out.println("Enter the new letter:");
        String change = input.nextLine();
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println("Result: " + replaceLetter(word, replace, change));
    }
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String letterToChange)
    {
        
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                count++;
                if (count == 1) {
                    continue;
                }
                String first = word.substring(0, i);
                String last = word.substring(i + 1);
                word = first + letterToChange + last;
            }
        }
        return word;
    }
}