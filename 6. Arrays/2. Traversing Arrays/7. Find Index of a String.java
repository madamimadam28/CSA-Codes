/* In this exercise, you will need to create a static method called findString in the MatchingString class that should iterate over String[] arr looking for the exact match of the String that is passed as a parameter.

Return the index of the array where the String is first found; if it does not exist in the array, return -1.

For example, if the word “Karel” is passed in, your method would return 1. */

public class MatchingString
{

    private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};
    
    public static int findString(String myString)
    {
        // your code goes here!
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].equals(myString)) {
                return i;
            }
        }
        return -1;
    }
}

public class MatchingStringTester
{
   public static void main(String[] args)
   {
     System.out.println(MatchingString.findString("Karel"));
     
   }
}