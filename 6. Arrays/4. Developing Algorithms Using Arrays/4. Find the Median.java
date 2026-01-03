/* Write a method called median that returns the median value in the array.

If the length of the array is odd, the median is the value in the center of the array.

If the length of the array is even, the median is the average of the two numbers in the center.

You may assume the array passed into this method will never be empty.

Sample output:

The median value of the EVEN array is 19.5
The median value of the ODD array is 22.0 */

import java.util.*;
public class Median
{

    public static void main(String[] args)
    {
        int[] numbers1 = {12, 75, 3, 17, 65, 22};
        System.out.print("The median value of the EVEN array is " + median(numbers1));
        
        int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
        System.out.print("\nThe median value of the ODD array is " + median(numbers2));
        
    }

    public static double median(int[] arr)
    {
        // your code goes here!
        Arrays.sort(arr);
        int med1 = arr[arr.length / 2];
        int med2 = arr[arr.length / 2 - (arr.length % 2 == 0 ? 1 : 0)];
        double med = (double) (med1 + med2) / 2;
        return med;
    }
}