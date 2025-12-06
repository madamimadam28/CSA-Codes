/*Implement the class WordGames.

It should have one instance variable, a String called word. It holds the word that will be manipulated with the following methods.

The methods should be

a constructor that takes a word to set word
public String scramble(): returns a string that scrambles the word by swapping the first half of the word and the last half of the word. For example, “turtle” becomes “tletur”. Find the middle of the word by using the length of the word and divide by 2. Remember that when you divide two integers, you get an integer. So you won’t have to worry about words with an even number of characters. Then use substring to divide the word in two halves.
public String bananaSplit(int insertIdx, String insertText): Returns a String that puts insertText in the word such that the first character of insertText is at index insertIdx. For example, if you want to put “BOO” and index 2 in the word “ghost”, this method would return “ghBOOost”. Note the index of “B” is 2. Use substring and concatenation to create the new String
public String bananaSplit(String insertChar, String insertText) : Returns a String that puts insertText in the word such that the first character of insertText is at the index of the first occurrence of insertChar. For example, if you want to put “BOO” in the word “ghost” and insertChar is ‘o’, this method would return “ghBOOost”. Note the index of “B” is the same index as the “o” was. Use substring, indexOf, and concatenation to create the new String
public String toString: Returns a string with square brackets around word. For example, if word is “fun”, toString should return “[fun]” */

import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter an word: ");
        String txt = input.nextLine();
        WordGames wg = new WordGames(txt);
        
        // Scramble it
        // Print out scrambled word
        System.out.println(wg.scramble());
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();
        
        // Add random word at index
        // Print out the word
        System.out.println(wg.bananaSplit(idx, word));
        
        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        System.out.println("Enter an character: ");
        char c = input.nextLine().charAt(0);
        System.out.println("Enter another word: ");
        String word2 = input.nextLine();
        System.out.println(wg.bananaSplit(c, word));
        
    }
}

public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        int mid = word.length() / 2;
        String first = word.substring(0, mid);
        String last = word.substring(mid);
        return last + first;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        String first = word.substring(0, insertIdx);
        String last = word.substring(insertIdx);
        return first + insertText + last;
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int insertIdx = word.indexOf(insertChar);
        String first = word.substring(0, insertIdx);
        String last = word.substring(insertIdx);
        return first + insertText + last;
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }
    
    
}