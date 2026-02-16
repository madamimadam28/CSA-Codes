/* Write a recursive function that finds the minimum value in an ArrayList.

Your function signature should be

public static int findMinimum(ArrayList<Integer>)
One way to think of finding a minimum recursively is to think 
“the minimum number is either the last element in the ArrayList, or the minimum value in the rest of the ArrayList”.

For example, if you have the ArrayList

[1, 3, 2, 567, 23, 45, 9],

the minimum value in this ArrayList is either 9 or the minimum value in [1, 3, 2, 567, 23, 45]


Hint:
The trick is to remove the last element each time to make the ArrayList a little shorter. */

import java.util.*;

public class RecursiveMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        while (true){
             System.out.println("Please enter numbers. Enter -1 to quit: ");
             int number = input.nextInt();
             
             if (number == -1){
                 break;
             }
             else {
                 numbers.add(number);
             }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }
    
    public static int findMinimum(ArrayList<Integer> numbers)
    {
        
        // Base Case: What is the smallest ArrayList you can have? 
        // What is the minimum value of that array?
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
    
        // Recursive call: How do you find the minimum of the rest of the ArrayList?
        //                 (Not including the last element)
    
        // Return: The minimum of (the last element, minimum of the rest of the ArrayList)
        return Math.min(numbers.get(0), findMinimum(new ArrayList<Integer> (numbers.subList(1, numbers.size()))));
    }
}