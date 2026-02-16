/* Create a method removeEvens that removes all even elements from an ArrayList of Integers.

Once the method is created, call it on the existing ArrayList in the main method, then print the results. 
Each element of the modified ArrayList should be printed on a new line using a loop. */

import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        // Pre-load the array list with values.
        for(int index = 1; index < 21; index++)
        {
            odds.add(index);
            odds.add(index);
        }
        // Call removeEvens on the ArrayList above
        removeEvens(odds);
        
        // Print the ArrayList to verify the even numbers have been removed
        for(int index = 0; index < odds.size(); index++)
        {
            System.out.println(odds.get(index));
        }
    }
    
    public static void removeEvens(ArrayList<Integer> array)
    {
        for (int i = 0; i < array.size(); ++i) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
    }
}