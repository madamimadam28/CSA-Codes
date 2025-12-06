/* The class Talker is a class that holds a piece of text. It has one instance variable, a String called speech that holds some text.

It has a few methods

outdoorVoice: Returns a String with the text in all uppercase letters (but does not change the instance variable!)
indoorVoice: Returns a String with the text in all lowercase letters (but does not change the instance variable!)
setSpeech: Updates the instance variable speech
toString: Returns a String representation of the object. This String should look like
"Text goes here," said the talker

To implement these methods, find a couple of methods in the Java Docs that will allow you to make a String all uppercase or all lowercase letters. */

public class Talker
{
    private String speech;
    
    // Constructor
    public Talker(String startingText)
    {
        speech = startingText;
    }
    
    // Returns the text in all uppercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String outdoorVoice()
    {
        return speech.toUpperCase();
    }
    
    // Returns the text in all lowercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String indoorVoice()
    {
        return speech.toLowerCase();
    }
    
    // Reset the instance variable to the new text
    public void setSpeech(String text)
    {
        speech = text;
    }
    
    // Returns a String representation of this object
    // The returned String should look like
    // 
    // "Text goes here," said the talker
    // 
    // The quotes should appear in the String
    // The text displayed should be the value of the instance variable
    public String toString()
    {
        return "\"" + speech + ",\" said the talker";
    }
}

import java.util.Scanner;

public class TalkerTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter some text: ");
        String words = input.nextLine();
        
        
        Talker talky = new Talker(words); 
        String yelling = talky.outdoorVoice();
        String whispers = talky.indoorVoice();
        
        System.out.println(talky);
        System.out.println("Yelling: " + yelling);
        System.out.println("Whispering: " + whispers);
        
    }
}