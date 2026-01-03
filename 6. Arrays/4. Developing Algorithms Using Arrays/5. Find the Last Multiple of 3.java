/*Write a method called findMultipleOfThree that returns the last value in the array that is a multiple of 3. If no multiple of 3 exists in the array, return -1.

For example, in the array

[4, 7, 9, 7, 12]
the last multiple of three is ‘12’.

Sample output:

The last multiple of 3 is 12 */

public class LastMultipleOfThree
{

    public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The last multiple of 3 is " + findMultipleOfThree(numbers1));
        
    }
    
    public static int findMultipleOfThree(int[] arr)
    {
        // your code goes here! 
        for (int i = arr.length - 1; i >= 0; --i) {
            if (arr[i] % 3 == 0) {
                return arr[i];
            }
        }
        return -1;
    }
}