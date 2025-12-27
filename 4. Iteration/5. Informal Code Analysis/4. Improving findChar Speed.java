/* In the Lesson Slides for this activity, we developed a method findChar for figuring out if a character was in a String.

The implementation was:

public boolean findChar(String string, String key)
    {
        for(int index = 0; index < string.length(); index++)
        {
            String character = string.substring(index,index+1);
            if(character.equals(key))
            {
                return true;
            }
        }
        return false;
    }
However, there is a much more efficient and simple algorithm that we can use to determine if a character is in a String. Using the method signature public boolean findChar(String string, String key), figure out a more efficient method with a lower execution count.

Hint: We’ve learned a couple of methods that can tell us what index a character is at - can we use those to determine if the character is in a String? */

public class findCharTester
{
    public static void main(String[] args)
    {
        // Start here!
        String word = "This is a sentence";
        String key = "a";
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + findChar(word, key));
    }
    
    public static boolean findChar(String string, String key)
    {
        // Write a more efficient version of isChar than the one in the exercise description
        // Use the hint!
        return string.indexOf(key) != -1;
    }
}