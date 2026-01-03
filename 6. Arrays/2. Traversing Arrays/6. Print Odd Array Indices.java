/* Here we have a program that creates an integer array. Fill in the method printOddIndices to print out just the elements stored at the odd indices of the array.

For example, the following code:

int[] arr = new int[] {10, 20, 30, 40};
printOddIndices(arr);
Should print out:

20
40 */

public class PrintOdd 
{
    public static void main(String[] args)
    {
        // Using the key word new int[] is an optional way
        // to create a new array. It forces Java to make a
        // distinct array.
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
        printOddIndices(oddIndexArray);
    }
    
    public static void printOddIndices(int[] arr)
    {
        // your code goes here!
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}